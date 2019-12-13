package com.company.Questions.QuestionImpls;
import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Questions.TakeBookLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TakeBookLogicHelper implements TakeBookLogic {
    @Override
    public void takeBookLogicly(String a,List<Student> students,List<Book> books) {
        boolean numeric = true;
        numeric = a.matches("-?\\d+(\\.\\d+)?");
        if (numeric){
            if(Integer.parseInt(a)-1 >= books.size()){
                // EGER ISTENEN ELEMENT YOKSA

                System.out.println("!!!NOT TYPE ANY NUMBER BUT NUMBER THAT YOU SEE!!!");
                new TakeOrGiveBookHelper().askForTakeOrGiveBook("1",students,books);
            }else{
                Scanner scanner = new Scanner(System.in);
                System.out.println("YOU CHOSE THE-->"+books.get(Integer.parseInt(a)-1).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+
                        books.get(Integer.parseInt(a)-1).getBookName()+
                        "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
                new SureAboutTakeHelper().sureAbout(scanner.nextLine(),a,students,books);
            }
        }
        else{
            System.out.println("!!!TYPE ONLY NUMBER PLEASE!!!");
            for(int i = 0; i < books.size(); i++) {
                System.out.println("["+(i+1)+"]"+books.get(i).getBookName()+" by: "+books.get(i).getAuthor());
            }
            Scanner scA = new Scanner(System.in);
            System.out.print("DEAR"+students.get(5).getFirstName()+" PRESS THE NUMBER OF THE BOOK THAT YOU WANT TO TAKE PLEASE: ");
            String answer = scA.nextLine();
            new TakeBookLogicHelper().takeBookLogicly(answer,students,books);
        }
    }
}
