/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class HistoryProvider {
    Scanner scanner = new Scanner(System.in);
    public History createHistory(List<Book>listBooks,List<Reader>listReaders){// dlja rabotq nuzen listBooks i listReaders
        
        History history = new History();
        System.out.println("Список книг: ");
        for(int i=0; i<listBooks.size();i++){
            System.out.printf("%d. Название книги: %s, автор: %s, год издания: %d%n"
                    ,i+1
                    ,listBooks.get(i).getTitle()
                    ,listBooks.get(i).getAuthor()
                    ,listBooks.get(i).getYear()
            );
        }
        System.out.print("Выберите номер выдаваемой книги:"); 
        int takeBookNum = scanner.nextInt();//s4itat nomer knigi v peremennuju takeBookNum
        Book book = listBooks.get(takeBookNum-1);
        System.out.println("Список читателей: ");
        int i=0;
        for(Reader r : listReaders){
            System.out.printf("%d. Имя и фамилия читателя: %s %s, email: %s%n"
                    ,i+1
                    ,r.getName()
                    ,r.getLastname()
                    ,r.getEmail()
            );
            i++;
        }
        System.out.print("Выберите номер читателя:"); 
        int readerNum = scanner.nextInt();
        Reader reader = listReaders.get(readerNum-1);
        history.setBook(book);
        history.setReader(reader);
        history.setTakeOn(new Date());//segodnjawnjaja data new Date()
        return history;
    }
    public void returnBook(List<History> listHistories){
        
        System.out.println("Список читаемых книг");
        int i=1;
        for(History history : listHistories){
            if(history.getReturnDate() == null){//kniga 4itaetsja, esli getReturnDate=null
                System.out.printf("%d. Читатель %s %s читает книгу %s%n"
                    ,i
                    ,history.getReader().getName()
                    ,history.getReader().getLastname()
                    ,history.getBook().getTitle()
                );
            }
            i++;
        }
        System.out.println("Выберите возвращаемую книгу: ");
        int numHistory = scanner.nextInt();
        listHistories.get(numHistory-1).setReturnDate(new Date());
        System.out.println("Книга \""
                +listHistories.get(numHistory-1).getBook().getTitle()
                +"\" возвращена."
        );
    }
}