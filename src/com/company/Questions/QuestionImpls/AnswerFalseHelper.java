package com.company.Questions.QuestionImpls;

import com.company.Questions.AnswerAdmin;
import com.company.Questions.AnswerFalse;
import com.company.Questions.AnswerStudent;

import java.util.Scanner;

public class AnswerFalseHelper implements AnswerFalse {
    @Override
    public void forFalseAnswer(String answer) {
        while((!answer.equals("STUDENT"))&&(!answer.equals("ADMIN"))){
            Scanner sc = new Scanner(System.in);
            System.out.print("!!!PLEASE TYPE ONLY STUDENT OR ADMIN!!!\n" +
                    "try again please\nARE YOU STUDENT OR TEACHER" +
                    "{type student for student and admin for admin}\n: ");
            String newAnswer = sc.nextLine().toUpperCase();
            forFalseAnswer(newAnswer.toUpperCase());
        }
        if (answer.equals("STUDENT")){
            AnswerStudent answerStudent = new AnswerStudentHelper();
            answerStudent.forStudent();
        }
        if (answer.equals("ADMIN")){
            AnswerAdmin answerAdmin = new AnswerAdminHelper();
            answerAdmin.forAdmin();
        }
    }
}
