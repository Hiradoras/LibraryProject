package com.company.Interfaces.Impls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.StudentGenerator;

import java.util.ArrayList;
import java.util.List;

public class StudentGeneratorHelper implements StudentGenerator {
    @Override
    public List<Student> generateStudent() {
        List<Student> allStudents = new ArrayList<>();
        BookGenerator bookHelper = new BookGeneratorHelper();
        Student student1 = new Student();
        student1.setFirstName("Ahmet");
        student1.setLastName("Kozal");
        student1.setPhone("+903284239");
        student1.booksList.add(bookHelper.getRandomBook());
        allStudents.add(student1);


        Student student2 = new Student();
        student2.setFirstName("Hamza");
        student2.setLastName("Akkara");
        student2.setPhone("23423");
        student2.booksList.add(bookHelper.getRandomBook());
        allStudents.add(student2);


        Student student3 = new Student();
        student3.setFirstName("Enes");
        student3.setLastName("Abi");
        student3.setPhone("223432");
        student3.booksList.add(bookHelper.getRandomBook());
        allStudents.add(student3);


        Student student4 = new Student();
        student4.setFirstName("Ihsan");
        student4.setLastName("Gokalp");
        student4.setPhone("62645");
        student4.booksList.add(bookHelper.getRandomBook());
        allStudents.add(student4);

        Student student5 = new Student();
        student5.setFirstName("Omer");
        student5.setLastName("Falan");
        student5.setPhone("62645");
        student5.booksList.add(bookHelper.getRandomBook());
        allStudents.add(student5);


        return allStudents;
    }
}
