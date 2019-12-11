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
//        BookGenerator bookGenerator = new BookGeneratorHelper();
//        bookGenerator.generateBooks();
//        List<Book> books = bookGenerator.generateBooks();
//        if (a.equals("1")){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("YOU CHOSE THE-->"+books.get(0).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+ books.get(0).getBookName()+
//                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
//            new SureAboutTakeHelper().sureAbout(scan.nextLine());
//        }
//        if (a.equals("2")){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("YOU CHOSE THE-->"+books.get(1).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+ books.get(1).getBookName()+
//                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
//            new SureAboutTakeHelper().sureAbout(scan.nextLine());
//        }
//        if (a.equals("3")){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("YOU CHOSE THE-->"+books.get(2).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+ books.get(2).getBookName()+
//                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
//            new SureAboutTakeHelper().sureAbout(scan.nextLine());
//        }
//        if (a.equals("4")){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("YOU CHOSE THE-->"+books.get(3).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+ books.get(3).getBookName()+
//                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
//            new SureAboutTakeHelper().sureAbout(scan.nextLine());
//        }
//        if (a.equals("5")){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("YOU CHOSE THE-->"+books.get(4).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+ books.get(4).getBookName()+
//                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
//            new SureAboutTakeHelper().sureAbout(scan.nextLine());
//        }
//        if (a.equals("6")){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("YOU CHOSE THE-->"+books.get(5).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+ books.get(5).getBookName()+
//                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
//            new SureAboutTakeHelper().sureAbout(scan.nextLine());
//        }
//        if(!a.equals("1")&&!a.equals("2")&&!a.equals("3")&&!a.equals("6")&&!a.equals("4")&&!a.equals("5")&&!a.equals("6")){
//            System.out.println("PLEASE TYPE ONLY THE BOOK NUMBER THAT YOU SEE. NOT ANY ELSE NUMBER");
//            Scanner newScanner = new Scanner (System.in);
//            List<Book> books1 = bookGenerator.generateBooks();
//            for(int i = 0; i < books1.size(); i++) {
//                System.out.println("["+(i+1)+"]"+books1.get(i).getBookName()+" by: "+books1.get(i).getAuthor());
//            }
//            System.out.println("DEAR STUDENT PRESS THE NUMBER OF THE BOOK THAT YOU WANT TO TAKE PLEASE: ");
//            takeTheBook(newScanner.nextLine());
//        }
        return null;
    }
}
