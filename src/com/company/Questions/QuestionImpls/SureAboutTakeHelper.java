package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.Question1;
import com.company.Questions.SureAboutTake;

import java.util.List;
import java.util.Scanner;

public class SureAboutTakeHelper implements SureAboutTake {
    BookGenerator bookGenerator = new BookGeneratorHelper();
    List<Book> books = bookGenerator.generateBooks();
    StudentGenerator studentGenerator = new StudentGeneratorHelper();
    @Override
    public String sureAbout(String a) {
        if (a.equals("1")){
            bookGenerator.generateBooks();
            System.out.println("YOU TOOK THE BOOK--> "+bookGenerator.generateBooks().get(0).getBookName());
            Question1 question1 = new Question1imp();
            Scanner sc = new Scanner(System.in);
            System.out.print("ARE YOU STUDENT OR TEACHER\n{type student for student and admin for admin}\n: ");
            String answer = sc.nextLine().toUpperCase();
            new Question1imp().getIfStudentOrAdmin(answer);

        }
        if (a.equals("2")){
            new TakeOrGiveBookHelper().askForTakeOrGiveBook("1");

        }
        return null;
    }
}
