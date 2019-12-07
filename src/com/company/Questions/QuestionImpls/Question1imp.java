package com.company.Questions.QuestionImpls;

import com.company.Classes.Student;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Questions.Question1;

import java.util.Scanner;

public class Question1imp implements Question1 {
    @Override
    public String getIfStudentOrAdmin(String answer) {
        if (answer.equals("STUDENT")){
            new StudentQuestionsHelper().askToStudent();
        }
        if (answer.equals("ADMIN")){
            System.out.println("YOU R AN ADMIN");
        }
        if (!answer.equals("ADMIN")&&!answer.equals("STUDENT")){
            Scanner sc = new Scanner(System.in);
            System.out.print("!!!PLEASE TYPE ONLY STUDENT OR ADMIN!!!\n" +
                    "try again please\nARE YOU STUDENT OR TEACHER\n" +
                    "{type student for student and admin for admin}\n: ");
            String newAnswer= sc.nextLine().toUpperCase();
            new Question1imp().getIfStudentOrAdmin(newAnswer);
        }
        return null;
    }
}
