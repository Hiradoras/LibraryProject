package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Questions.GiveBook;
import com.company.Questions.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class GiveBookHelper implements GiveBook {
    @Override
    public Book giveBook(String n, List<Student> students,List<Book> books) {
        boolean numeric = true;
        numeric = n.matches("-?\\d+(\\.\\d+)?");
        if (numeric){
            if (Integer.parseInt(n)>students.get(5).booksList.size()){
                System.out.println("!!!PLEASE TYPE ONLY NUMBER THAT YOU SEE!!!");
                new TakeOrGiveBookHelper().askForTakeOrGiveBook("2",students,books);
            }
            else{
                books.add(students.get(5).booksList.get(Integer.parseInt(n)-1));
                System.out.println("YOU GIVE BACK "+students.get(5).booksList.get(Integer.parseInt(n)-1).getBookName()+
                        " by "+students.get(5).booksList.get(Integer.parseInt(n)-1).getAuthor()+
                        " TO THE LIBRARY");
                students.get(5).booksList.remove(Integer.parseInt(n)-1);
                Scanner scanner = new Scanner(System.in);
                System.out.print("DEAR " + students.get(students.size()-1).getFirstName() + " WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                        "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
                String a = scanner.nextLine();
                TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
                takeOrGiveBook.askForTakeOrGiveBook(a, students,books);


            }
        }
        else{
            System.out.println("!!!PLEASE TYPE NUMBER ONLY!!!");
            new TakeOrGiveBookHelper().askForTakeOrGiveBook("2",students,books);
        }


        return null;
    }
}
