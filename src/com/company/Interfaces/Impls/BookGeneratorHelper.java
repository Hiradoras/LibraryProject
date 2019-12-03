package com.company.Interfaces.Impls;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;

import java.util.ArrayList;
import java.util.List;

public class BookGeneratorHelper implements BookGenerator {
    private Book book;
    @Override
    public Book generateBooks() {
        book = new Book();
        List<Book> allBooks = new ArrayList<>();

        Book bookSherlockHolmes = new Book();
        bookSherlockHolmes.setBookName("Sherlock Holmes (1)");
        bookSherlockHolmes.setAuthor("Sir Arthur Conan Doyle");
        allBooks.add(bookSherlockHolmes);

        Book bookTheGambler = new Book();
        bookTheGambler.setBookName("The Gambler (2)");
        bookTheGambler.setAuthor("Dostoyevski");
        allBooks.add(bookTheGambler);

        Book bookTheIdiot = new Book();
        bookTheIdiot.setBookName("The Idiot (3)");
        bookTheIdiot.setAuthor("Dostoyevksi");
        allBooks.add(bookTheIdiot);

        Book bookAnneKarenina = new Book();
        bookAnneKarenina.setBookName("Anne Karenina (4)");
        bookAnneKarenina.setAuthor("Tolstoy");
        allBooks.add(bookAnneKarenina);

        Book bookWarAndPeace = new Book();
        bookWarAndPeace.setBookName("War and Peace (5)");
        bookWarAndPeace.setAuthor("Tolstoy");
        allBooks.add(bookWarAndPeace);

        return null;
    }
}
