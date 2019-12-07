package com.company;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.QuestionImpls.Question1imp;
import com.company.Questions.QuestionImpls.TakeStudentInfosHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        BookGenerator bookHelper = new BookGeneratorHelper();
//        List<Book> books = bookHelper.generateBooks();
//        StudentGenerator studentHelper = new StudentGeneratorHelper();
//        System.out.println(studentHelper.generateStudent(books));
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("ARE YOU STUDENT OR TEACHER\n{type student for student and admin for admin}\n: ");
        answer = sc.nextLine().toUpperCase();
        new Question1imp().getIfStudentOrAdmin(answer);

        //System.out.println(new StudentGeneratorHelper().generateStudent());
    }


}
