package com.company.Questions.QuestionImpls;
import com.company.Classes.Student;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.AnswerAdmin;
import com.company.Questions.ForAdmin;

import java.util.List;
import java.util.Scanner;

public class AnswerAdminHelper implements AnswerAdmin {
    @Override
    public void forAdmin() {
        StudentGenerator studentGenerator = new StudentGeneratorHelper();
        List<Student> students = studentGenerator.generateStudent();

        System.out.println("ALL STUDENT LIST BELOW: ");

        Integer counter = 1;
        for (Student student :students) {
            System.out.println("["+counter+"] "+student.getFirstName()+" "+student.getLastName());
            counter++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
        String name = sc.nextLine().toUpperCase();
        ForAdmin forAdmin = new ForAdminHelper();
        forAdmin.seeStudentInfo(name);
    }
}
