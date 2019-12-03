package com.company;

import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Questions.QuestionImpls.Question1imp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String answer;
        Scanner sc = new Scanner(System.in);
        System.out.print("ARE YOU STUDENT OR TEACHER\n{type student for student and admin for admin}\n: ");
        answer = sc.nextLine().toUpperCase();
        new Question1imp().getIfStudentOrAdmin(answer);
    }


}
