package com.ait.mtm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.entities.Book;

public class BookDAOImpl implements BookDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveBook(Book book) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			em.merge(book);
			t.commit();
			System.out.println("Book is inserted...........");
		}
		catch(Exception ex) {
			t.rollback();
			ex.printStackTrace();
		}
		finally {
			em.close();
		}

	}

	@Override
	public Book findBook(Integer bookId) {
		EntityManager em = factory.createEntityManager();
		Book book = em.find(Book.class, bookId);
		em.close();
		return book;
	}

	@Override
	public void removeBook(Integer bookId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			Book book = em.find(Book.class, bookId);
			em.remove(book);
			t.commit();
			System.out.println("Book is deleted...........");
		}
		catch(Exception e) {
			t.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}

	}

}
