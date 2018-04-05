package com.niit.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.User;
@Repository
@Transactional

public class UserDAOImpl implements UserDAO{

	@Autowired

	private SessionFactory sessionFactory;

	      public UserDAOImpl(){

	    	  System.out.println("UserDaoImpl bean is created");

	      }

		

		public void registerUser(User user) {

			// TODO Auto-generated method stub

	    Session session = sessionFactory.getCurrentSession();

	    session.save(user);

		}



		public boolean isEmailUnique(String email){

			Session session = sessionFactory.getCurrentSession();

			User user=(User)session.get(User.class,email);

			if(user==null)

				return true;

			else

				return false;

		}



		public User login(User user) {

			Session session=sessionFactory.getCurrentSession();

			Query query=session.createQuery("from User Where email=? and password=?");

			query.setString(0,user.getEmail());

			query.setString(1,user.getPassword());

			return (User)query.uniqueResult();

		}
		public void update(User validUser) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			session.update(validUser);
		}

		public User getUser(String email) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			User user=(User)session.get(User.class, email);
			return user;
		}



		public void updateUser(User user) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			session.update(user);
		}
		
		public List<User> searchUser(String name) {
			// TODO Auto-generated method stub
			System.out.println("name");
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from User u where u.firstName like ? or u.lastName like ? or u.email like ?");
			query.setString(0,"%" + name + "%");
			query.setString(1,"%" + name + "%");
			query.setString(2,"%" + name + "%");
			List<User> users=query.list();
			return users;
		}
		

	}