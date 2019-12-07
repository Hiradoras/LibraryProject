package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question1imp implements Question1 {
    @Override
    public String getIfStudentOrAdmin(String answer) {
        List<Book> books = new ArrayList<>();
        if (answer.equals("STUDENT")){

            Student student = new Student();
            Scanner scanner = new Scanner(System.in);
            System.out.print("WHAT IS YOUR NAME: ");
            student.setFirstName(scanner.nextLine());
            System.out.print("WHAT IS YOUR LAST NAME: ");
            student.setLastName(scanner.nextLine());
            System.out.print("WHAT IS YOUR PHONE NUMBER: ");
            student.setPhone(scanner.nextLine());
            StudentGenerator studentGenerator = new StudentGeneratorHelper();
            studentGenerator.generateStudent(books).add(student);
            System.out.print("DEAR "+student.getFirstName()+" WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                    "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
            String a = scanner.nextLine();
            new TakeOrGiveBookHelper().askForTakeOrGiveBook(a);
        }
        if (answer.equals("ADMIN")){
            System.out.println("ALL STUDENT LIST BELOW: ");
            StudentGenerator studentGenerator = new StudentGeneratorHelper();
            for(int i = 0; i < studentGenerator.generateStudent(books).size(); i++) {
                System.out.println(studentGenerator.generateStudent(books).get(i).getFirstName()+" "
                        +studentGenerator.generateStudent(books).get(i).getLastName());
            }
        }
        if (!answer.equals("ADMIN")&&!answer.equals("STUDENT")){
            Scanner sc = new Scanner(System.in);
            System.out.print("!!!PLEASE TYPE ONLY STUDENT OR ADMIN!!!\n" +
                    "try again please\nARE YOU STUDENT OR TEACHER\n" +
                    "{type student for student and admin for admin}\n: ");
            String newAnswer= sc.nextLine().toUpperCase();
            new Question1imp().getIfStudentOrAdmin(newAnswer);

        }
        return null;
    }
}
