package com.company.Interfaces.Impls;

import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;

import java.util.ArrayList;
import java.util.List;

public class BookGeneratorHelper implements BookGenerator {
    @Override
    public List<Book>  generateBooks() {
        List<Book> allBooks = new ArrayList<>();

        Book bookSherlockHolmes = new Book();
        bookSherlockHolmes.setBookName("Sherlock Holmes");
        bookSherlockHolmes.setAuthor("Sir Arthur Conan Doyle");
        allBooks.add(bookSherlockHolmes);

        Book bookTheGambler = new Book();
        bookTheGambler.setBookName("The Gambler");
        bookTheGambler.setAuthor("Dostoyevski");
        allBooks.add(bookTheGambler);

        Book bookTheIdiot = new Book();
        bookTheIdiot.setBookName("The Idiot");
        bookTheIdiot.setAuthor("Dostoyevksi");
        allBooks.add(bookTheIdiot);

        Book bookAnneKarenina = new Book();
        bookAnneKarenina.setBookName("Anne Karenina");
        bookAnneKarenina.setAuthor("Tolstoy");
        allBooks.add(bookAnneKarenina);

        Book bookWarAndPeace = new Book();
        bookWarAndPeace.setBookName("War and Peace");
        bookWarAndPeace.setAuthor("Tolstoy");
        allBooks.add(bookWarAndPeace);

        Book bookLordOfTheRings = new Book();
        bookLordOfTheRings.setBookName("Lord of The Rings");
        bookLordOfTheRings.setAuthor("J.R.R. TOLKIEN");
        allBooks.add(bookLordOfTheRings);
        return allBooks;
    }
}
