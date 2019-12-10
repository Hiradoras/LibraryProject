package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.Question1;
import com.company.Questions.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class TakeOrGiveBookHelper implements TakeOrGiveBook {

    @Override
    public String askForTakeOrGiveBook(String a) {
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        if (a.equals("1")){
            BookGenerator bookGenerator = new BookGeneratorHelper();
            bookGenerator.generateBooks();
            List<Book> books = bookGenerator.generateBooks();
            for(int i = 0; i < books.size(); i++) {
                System.out.println("["+(i+1)+"]"+books.get(i).getBookName()+" by: "+books.get(i).getAuthor());
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("DEAR PRESS THE NUMBER OF BOOK THAT YOU WANT TO TAKE PLEASE: ");
            String answer = sc.nextLine();
            new TakeBookHelper().takeTheBook(answer);
        }
        if (a.equals("2")){
            System.out.println("BOOKS THAT YOU HAVE BELOW: ");
            System.out.println(studentGenerator.generateStudent().get(studentGenerator.generateStudent().size()-1).getFirstName());
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
