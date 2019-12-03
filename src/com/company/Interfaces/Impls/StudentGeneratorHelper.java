package com.company.Interfaces.Impls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.StudentGenerator;

import java.util.Arrays;
import java.util.List;

public class StudentGeneratorHelper implements StudentGenerator {

    private Book book;
    @Override
    public Student generateStudent() {

        Student student1 = new Student();
        student1.setFirstName("Ahmet");
        student1.setLastName("Kozal");
        student1.setPhone("+903284239");

        Student student2 = new Student();
        student2.setFirstName("Hamza");
        student2.setLastName("Akkara");
        student2.setPhone("23423");

        Student student3 = new Student();
        student3.setFirstName("Enes");
        student3.setLastName("Abi");
        student3.setPhone("223432");

        Student student4 = new Student();
        student4.setFirstName("Ihsan");
        student4.setLastName("Gokalp");
        student4.setPhone("62454");

        return null;
    }
}
