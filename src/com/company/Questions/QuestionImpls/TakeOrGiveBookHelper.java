package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Questions.Question1;
import com.company.Questions.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class TakeOrGiveBookHelper implements TakeOrGiveBook {

    @Override
    public String askForTakeOrGiveBook(String a) {

        if (a.equals("1")){
            List<Book> books = new BookGeneratorHelper().generateBooks();
            for(int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getBookName());
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("PRESS THE NUMBER OF BOOK THAT YOU WANT TO TAKE PLEASE: ");
            String answer = sc.nextLine();
            if (answer=="1"){
                System.out.println(books.get(0));
            }
        }
        if (a.equals("2")){
            System.out.println(a);
        }
        if (!a.equals("1")&&(!a.equals("2"))){
            Scanner sc = new Scanner(System.in);
            System.out.print("!!!PLEASE TYPE 1 OR 2 ONLY!!!\nWILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?" +
                    "\nTYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
            String b = sc.nextLine();
            new TakeOrGiveBookHelper().askForTakeOrGiveBook(b);
        }
        return null;
    }
}
