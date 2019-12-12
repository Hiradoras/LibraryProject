package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.ForAdmin;
import com.company.Questions.Question1;
import com.company.Questions.TakeOrGiveBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1imp implements Question1 {
    @Override
    public String getIfStudentOrAdmin(String answer) {
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        BookGenerator bookGenerator = new BookGeneratorHelper();
        List<Student> students = studentGenerator.generateStudent();
        List<Book> books = bookGenerator.generateBooks();
        if (answer.equals("STUDENT")) {
            Student student = new Student();
            Scanner scanner = new Scanner(System.in);
            System.out.print("WHAT IS YOUR NAME: ");
            student.setFirstName(scanner.nextLine());
            System.out.print("WHAT IS YOUR LAST NAME: ");
            student.setLastName(scanner.nextLine());
            System.out.print("WHAT IS YOUR PHONE NUMBER: ");
            student.setPhone(scanner.nextLine());
            students.add(student);
            System.out.print("DEAR " + students.get(students.size()-1).getFirstName() + " WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                    "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
            String a = scanner.nextLine();
            TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
            takeOrGiveBook.askForTakeOrGiveBook(a, students,books);
        }
        if (answer.equals("ADMIN")) {
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
        }
        if (!answer.equals("ADMIN") && !answer.equals("STUDENT")) {
            Scanner sc = new Scanner(System.in);
            System.out.print("!!!PLEASE TYPE ONLY STUDENT OR ADMIN!!!\n" +
                    "try again please\nARE YOU STUDENT OR TEACHER\n" +
                    "{type student for student and admin for admin}\n: ");
            String newAnswer = sc.nextLine().toUpperCase();
            new Question1imp().getIfStudentOrAdmin(newAnswer);
        }
        return null;
    }
}
