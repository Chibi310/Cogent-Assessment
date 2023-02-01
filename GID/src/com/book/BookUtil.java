package com.book;

import java.util.Scanner;

public class BookUtil 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner kbd = new Scanner(System.in);
		BookStore bookstore = new BookStore();
		
		System.out.println("Book Store Database");
		System.out.println("Please enter book data...");
		
		int BookID;
		String Title, Author, Category;
		double Price;
		boolean valid = false;
		
		for(int i = 1; i <= 3; i++)
		{
			System.out.println("Please input the data for book #" + i + " of " + 3 + ".");
			System.out.print("Enter Book ID: B"); 
			
			do
			{
				valid = false;
				BookID = kbd.nextInt(); kbd.nextLine();
				
				if(BookID > 9999 || BookID < 0)
					System.out.print("Invalid option, please input a number between 0 and 9999: B");
				else
					valid = true;
			}while(!valid);
			
			System.out.print("Please input the Title of the book: "); Title = kbd.nextLine();
			System.out.print("Please input the Author of the book: "); Author = kbd.nextLine();
			System.out.print("Please input the Category of the book: "); Category = kbd.nextLine();
			
			System.out.print("Please input the Price of the book: $");
			do
			{
				valid = false;
				Price = kbd.nextDouble(); kbd.nextLine();
				
				if(Price < 0.0)
					System.out.print("Please input a valid price, price must be over $0.00): $");
				else
					valid = true;
				
			}while(!valid);
			
			Book book = new Book(BookID, Title, Author, Category, (float)Price);
			bookstore.addBook(book);
		}
		
		
		System.out.print("Search by Title: ");
		bookstore.searchByTitle(kbd.nextLine());
		
		System.out.print("Search by Author: ");
		bookstore.searchByAuthor(kbd.nextLine());
		
		System.out.println("All books...");
		bookstore.displayAll();
	}
}