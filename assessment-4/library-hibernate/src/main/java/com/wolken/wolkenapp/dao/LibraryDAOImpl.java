package com.wolken.wolkenapp.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wolken.wolkenapp.HibernateSessionFactory;
import com.wolken.wolkenapp.LibraryException;
import com.wolken.wolkenapp.dto.LibraryDTO;

public class LibraryDAOImpl implements LibraryDAO {
	Logger logger = Logger.getLogger("LibraryDAOImpl");

	@Override
	public boolean save(LibraryDTO libraryDTO) {
		// TODO Auto-generated method stub
		try {
		logger.info("inside save method in LibraryDAOImpl");
		Session session = HibernateSessionFactory.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(libraryDTO);
		transaction.commit();
		session.close();
		logger.info("complete  save method in LibraryDAOImpl");

		return true;
		}catch(Exception e) {
			logger.info("Uncomplete save method in LibraryDAOImpl");
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean updateByName(String name, String author) {
		// TODO Auto-generated method stub
		try {
		logger.info("inside update method in LibraryDAOImpl");
		// System.out.println("inside update ");
		Session session = HibernateSessionFactory.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.getNamedQuery("updateByName");
		query.setParameter("bookAuthor", author);
		query.setParameter("bookName", name);
		query.executeUpdate();
		session.close();
		logger.info("completed update method in LibraryDAOImpl");

		return true;
		}catch(Exception e ) {
			logger.info("inside catch block update method in LibraryDAOImpl");
			e.printStackTrace();
			
		}return false;

	}

	@Override
	public boolean deleteByName(String name) throws LibraryException {
		// TODO Auto-generated method stub
		try {
		logger.info("inside delete method in LibraryDAOImpl");
		if (name != null) {
			Session session = HibernateSessionFactory.getFactory().openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery("delete from LibraryDTO lr where lr.bookName=:bookName");
			query.setParameter("bookName", name);
			query.executeUpdate();
			session.close();
			logger.info("complete  delete method in dao");

			return true;
		} else {
			logger.error("custom exception shown");
			throw new LibraryException();
		}
		}catch(Exception e) {
			logger.info("inside catch block delete by name inside  LibraryDAOImpl");
			
		}
		return false;
		
	}

	@Override
	public List<LibraryDTO> getAll() {
		// TODO Auto-generated method stub
		try {
		logger.info("inside getall method in LibraryDAOImpl");
		Session session = HibernateSessionFactory.getFactory().openSession();
		Query query = session.getNamedQuery("selectAll");
		List<LibraryDTO> dtos = query.list();
		session.close();
		return dtos;
		}
		catch(Exception e) {
			logger.info("inside catch block inside getall inside LibraryDAOImpl");
			e.printStackTrace();
		}
		return null;
	}

}
