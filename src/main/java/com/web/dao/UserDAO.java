package com.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.web.entities.User;

@Repository(value = "userDAO")
public class UserDAO {

	private SessionFactory sessionFactory;

	public User loadUserByUsername(final String username) {
	
		List<User> users = new ArrayList<User>();
		Session session = this.sessionFactory.getCurrentSession();
		users = session.createQuery("from User where username=?").setParameter(0, username).list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}

	}
}
