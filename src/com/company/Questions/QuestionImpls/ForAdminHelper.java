package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.ForAdmin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForAdminHelper implements ForAdmin {
    @Override
    public Student seeStudentInfo(String a) {
        StudentGenerator sG = new StudentGeneratorHelper();

        boolean numeric = true;
        numeric = a.matches("-?\\d+(\\.\\d+)?");
        if (numeric){
            int intA = Integer.parseInt(a);
            if(intA-1>=sG.generateStudent().size()){
                // EGER ISTENEN ELEMENT YOKSA
                System.out.println("!!!PLEASE TYPE ONLY NUMBER THAT YOU SEE!!!");
                System.out.println("ALL STUDENT LIST BELOW: ");
                StudentGenerator studentGenerator = new StudentGeneratorHelper();
                for(int i = 0; i < studentGenerator.generateStudent().size(); i++) {
                    System.out.println((i+1)+". "+studentGenerator.generateStudent().get(i).getFirstName()+" "
                            +studentGenerator.generateStudent().get(i).getLastName());
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
                String name = sc.nextLine().toUpperCase();
                ForAdmin forAdmin = new ForAdminHelper();
                forAdmin.seeStudentInfo(name);


            }else{
                System.out.println(sG.generateStudent().get(intA-1).getFirstName()+" "+sG.generateStudent().get(intA-1).getLastName()+"\n"+
                        "Phone: "+sG.generateStudent().get(intA-1).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
                for(int i = 0; i < sG.generateStudent().get(intA-1).booksList.size(); i++) {
                    System.out.println(i+1+". "+sG.generateStudent().get(0).booksList.get(i).getBookName()+" b: "+
                            sG.generateStudent().get(0).booksList.get(i)
                                    .getAuthor());
                }
                System.out.println("ALL STUDENT LIST BELOW: ");
                StudentGenerator studentGenerator = new StudentGeneratorHelper();
                for(int i = 0; i < studentGenerator.generateStudent().size(); i++) {
                    System.out.println((i+1)+". "+studentGenerator.generateStudent().get(i).getFirstName()+" "
                            +studentGenerator.generateStudent().get(i).getLastName());
                }
                Scanner sc = new Scanner(System.in);
                System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
                String name = sc.nextLine().toUpperCase();
                ForAdmin forAdmin = new ForAdminHelper();
                forAdmin.seeStudentInfo(name);

            }
        }
        else{
            System.out.println("!!!PLEASE TYPE ONLY NUMBER THAT YOU SEE!!!");
            System.out.println("ALL STUDENT LIST BELOW: ");
            StudentGenerator studentGenerator = new StudentGeneratorHelper();
            for(int i = 0; i < studentGenerator.generateStudent().size(); i++) {
                System.out.println((i+1)+". "+studentGenerator.generateStudent().get(i).getFirstName()+" "
                        +studentGenerator.generateStudent().get(i).getLastName());
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("TYPE ONE STUDENT'S NUMBER TO SEE INFOS ABOUT:");
            String name = sc.nextLine().toUpperCase();
            ForAdmin forAdmin = new ForAdminHelper();
            forAdmin.seeStudentInfo(name);
        }







//        if (a.equals(sG.generateStudent().get(0).getFirstName().toUpperCase())){
//            System.out.println(sG.generateStudent().get(0).getFirstName()+" "+sG.generateStudent().get(0).getLastName()+"\n"+
//                    "Phone: "+sG.generateStudent().get(0).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
//            for(int i = 0; i < sG.generateStudent().get(0).booksList.size(); i++) {
//                System.out.println(i+1+". "+sG.generateStudent().get(0).booksList.get(i).getBookName()+" b: "+
//                        sG.generateStudent().get(0).booksList.get(i)
//                .getAuthor());
//            }
//        }
//        if (a.equals(sG.generateStudent().get(1).getFirstName().toUpperCase())){
//            System.out.println(sG.generateStudent().get(1).getFirstName()+" "+sG.generateStudent().get(1).getLastName()+"\n"+
//                    "Phone: "+sG.generateStudent().get(1).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
//            for(int i = 0; i <  sG.generateStudent().get(1).booksList.size(); i++) {
//                System.out.println(i+1+". "+sG.generateStudent().get(1).booksList.get(i).getBookName()+" by: "+
//                        sG.generateStudent().get(1).booksList.get(i).getAuthor());
//            }
//        }
//        if (a.equals(sG.generateStudent().get(2).getFirstName().toUpperCase())){
//            System.out.println(sG.generateStudent().get(2).getFirstName()+" "+sG.generateStudent().get(2).getLastName()+"\n"+
//                    "Phone: "+sG.generateStudent().get(2).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
//            for(int i = 0; i <  sG.generateStudent().get(2).booksList.size(); i++) {
//                System.out.println(i+1+". "+sG.generateStudent().get(2).booksList.get(i).getBookName()+" by: "+
//                        sG.generateStudent().get(2).booksList.get(i).getAuthor());
//            }
//        }
//        if (a.equals(sG.generateStudent().get(3).getFirstName().toUpperCase())){
//            System.out.println(sG.generateStudent().get(3).getFirstName()+" "+sG.generateStudent().get(3).getLastName()+"\n"+
//                    "Phone: "+sG.generateStudent().get(3).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
//            for(int i = 0; i <  sG.generateStudent().get(3).booksList.size(); i++) {
//                System.out.println(i+1+". "+sG.generateStudent().get(3).booksList.get(i).getBookName()+" by: "+
//                        sG.generateStudent().get(3).booksList.get(i).getAuthor());
//            }
//        }
//        if (a.equals(sG.generateStudent().get(4).getFirstName().toUpperCase())){
//            System.out.println(sG.generateStudent().get(4).getFirstName()+" "+sG.generateStudent().get(4).getLastName()+"\n"+
//                    "Phone: "+sG.generateStudent().get(4).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
//            for(int i = 0; i < sG.generateStudent().get(4).booksList.size(); i++) {
//                System.out.println(i+1+". "+sG.generateStudent().get(4).booksList.get(i).getBookName()+" by: "+
//                        sG.generateStudent().get(4).booksList.get(i).getAuthor());
//            }
//        }
        return null;
    }
}
