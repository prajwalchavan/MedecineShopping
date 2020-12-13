package com.praj.omss.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import com.praj.omss.entity.User;

public class UserDAOImpl implements UserDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("omss");
	EntityManager manager = factory.createEntityManager();
	// EntityManager manager;
	public UserDAOImpl() {
		// manager= DBUtil.getConnection();
	}
	final static Logger logger = Logger.getLogger(UserDAOImpl.class);
	@Override
	public boolean register(int userId, String firstName, String lastName, String address, Long mobileNo, String Email,
			String password) {
		User u = new User();
		u.setAddress(address);
		u.setEmailId(Email);
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setUserid(userId);
		u.setPassword(password);
		u.setMobileNo(mobileNo);

		manager.getTransaction().begin();
		manager.persist(u);
		manager.getTransaction().commit();
		
		logger.info("User Registered");
		
		return true;
	}

	@Override
	public boolean login(int UserId, String loginPassword) {

		User d = this.fetchDet(UserId);
		if (d.getPassword().equals(loginPassword)) {
			logger.info("User Logged in");
			return true;
			
		} else
			logger.info("User Denied");
			return false;

	}

	@Override
	public String getName(int userId) {
		User d = this.fetchDet(userId);
		String name = d.getFirstName();
		logger.info("Got name");
		return name;
	}

	@Override
	public User logout(User user) {
		System.exit(0);
		logger.info("logged out");
		return null;
	}

	@Override
	public List<User> getUserList() {
		TypedQuery<User> query = manager.createQuery("select cc from User cc ", User.class);
		List<User> list = query.getResultList();
		logger.info("Getting Users");
		return list;
	}

	@Override
	public User fetchDet(int userid) {
		User d = manager.getReference(User.class, userid);
		logger.info("User Fetching");
		return d;
	}

}