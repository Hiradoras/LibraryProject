package com.company.Interfaces.Impls;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;

import java.util.ArrayList;
import java.util.List;

public class BookGeneratorHelper implements BookGenerator {

    @Override
    public Book generateBooks() {
        List<Book> all = new ArrayList<>();

        Book bookSherlockHolmes = new Book();
        bookSherlockHolmes.setBookName("Sherlock Holmes (1)");
        bookSherlockHolmes.setAuthor("Sir Arthur Conan Doyle");
        all.add(bookSherlockHolmes);

        Book bookTheGambler = new Book();
        bookTheGambler.setBookName("The Gambler (2)");
        bookTheGambler.setAuthor("Dostoyevski");

        Book bookTheIdidot = new Book();
        bookTheIdidot.setBookName("The Idiot (3)");
        bookTheIdidot.setAuthor("Dostoyevksi");


        Book bookAnneKarenina = new Book();
        bookAnneKarenina.setBookName("Anne Karenina (4)");
        bookAnneKarenina.setAuthor("Tolstoy");


        Book bookWarAndPeace = new Book();
        bookWarAndPeace.setBookName("War and Peace (5)");
        bookWarAndPeace.setAuthor("Tolstoy");
        return null;
    }

}
