package com.company.Questions.QuestionImpls;

import com.company.Classes.Student;
import com.company.Questions.TakeStudentsInfos;

import java.util.Scanner;

public class TakeStudentsInfosHelper implements TakeStudentsInfos {
    String fName;
    @Override
    public Student askForInformation() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("WHAT IS YOUR NAME: ");
        student.setFirstName(sc.nextLine().toUpperCase());
        System.out.print("WHAT IS YOUR LAST NAME: ");
        student.setLastName(sc.nextLine().toUpperCase());
        System.out.print("TYPE YOUR PHONE NUMBER: ");
        student.setPhone(sc.nextLine());
        return null;
    }
}
