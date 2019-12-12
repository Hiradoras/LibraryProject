package com.company.Questions;

import com.company.Classes.Book;
import com.company.Classes.Student;

import java.util.List;

public interface TakeOrGiveBook {
    String askForTakeOrGiveBook(String a, List<Student> students, List<Book>books);
}
