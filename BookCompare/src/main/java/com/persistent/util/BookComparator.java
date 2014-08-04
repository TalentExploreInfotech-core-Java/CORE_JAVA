package com.persistent.util;
import java.util.Comparator;
import com.persistent.model.*;
public class BookComparator implements Comparator<Book>{
	public int compare(Book book1, Book book2)
	{
		return book1.getAuthor().compareTo(book2.getAuthor());
	}
}
