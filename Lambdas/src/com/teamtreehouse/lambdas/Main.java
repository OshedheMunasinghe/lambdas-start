package com.teamtreehouse.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        // write your code here
        // usingAnonymousInlineClass();
        //l();

        UseFoo useFoo = new UseFoo();
        String result = useFoo.add("Message", string -> "hello world");

        System.out.println(result);

    }

   /*  //sorting alphabetic order in books
    public static void usingAnonymousInlineClass() {
        List<Book> books = Books.all();
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        });
        for (Book book : books) {
            System.out.println(book);
        }
    }//end usingAnonymousInlineClass

    */

    /*
     public static void usingLambdasInLongForm() {
         List<Book> books = Books.all();
         Collections.sort(books, (Book b1, Book b2 ->{ return b1.getTitle().compareTo(b2.getTitle()}));
         for (Book book : books) {
             System.out.println(book);
         }
     }//end usingLambdasInLongForm

     */
    /*
    public static void l() {
        List<Book> books = Books.all();
        Collections.sort(books, (b1,b2) -> b1.getTitle().compareTo(b2.getTitle()));
        books.forEach(book -> System.out.println(book));
    }//end usingAnonymousInlineClass

     */

}//end class
