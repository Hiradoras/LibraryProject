package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Questions.TakeBook;

import java.util.List;
import java.util.Scanner;

public class TakeBookHelper implements TakeBook {
    @Override
    public String takeTheBook(String a) {
        BookGenerator bookGenerator = new BookGeneratorHelper();
        bookGenerator.generateBooks();
        List<Book> books = bookGenerator.generateBooks();
        if (a.equals("1")){
            Scanner scan = new Scanner(System.in);
            System.out.println("YOU CHOSE THE-->"+books.get(0).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+ books.get(0).getBookName()+
                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
            new SureAboutTakeHelper().sureAbout(scan.nextLine());
        }
        return null;
    }
}
