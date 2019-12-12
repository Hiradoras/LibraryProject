package com.company;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.AnswerAdmin;
import com.company.Questions.AnswerFalse;
import com.company.Questions.AnswerStudent;
import com.company.Questions.QuestionImpls.AnswerAdminHelper;
import com.company.Questions.QuestionImpls.AnswerFalseHelper;
import com.company.Questions.QuestionImpls.AnswerStudentHelper;
import com.company.Questions.QuestionImpls.Question1imp;

import javax.swing.text.DefaultStyledDocument;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookGenerator bookHelper = new BookGeneratorHelper();
        bookHelper.generateBooks();
        List<Book> books = bookHelper.generateBooks();
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        studentGenerator.generateStudent();
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("ARE YOU STUDENT OR TEACHER\n{type student for student and admin for admin}\n: ");
        answer = sc.nextLine().toUpperCase();
//
//
//        if (answer.toUpperCase().equals("STUDENT")){
//            AnswerStudent answerStudent = new AnswerStudentHelper();
//            answerStudent.forStudent();
//        }
//        if (answer.toUpperCase().equals("ADMIN")){
//            AnswerAdmin answerAdmin = new AnswerAdminHelper();
//            answerAdmin.forAdmin();
//        }
//        if (!answer.toUpperCase().equals("ADMIN") && !answer.toUpperCase().equals("STUDENT")){
//            AnswerFalse answerFalse = new AnswerFalseHelper();
//            answerFalse.forFalseAnswer(answer.toUpperCase());
//        }
        new Question1imp().getIfStudentOrAdmin(answer);

    }

}
