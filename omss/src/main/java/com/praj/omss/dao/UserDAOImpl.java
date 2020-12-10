package com.praj.omss.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.praj.omss.entity.User;
import com.praj.omss.util.DBUtil;

public class UserDAOImpl implements UserDAO {
	
	EntityManager manager;
	public  UserDAOImpl() {
		// TODO Auto-generated constructor stub
		manager= DBUtil.getConnection();
	}

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		return user;
	}

	@Override
	public boolean login(int id, String password) {
		
		try{
			manager.getTransaction().begin();
			manager.persist(id);

        TypedQuery<User> query = manager.createQuery("SELECT u FROM users u "
        		+ "WHERE u.user_id = :login AND u.password = :pass", User.class);        
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
			manager.close();
		} 

	}

	@Override
	public User logout(User user) {
		// TODO Auto-generated method stub
		 System.exit(0);
		 return null;
	}

	

}
