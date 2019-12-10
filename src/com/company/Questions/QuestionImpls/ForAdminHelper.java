package com.company.Questions.QuestionImpls;

import com.company.Classes.Book;
import com.company.Classes.Student;
import com.company.Interfaces.Impls.StudentGeneratorHelper;
import com.company.Interfaces.StudentGenerator;
import com.company.Questions.ForAdmin;

import java.util.ArrayList;
import java.util.List;

public class ForAdminHelper implements ForAdmin {
    @Override
    public Student seeStudentInfo(String a) {
        StudentGenerator sG = new StudentGeneratorHelper();
        if (a.equals(sG.generateStudent().get(0).getFirstName().toUpperCase())){
            System.out.println(sG.generateStudent().get(0).getFirstName()+" "+sG.generateStudent().get(0).getLastName()+"\n"+
                    "Phone: "+sG.generateStudent().get(0).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
            for(int i = 0; i < sG.generateStudent().get(0).booksList.size(); i++) {
                System.out.println(i+1+". "+sG.generateStudent().get(0).booksList.get(i).getBookName()+" b: "+
                        sG.generateStudent().get(0).booksList.get(i)
                .getAuthor());
            }
        }
        if (a.equals(sG.generateStudent().get(1).getFirstName().toUpperCase())){
            System.out.println(sG.generateStudent().get(1).getFirstName()+" "+sG.generateStudent().get(1).getLastName()+"\n"+
                    "Phone: "+sG.generateStudent().get(1).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
            for(int i = 0; i <  sG.generateStudent().get(1).booksList.size(); i++) {
                System.out.println(i+1+". "+sG.generateStudent().get(1).booksList.get(i).getBookName()+" by: "+
                        sG.generateStudent().get(1).booksList.get(i).getAuthor());
            }
        }
        if (a.equals(sG.generateStudent().get(2).getFirstName().toUpperCase())){
            System.out.println(sG.generateStudent().get(2).getFirstName()+" "+sG.generateStudent().get(2).getLastName()+"\n"+
                    "Phone: "+sG.generateStudent().get(2).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
            for(int i = 0; i <  sG.generateStudent().get(2).booksList.size(); i++) {
                System.out.println(i+1+". "+sG.generateStudent().get(2).booksList.get(i).getBookName()+" by: "+
                        sG.generateStudent().get(2).booksList.get(i).getAuthor());
            }
        }
        if (a.equals(sG.generateStudent().get(3).getFirstName().toUpperCase())){
            System.out.println(sG.generateStudent().get(3).getFirstName()+" "+sG.generateStudent().get(3).getLastName()+"\n"+
                    "Phone: "+sG.generateStudent().get(3).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
            for(int i = 0; i <  sG.generateStudent().get(3).booksList.size(); i++) {
                System.out.println(i+1+". "+sG.generateStudent().get(3).booksList.get(i).getBookName()+" by: "+
                        sG.generateStudent().get(3).booksList.get(i).getAuthor());
            }
        }
        if (a.equals(sG.generateStudent().get(4).getFirstName().toUpperCase())){
            System.out.println(sG.generateStudent().get(4).getFirstName()+" "+sG.generateStudent().get(4).getLastName()+"\n"+
                    "Phone: "+sG.generateStudent().get(4).getPhone()+"\nBOOKS THAT STUDENT HAS: ");
            for(int i = 0; i < sG.generateStudent().get(4).booksList.size(); i++) {
                System.out.println(i+1+". "+sG.generateStudent().get(4).booksList.get(i).getBookName()+" by: "+
                        sG.generateStudent().get(4).booksList.get(i).getAuthor());
            }
        }
        return null;
    }
}
