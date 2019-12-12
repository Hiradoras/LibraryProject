package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.AnswerStudent;
import com.company.Questions.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class AnswerStudentHelper implements AnswerStudent {

    @Override
    public String forStudent() {
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        BookGenerator bookGenerator = new BookGeneratorHelper();
        List<Student> students = studentGenerator.generateStudent();
        List<Book> books = bookGenerator.generateBooks();
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
        return null;
    }
}
