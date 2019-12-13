package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Questions.GiveBook;
import com.company.Questions.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class TakeOrGiveBookHelper implements TakeOrGiveBook {

    @Override
    public void askForTakeOrGiveBook(String a, List<Student> students, List<Book>books) {
        if (a.equals("1")) {
            if (books.size()==0){
                System.out.println("YOU TOOK ALL BOOKS IN THE LIBRARY. YOU NEED TO GIVE SOME BOOKS BACK. YOU WILL " +
                        "AUTOMATICALLY BE DIRECTED TO YOUR BOOK LIST");
                askForTakeOrGiveBook("2",students,books);
            }
            else{
                BookGenerator bookGenerator = new BookGeneratorHelper();
                bookGenerator.generateBooks();
                for (int i = 0; i < books.size(); i++) {
                    System.out.println("[" + (i + 1) + "]" + books.get(i).getBookName() + " by: " + books.get(i).getAuthor());
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("DEAR "+students.get(5).getFirstName()+" PRESS THE NUMBER OF THE BOOK THAT YOU WANT TO TAKE PLEASE: ");
                String answer = sc.nextLine();
                new TakeBookLogicHelper().takeBookLogicly(answer,students,books);
            }
        }
        if (a.equals("2")) {
            if(students.get(5).booksList.size()==0){
                // EGER ISTENEN ELEMENT YOKSA
                System.out.println("!!!YOU DON'T HAVE ANY BOOK!!!");
                Scanner newSc = new Scanner(System.in);
                System.out.print("DEAR " + students.get(students.size()-1).getFirstName() + " WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                        "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
                new TakeOrGiveBookHelper().askForTakeOrGiveBook(newSc.nextLine(),students,books);
            }
            else{
                System.out.println("BOOKS THAT YOU HAVE: ");
                for (int i =0; i<students.get(5).booksList.size();i++){
                    System.out.println("["+(i+1)+"]"+students.get(5).booksList.get(i).getBookName()+" by "+
                            students.get(5).booksList.get(i).getAuthor());
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("TYPE NUMBER OF THE BOOK THAT YOU WANT TO GIVE: ");
                GiveBook giveBook = new GiveBookHelper();
                giveBook.giveBook(sc.nextLine(),students,books);
            }
        }
        if (!a.equals("1") && (!a.equals("2"))) {
            Scanner sc = new Scanner(System.in);
            System.out.print("!!!PLEASE TYPE 1 OR 2 ONLY!!!\nWILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?" +
                    "\nTYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
            String b = sc.nextLine();
            askForTakeOrGiveBook(b, students,books);
            //new TakeOrGiveBookHelper().askForTakeOrGiveBook(b);
        }
    }
}
