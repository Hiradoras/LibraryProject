package com.company.Questions.QuestionImpls;

import com.company.Classes.User;
import com.company.Main;
import com.company.Questions.Question1;
import com.company.Questions.TakeStudentsInfos;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;

public class Question1imp implements Question1 {
    String bookControl;
    Boolean b;

    @Override
    public String getIfStudentOrAdmin(String answer) {
        if (answer.equals("STUDENT")){
            TakeStudentsInfosHelper takeInfos = new TakeStudentsInfosHelper();
            takeInfos.askForInformation();
            Scanner sc = new Scanner(System.in);
            System.out.print("WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                    "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
            String a = sc.nextLine();
            new TakeOrGiveBookHelper().askForTakeOrGiveBook(a);
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
