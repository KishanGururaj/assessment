package com.wolken.wolkenapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import com.wolken.wolkenapp.dto.TeamDTO;

@Component
public class TeamDAOImpl implements TeamDAO {

	@Autowired
	LocalSessionFactoryBean bean;
	Logger logger = Logger.getLogger("TeamDAOImpl");

	public String save(TeamDTO teamDTO) {

		/*
		 * Configuration configuration=bean.getConfiguration();
		 * configuration.configure(); SessionFactory
		 * factory=configuration.buildSessionFactory();
		 */
		try {
			logger.info("inisde save method in TeamDAOImpl");
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			logger.info("inside save method using session in TeamDAOImpl");
			session.save(teamDTO);
			transaction.commit();
			logger.info("session close inside save method in TeamDAOImpl");
			session.close();
			return "data added";
		} catch (Exception e) {
			logger.info("inside catch block in save method TeamDAOImpl");
			e.printStackTrace();
		}
		return "data not added";
	}

	public String delete(String teamName) {
		// TODO Auto-generated method stub
		try {
			logger.info("inside delete method inside TeamDAOImpl");
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			logger.info("Using HQL query  for delete with named parameters inside TeamDAOImpl");
			Query query = session.createQuery("delete from TeamDTO tr where tr.teamName =:teamName");
			query.setParameter("teamName", teamName);
			query.executeUpdate();
			transaction.commit();
			logger.info("session closed inside delete method inside TeamDAOImpl");
			session.close();
			return "data delete ";
		} catch (NullPointerException e) {
			logger.info("inside catch block inside delete method inside TeamDAOImpl");
			e.printStackTrace();
		}
		return "data is not delete ";
	}

	public String updateCaptainByTeamName(String teamName, String teamCaptain) {
		// TODO Auto-generated method stub
		try {
			logger.info("inside update captain by team name inside TeamDAOImpl");
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			logger.info("Using HQL for update using named query and named parameters");
			Query query = session.getNamedQuery("updateByTeamName");
			query.setParameter("teamCaptain", teamCaptain);
			query.setParameter("teamName", teamName);
			query.executeUpdate();
			// transaction.commit();
			logger.info("session closed inside update captain by team name inside TeamDAOImpl");
			session.close();
			return "data updated successfully";
		} catch (NullPointerException e) {
			logger.info("inside catch block inside update captain by team name inside TeamDAOImpl");
			e.printStackTrace();
		}
		return "data is not updated successfully";
	}

	public List<TeamDTO> getAll() {
		// TODO Auto-generated method stub
		try {
			logger.info("inside getall method inside TeamDAOImpl ");
			SessionFactory factory = bean.getObject();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			logger.info("Using HQL for getall using named query and named parameters");
			Query query = session.getNamedQuery("selectAll");
			List<TeamDTO> dtos = query.list();
			logger.info("session closed inside getall method inside TeamDAOImpl");
			session.close();
			return dtos;
		} catch (Exception e) {
			logger.info("inside catch block inside getall method inside TeamDAOImpl");
			e.printStackTrace();
		}
		return null;
	}

}
