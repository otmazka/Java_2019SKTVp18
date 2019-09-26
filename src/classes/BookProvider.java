/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class BookProvider {
   public Book createBook(){//vozvrawaemqi metod
       Scanner scanner = new Scanner(System.in);
       Book book = new Book();
       System.out.println("Nazvanie knigi:");
       book.setTitle(scanner.nextLine());//vvodit stroku s klaviaturq, pomestit v pole book
       System.out.println("Avtor knigi:");
             book.setAuthor(scanner.nextLine());
             System.out.println("God izdanija knigi:");
       
       book.setYear(new Integer(scanner.nextLine()));
       return book;//vozvrawaem
       
   }
}
