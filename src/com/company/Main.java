package com.company;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.QuestionImpls.Question1imp;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookGenerator bookHelper = new BookGeneratorHelper();
        bookHelper.generateBooks();
        List<Book> books = bookHelper.generateBooks();
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        studentGenerator.generateStudent(books);
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("ARE YOU STUDENT OR TEACHER\n{type student for student and admin for admin}\n: ");
        answer = sc.nextLine().toUpperCase();
        new Question1imp().getIfStudentOrAdmin(answer);

    }

}
