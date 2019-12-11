package com.company.Questions.QuestionImpls;
import com.company.Classes.Book;
import com.company.Interfaces.BookGenerator;
import com.company.Interfaces.Impls.BookGeneratorHelper;
import com.company.Questions.TakeBookLogic;
import java.util.List;
import java.util.Scanner;
public class TakeBookLogicHelper implements TakeBookLogic {
    @Override
    public String takeBookLogicly(String a) {
        BookGenerator bookGenerator = new BookGeneratorHelper();
        bookGenerator.generateBooks();
        List<Book> books = bookGenerator.generateBooks();
        Scanner scan = new Scanner(System.in);
        int result = Integer.parseInt(a);

        if(result-1 >= books.size()){
            // EGER ISTENEN ELEMENT YOKSA
            Scanner n = new Scanner(System.in);
            System.out.println("!!!NOT TYPE ANY NUMBER BUT NUMBER THAT YOU SEE!!!");
            takeBookLogicly(n.nextLine());
        }else{
            System.out.println("YOU CHOSE THE-->"+books.get(result-1).getBookName()+"\nIF YOU ARE SURE ABOUT TAKE ["+
                    books.get(result-1).getBookName()+
                    "] TYPE [1], OR TYPE [2] TO SEE THE BOOK LIST AGAIN AND CHOOSE ONE OF THEM.");
            new SureAboutTakeHelper().sureAbout(scan.nextLine());
            // index exists
        }
        return null;
    }
}
