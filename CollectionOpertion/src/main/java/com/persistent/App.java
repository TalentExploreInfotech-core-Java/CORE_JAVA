package com.persistent;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.persistent.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Map<String,Book> books = new HashMap<String,Book>();
       books.put("Biography",new Book("Biography", "Nishant Niranjan",2000));
       books.put("My Hobbies",new Book("My Hobbies", "Nishant",1000));
       books.put("Live life King Size",new Book("Live life King Size", "Niranjan",23000));
       
       for(Book book:books.values())
       {
    	   System.out.println("Books::"+book);
       }
       for(String key:books.keySet())
       {
    	   System.out.println("key::"+key+"  book::"+books.get(key));
       }
       for(Entry entry: books.entrySet())
       {
    	   System.out.println("entry-key::"+entry.getKey()+"  entry-value::"+entry.getValue());
       }
       
    }
}
