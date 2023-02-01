package com.book;

public class Book
{
	private String bookID, title, author, category;
	float price;
	
	Book(int bookid, String title, String author, String cat, float price)
	{	
		try
		{	
			if(bookid >= 0 && bookid <= 9999)
			{
				if(bookid < 10)
					bookID = "B000" + bookid;
				else if (bookid < 100)
					bookID = "B00" + bookid;
				else if (bookid < 1000)
					bookID = "B0" + bookid;
				else
					bookID = "B" + bookid;
			}
			else
				throw new InvalidBookException("Book ID Must be between 0 and 9999");
			
		} catch (Exception e) {e.printStackTrace(); }
		
		this.title = title;
		this.author = author;
		
		try
		{
		if(cat.equals("Science") || cat.equals("Fiction") || cat.equals("Technology") || cat.equals("Others"))
			category = cat;
		else
			throw new InvalidBookException("Book Category must be: Science, Fiction, Technology, or Others.");
		
		} catch(Exception e) { e.printStackTrace(); }
		
		try
		{
			if(price >= 0.0f)
				this.price = price;
			else
				throw new InvalidBookException("Invalid Price");
		} catch(Exception e) { e.printStackTrace(); }
	}

	public String getBookID() { return bookID; }

	public void setBookID(String bookID) { this.bookID = bookID; }

	public String getTitle() { return title; }

	public void setTitle(String title) { this.title = title; }

	public String getAuthor() { return author; }

	public void setAuthor(String author) { this.author = author; }

	public String getCategory() { return category; }

	public void setCategory(String category) { this.category = category; }

	public float getPrice() { return price; }

	public void setPrice(float price) { this.price = price; }
	
}



class InvalidBookException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public InvalidBookException(String EMSG)
	{
		super(EMSG);
	}
}