package com.company.Questions.QuestionImpls;

import com.company.Questions.AnswerAdmin;
import com.company.Questions.AnswerFalse;
import com.company.Questions.AnswerStudent;

import java.util.IllegalFormatCodePointException;
import java.util.Iterator;
import java.util.Scanner;

public class AnswerFalseHelper implements AnswerFalse {
    @Override
    public String forFalseAnswer(String answer) {
        Scanner sc = new Scanner(System.in);
        System.out.print("!!!PLEASE TYPE ONLY STUDENT OR ADMIN!!!\n" +
                "try again please\nARE YOU STUDENT OR TEACHER" +
                "{type student for student and admin for admin}\n: ");
        if (sc.nextLine().toUpperCase().equals("STUDENT")){
            AnswerStudent answerStudent = new AnswerStudentHelper();
            answerStudent.forStudent();
        }
        if (sc.nextLine().equals("ADMIN")){
            AnswerAdmin answerAdmin = new AnswerAdminHelper();
            answerAdmin.forAdmin();
        }
        if ((!sc.nextLine().equals("STUDENT"))&&!(sc.nextLine().equals("ADMIN"))){
            Scanner newS = new Scanner(System.in);
            new AnswerFalseHelper().forFalseAnswer(newS.nextLine().toUpperCase());
        }
        return null;
    }
}
