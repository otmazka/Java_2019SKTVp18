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
import java.util.Scanner;

/**
 *
 * @author User
 */
public class App {
    public App() {
    }
  public void run(){ 
      Scanner scanner = new Scanner(System.in);
      boolean flagExit = true;
      do{
       System.out.println("Spisok zada4:");
       System.out.println("0. Zakrqt programmu");
       System.out.println("1. Novaja kniga");
       System.out.println("2. Novqj 4itatel ");
       System.out.println("3. Spisok knig ");
       System.out.println("4. Spisok 4itatelej");
       System.out.println("5. Vqdat knigu");
       System.out.println("6. Vernut knigu");
       System.out.println("Vvedite nomer zada4i:");
       String numberTask = scanner.nextLine();
       if(null != numberTask)switch (numberTask) {
              case "0":
                  flagExit = false;
                  System.out.println("Zakan4ivaem rabotu programmq");
                  break;
              case "1":
                  System.out.println("Novaja kniga");
                  BookProvider bookProvider = new BookProvider();
                 Book book = bookProvider.createBook();
                 System.out.println(book.toString());
                  break;
              case "2":
                  System.out.println("Vqpolnjaem 2 zada4u");
                  break;
              case "3":
                  System.out.println("Vqpolnjaem 3 zada4u");
                  break;
              case "4":
                  System.out.println("Vqpolnjaem 4 zada4u");
                  break;
              case "5":
                  System.out.println("Vqpolnjaem 5 zada4u");
                  break;
              case "6":
                  System.out.println("Vqpolnjaem 6 zada4u");
                  break;
              default:
                  break;
          }
      }while(flagExit);
  
       
      /*System.out.println("Привет!");*/
       
     /* Book book = new Book();
      book.setTitle("Voina i mir");
      book.setAuthor("Lev Tolstoy");
      book.setYear(2010);
      System.out.println(book.toString());
      book.setYear(2011);
      System.out.println(book.getTitle());
      System.out.println(book.getYear());
      
      Reader reader = new Reader();
      reader.setName("Svetlana");
      reader.setLastname("Sapoznikova");
      reader.setEmail("svetlankas@hot.ee");
      System.out.println(reader.toString());
      System.out.println(reader.getName());
      
      History history = new History();
      history.setBook(book);
      history.setReader(reader);
      history.setTakeOn(new Date());
       
      System.out.println("Выдана книга: "+history.toString());
      history.setReturnDate(new Date());
      System.out.println("Книга возвращена: "+history.toString());*/
  }

   
}
