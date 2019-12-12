package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.AnswerAdmin;
import com.company.Questions.ForAdmin;

import java.util.List;
import java.util.Scanner;

public class AnswerAdminHelper implements AnswerAdmin {
    @Override
    public String forAdmin() {
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        BookGenerator bookGenerator = new BookGeneratorHelper();
        List<Student> students = studentGenerator.generateStudent();
        List<Book> books = bookGenerator.generateBooks();

        System.out.println("ALL STUDENT LIST BELOW: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + studentGenerator.generateStudent().get(i).getFirstName() + " "
                    + studentGenerator.generateStudent().get(i).getLastName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
        String name = sc.nextLine().toUpperCase();
        ForAdmin forAdmin = new ForAdminHelper();
        forAdmin.seeStudentInfo(name);

        return null;
    }
}
