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
            studentGenerator.generateStudent().get(0).booksList.add(bookGenerator.generateBooks().get(0));
            Question1 question1 = new Question1imp();
            Scanner sc = new Scanner(System.in);
            System.out.print("DEAR STUDENT WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                    "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
            String b = sc.nextLine();
            new TakeOrGiveBookHelper().askForTakeOrGiveBook(b);

        }
        if (a.equals("2")){
            new TakeOrGiveBookHelper().askForTakeOrGiveBook("1");

        }
        return null;
    }
}
