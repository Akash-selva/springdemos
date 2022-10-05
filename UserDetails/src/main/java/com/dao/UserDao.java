package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.User;

@Repository
public class UserDao {
	
	@Autowired
	SessionFactory sf;
	
	public int addUserDetails(User user) {
		try {
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(user);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int updateUserDetails(User user) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		User u = session.get(User.class, user.getId());
		if(u==null) {
			return 0;
		}else {
			tran.begin();
				u.setSalary(user.getSalary());
				session.update(u);
			tran.commit();
			return 1;
		}
	}
	

	public List<User> getAllUser() {
		Session session = sf.openSession();
		TypedQuery qry = session.createQuery("select u from User u");
		List<User> listOfUser = qry.getResultList();
		return listOfUser;
	}
	

}
