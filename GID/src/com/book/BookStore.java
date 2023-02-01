package com.book;

import java.util.ArrayList;

public class BookStore 
{
	ArrayList<Book> books;
	
	BookStore()
	{
		super();
		
		books = new ArrayList<>();
	}
	
	public void addBook(Book b) { books.add(b); }
	
	public void searchByTitle(String title)
	{
		for(Book B : books)
		{
			if(title.equals(B.getTitle()))
			{
				System.out.println("Book found:");
				System.out.println("Title: " + B.getTitle());
				System.out.println("Author: " + B.getAuthor());
				System.out.println("Book ID: " + B.getBookID());
				System.out.println("Category: " + B.getCategory());
				System.out.println("Price: " + B.getPrice());
				return;
			}
		}
		
		System.out.println("Title not found in Library...");
	}
	
	public void searchByAuthor(String author)
	{
		ArrayList<Book> temp = new ArrayList<>();
		for(Book B : books)
		{
			if(author.equals(B.getAuthor()))
				temp.add(B);
		}
		
		if(temp.size() != 0)
		{
			short i = 1;
			for(Book B: temp)
			{
				System.out.println("Book [" + i + "] of [" + temp.size() + "]: ");
				System.out.println("Title: " + B.getTitle());
				System.out.println("Author: " + B.getAuthor());
				System.out.println("Book ID: " + B.getBookID());
				System.out.println("Category: " + B.getCategory());
				System.out.println("Price: " + B.getPrice());
				i++;
			}
		}
		else
			System.out.println("Author not found in Library...");
		
	}
	
	public void displayAll()
	{
		int i = 1;
		if(books.size() == 0) { System.out.println("No Books In Library..."); return; }
		
		for(Book B: books)
		{
			System.out.println("Book [" + i + "] of [" + books.size() + "]: ");
			System.out.println("Title: " + B.getTitle());
			System.out.println("Author: " + B.getAuthor());
			System.out.println("Book ID: " + B.getBookID());
			System.out.println("Category: " + B.getCategory());
			System.out.println("Price: " + B.getPrice());
			i++;
		}
	}

}
