package com.company;

import com.company.Questions.ImplsForQuestions.IfStudentHelper;
import com.company.Questions.ImplsForQuestions.Question1Helper;
import com.company.Questions.ImplsForQuestions.QuestionForStudentHelper;

public class Main {
    public static void main(String[] args) {
        String s="";
        boolean checkIfSorA;
        new Question1Helper().askQuestion1(s);
        while(new IfStudentHelper().isStudent(checkIfSorA=true)){
            new QuestionForStudentHelper().askToStudent();
            checkIfSorA=false;
            if (checkIfSorA==false)break;
        }
        while (new IfStudentHelper().isAdmin(true)){

        }
        while (new IfStudentHelper().notRight(true)){
            new Question1Helper().askQuestion1(s);
            new IfStudentHelper().notRight(false);
        }
//        if (new IfStudentHelper().isStudent(true)){
//            new QuestionForStudentHelper().askToStudent();
//        }
//        if (new IfStudentHelper().isAdmin(true)){
//
//        }
//        if (new IfStudentHelper().notRight(true)){
//            new Question1Helper().askQuestion1(s);
//        }
    }
}
