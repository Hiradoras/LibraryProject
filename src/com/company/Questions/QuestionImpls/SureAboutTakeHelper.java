package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Questions.SureAboutTake;
import com.company.Questions.TakeOrGiveBook;

import java.util.List;
import java.util.Scanner;

public class SureAboutTakeHelper implements SureAboutTake {
    BookGenerator bookGenerator = new BookGeneratorHelper();
    @Override
    public void sureAbout(String a,String bookCode,List<Student> students, List<Book> books) {
        if (a.equals("1")){
            TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
            int takenBook = Integer.parseInt(bookCode)-1;
            bookGenerator.generateBooks();
            System.out.println("YOU TOOK THE BOOK--> "+books.get(takenBook).getBookName());
            students.get(students.size()-1).booksList.add(books.get(takenBook));
            books.remove(takenBook);
            Scanner sc = new Scanner(System.in);
            System.out.print("DEAR "+students.get(5).getFirstName()+ " STUDENT WILL YOU GIVE A BOOK[1] OR TAKE A BOOK[2]?\n" +
                    "TYPE 1 TO GIVE A BOOK AND 2 TO TAKE A BOOK: ");
            String b = sc.nextLine();
            takeOrGiveBook.askForTakeOrGiveBook(b,students,books);
        }
        if (a.equals("2")){
            TakeOrGiveBook takeOrGiveBook = new TakeOrGiveBookHelper();
            takeOrGiveBook.askForTakeOrGiveBook("1",students,books);
        }
        if (!a.equals("1")&&!a.equals("2")){
            Scanner sc = new Scanner(System.in);
            System.out.println("PLEASE TYPE [1] OR [2] ONLY");
            sureAbout(sc.nextLine(),bookCode,students,books);
        }
    }
}
