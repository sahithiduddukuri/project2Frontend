package com.niit.DAO;
import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Model.BlogPost;
import com.niit.Model.Notification;
@Repository
@Transactional
public class BlogPostDAOImpl implements BlogPostDAO {
	@Autowired
	private SessionFactory sessionFactory;
		public void addBlogPost(BlogPost blogPost) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			session.save(blogPost);
		}
		public List<BlogPost> listOfBlogs(int approved) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from BlogPost where approved="+approved);
			List<BlogPost> blogs=query.list();
			return blogs;
		}
		public BlogPost getBlog(int id) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			BlogPost blogPost=(BlogPost)session.get(BlogPost.class, id);
			return blogPost;
		}
		public void approve(BlogPost blog) {
			
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			blog.setApproved(true);
			session.update(blog);
			Notification notification=new Notification();
			notification.setBlogTitle(blog.getBlogTitle());
			notification.setApprovalStatus("Approved");
			notification.setEmail(blog.getPostedBy().getEmail());
			session.save(notification);
			
		}
		public void reject(BlogPost blog,String rejectionReason) {
			// TODO Auto-generated method stub
			Session session=sessionFactory.getCurrentSession();
			Notification notification=new Notification();
			notification.setBlogTitle(blog.getBlogTitle());
			notification.setApprovalStatus("Rejected");
			notification.setEmail(blog.getPostedBy().getEmail());
			notification.setRejectionReason(rejectionReason);
			session.save(notification);
			session.delete(blog);
			
			
		}
			
}