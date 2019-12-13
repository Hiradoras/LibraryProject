package com.company.Interfaces;

import com.company.Classes.Book;

import java.util.List;
import java.util.Random;

public interface BookGenerator {
    List<Book> generateBooks();
    Book getRandomBook();
}
