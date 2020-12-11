package com.praj.omss.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.User;

public class UserDAOImpl implements UserDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("omss");
	EntityManager manager = factory.createEntityManager();
	//EntityManager manager;
	public  UserDAOImpl() {
		//manager= DBUtil.getConnection();
	}

	@Override
	public boolean register(int userId, String firstName, String lastName, String address, Long mobileNo,String Email, String password) {
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
		manager.getTransaction().commit(); //ab try kar2
		return true;
	}

	@Override
	public boolean login(int id, String password) {
		
		try{
			manager.getTransaction().begin();
			manager.persist(id); //
			
			

        TypedQuery<User> query = manager.createQuery("SELECT u FROM users u "
        		+ "WHERE u.userid = :login AND u.password = :password", User.class);        //idahr table ka column name nahi class ka property name ayega
        query.setParameter(1, id);
        query.setParameter(2, password); 
        try{ 
        	//User u= 
           query.getSingleResult();
            return true;
        }catch(javax.persistence.NoResultException e)
        {
            return false;
        }
		}
		finally {
			//manager.close();
		} 

	}

	@Override
	public User logout(User user) {
		 System.exit(0);
		 return null;
	}

	

}
