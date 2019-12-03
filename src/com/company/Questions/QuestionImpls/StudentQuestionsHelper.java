package com.company.Questions.QuestionImpls;

import com.company.Classes.Student;
import com.company.Questions.StudentQuestions;

import java.util.Scanner;

public class StudentQuestionsHelper implements StudentQuestions {
    @Override
    public Student askToStudent() {
        new TakeStudentInfosHelper().getInfos();
        Scanner scs = new Scanner(System.in);
        System.out.print("WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
        String a = scs.nextLine();
        new TakeOrGiveBookHelper().askForTakeOrGiveBook(a);
        return null;
    }
}
