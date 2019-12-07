package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.TakeStudentInfos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeStudentInfosHelper implements TakeStudentInfos {

    @Override
    public List<Student> getInfos() {
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        List<Book> books = new ArrayList<>();
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("WHAT IS YOUR NAME: ");
        student.setFirstName(sc.nextLine().toUpperCase());
        System.out.print("WHAT IS YOUR LAST NAME: ");
        student.setLastName(sc.nextLine().toUpperCase());
        System.out.print("TYPE YOUR PHONE NUMBER: ");
        student.setPhone(sc.nextLine());
        studentGenerator.generateStudent(books).add(student);

        //LISTEYE AL

        return studentGenerator.generateStudent(books);
    }
}
