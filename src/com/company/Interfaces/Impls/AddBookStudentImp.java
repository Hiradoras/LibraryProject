package com.company.Interfaces.Impls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.AddBookStudent;
import com.company.Interfaces.StudentGenerator;

import java.util.List;

public class AddBookStudentImp implements AddBookStudent {

    @Override
    public List<Book> addBook(Book book) {
        Student student = new Student();
        student.booksOfStudent.add(book);
        return null;
    }
}
