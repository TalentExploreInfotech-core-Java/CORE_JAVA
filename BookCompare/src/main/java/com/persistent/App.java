package com.persistent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.persistent.model.Book;
import com.persistent.util.BookComparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("myBiography","Nishant",2000));
        books.add(new Book("yourStory","Puja",200));
        books.add(new Book("work","Niranjan",2000));
        System.out.println("books::"+books);
        Collections.sort(books);
        System.out.println("books::"+books);
        Collections.sort(books,new BookComparator());
        System.out.println("books::"+books);
    }
}
