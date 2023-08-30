package com.ait.mtm.test;

import java.util.Arrays;
import java.util.List;

import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.dao.impl.BookDAOImpl;
import com.ait.mtm.entities.Author;
import com.ait.mtm.entities.Book;

public class Tester {

	public static void main(String[] args) {
		
		BookDAO  dao = new BookDAOImpl();
		/*
		 * create Book instances
		 */
		/*
		Book b1 = new Book();
		b1.setBookId(10101);  b1.setBookName("Learn Java");
		
		Book b2 = new Book();
		b2.setBookId(10102);  b2.setBookName("Boot Essentials");
		
		/*
		 * create Author instances
		 */
		/*
		Author a1 = new Author();
		a1.setAuthorId(90101); a1.setAuthorName("Garden");
		Author a2 = new Author();
		a2.setAuthorId(90102); a2.setAuthorName("Blake");
		Author a3 = new Author();
		a3.setAuthorId(90103); a3.setAuthorName("John");
		
		List<Author> list_of_authors_of_book1 = Arrays.asList(a1, a3);
		b1.setAuthors(list_of_authors_of_book1);
		
		List<Author> list_of_authors_of_book2 = Arrays.asList(a1,a2,a3);
		b2.setAuthors(list_of_authors_of_book2);
		
		dao.saveBook(b1);
		dao.saveBook(b2);
		*/
		/*
		 * call findBook()
		 */
		/*
		Book book_from_db  = dao.findBook(10101);
		System.out.println("Book id :" + book_from_db.getBookId());
		System.out.println("Book Name : " + book_from_db.getBookName());
		List<Author> authors = book_from_db.getAuthors();
		authors.forEach(System.out::println);
		*/
		
		/* 
		 * call removeBook()
		 */
		dao.removeBook(10101);
		
		

	}

}
