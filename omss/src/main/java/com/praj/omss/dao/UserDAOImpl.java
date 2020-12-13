package com.praj.omss.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.User;

public class UserDAOImpl implements UserDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("omss");
	EntityManager manager = factory.createEntityManager();

	// EntityManager manager;
	public UserDAOImpl() {
		// manager= DBUtil.getConnection();
	}

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
		return true;
	}

	@Override
	public boolean login(int UserId, String loginPassword) {

		User d = this.fetchDet(UserId); 
		if (d.getPassword().equals(loginPassword)) {
			return true;
		} else
			return false;

	}

	@Override
	public String getName(int userId) {
		User d = this.fetchDet(userId);
		String name = d.getFirstName();
		return name;
	}

	@Override
	public User logout(User user) {
		System.exit(0);
		return null;
	}

	@Override
	public List<User> getUserList() {
		TypedQuery<User> query = manager.createQuery("select cc from User cc ", User.class);
		List<User> list = query.getResultList();
		return list;
	}

	@Override
	public User fetchDet(int userid) {
		User d = manager.getReference(User.class, userid); 
		return d;
	}

}