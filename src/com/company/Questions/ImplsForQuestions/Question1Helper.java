package com.company.Questions.ImplsForQuestions;

import com.company.Questions.Question1;

import java.util.Scanner;

public class Question1Helper implements Question1 {

    @Override
    public String askQuestion1(String a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ARE YOU A STUDENT OR ADMIN: ");
        a = sc.nextLine().toUpperCase();
        if (a=="STUDENT"){
            new IfStudentHelper().isStudent(true);
        }
        if (a=="ADMIN"){
            new IfStudentHelper().isAdmin(true);
        }
        else{
            new IfStudentHelper().notRight(true);
        }
        return a;
    }


}
