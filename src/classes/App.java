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

/**
 *
 * @author User
 */
public class App {
  public void run(){ 
      /*System.out.println("Привет!");*/
      
      Book book = new Book();
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
  }
}
