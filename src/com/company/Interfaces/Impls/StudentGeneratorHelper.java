package com.company.Interfaces.Impls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.StudentGenerator;

import java.util.ArrayList;
import java.util.List;

public class StudentGeneratorHelper implements StudentGenerator {
    @Override
    public List<Student> generateStudent(List<Book> books) {
        List<Student> allStudents = new ArrayList<>();
        BookGenerator bookHelper = new BookGeneratorHelper();
        List<Book> bookAll = bookHelper.generateBooks();
        Student student1 = new Student();
        student1.setFirstName("Ahmet");
        student1.setLastName("Kozal");
        student1.setPhone("+903284239");
        allStudents.add(student1);
//        student1.books.add(bookAll.get(1));
//        student1.books.add(bookAll.get(2));

        Student student2 = new Student();
        student2.setFirstName("Hamza");
        student2.setLastName("Akkara");
        student2.setPhone("23423");
        allStudents.add(student2);
//        student2.books.add(books.get(3));
//        student2.books.add(books.get(1));

        Student student3 = new Student();
        student3.setFirstName("Enes");
        student3.setLastName("Abi");
        student3.setPhone("223432");
        allStudents.add(student3);
//        student3.books.add(books.get(5));
//        student3.books.add(books.get(2));

        Student student4 = new Student();
        student4.setFirstName("Ihsan");
        student4.setLastName("Gokalp");
        student4.setPhone("62645");
        allStudents.add(student4);
//        student4.books.add(books.get(4));
//        student4.books.add(books.get(3));

        return allStudents;
    }
}
