package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.ForAdmin;

import java.util.List;
import java.util.Scanner;

public class ForAdminHelper implements ForAdmin {
    @Override
    public void seeStudentInfo(String a) {
        StudentGenerator sG = new StudentGeneratorHelper();

        boolean numeric = true;
        numeric = a.matches("-?\\d+(\\.\\d+)?");
        if (numeric) {
            int intA = Integer.parseInt(a);
            if (intA - 1 >= sG.generateStudent().size()) {
                // EGER ISTENEN ELEMENT YOKSA
                System.out.println("!!!PLEASE TYPE ONLY NUMBER THAT YOU SEE!!!");
                System.out.println("ALL STUDENT LIST BELOW: ");
                StudentGenerator studentGenerator = new StudentGeneratorHelper();
                Integer counter = 1;
                for (Student student : studentGenerator.generateStudent()
                ) {
                    System.out.println("[" + counter + "] " + student.getFirstName() + " " + student.getLastName());
                    counter++;
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
                String name = sc.nextLine().toUpperCase();
                ForAdmin forAdmin = new ForAdminHelper();
                forAdmin.seeStudentInfo(name);


            } else {
                System.out.println(sG.generateStudent().get(intA - 1).getFirstName() + " " + sG.generateStudent().get(intA - 1).getLastName() + "\n" +
                        "Phone: " + sG.generateStudent().get(intA - 1).getPhone() + "\nBOOKS THAT STUDENT HAS: ");

                Integer count = 1;
                for (Book book : sG.generateStudent().get(intA - 1).booksList) {
                    System.out.println("["+count+"] "+book.getBookName()+" by "+book.getAuthor());
                    count++;
                }
                System.out.println("ALL STUDENT LIST BELOW: ");
                StudentGenerator studentGenerator = new StudentGeneratorHelper();
                Integer counter = 1;
                for (Student student : studentGenerator.generateStudent()
                ) {
                    System.out.println("[" + counter + "] " + student.getFirstName() + " " + student.getLastName());
                    counter++;
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
                String name = sc.nextLine().toUpperCase();
                ForAdmin forAdmin = new ForAdminHelper();
                forAdmin.seeStudentInfo(name);

            }
        } else {
            System.out.println("!!!PLEASE TYPE ONLY NUMBER THAT YOU SEE!!!");
            System.out.println("ALL STUDENT LIST BELOW: ");
            StudentGenerator studentGenerator = new StudentGeneratorHelper();
            Integer counter = 1;
            for (Student student : studentGenerator.generateStudent()
            ) {
                System.out.println("[" + counter + "] " + student.getFirstName() + " " + student.getLastName());
                counter++;
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
            String name = sc.nextLine().toUpperCase();
            ForAdmin forAdmin = new ForAdminHelper();
            forAdmin.seeStudentInfo(name);
        }
    }
}
