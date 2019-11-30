package com.company.Questions.ImplsForQuestions;

import com.company.Questions.Question1;
import com.company.Questions.QuestionsForStudent;

import java.util.Scanner;

public class QuestionForStudentHelper implements QuestionsForStudent {
    @Override
    public String askToStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]: ");
        String s = sc.nextLine();
        System.out.println(s);
        return s;
    }
}
