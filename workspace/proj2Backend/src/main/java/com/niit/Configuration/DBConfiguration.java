package com.niit.Configuration;

import java.util.Properties;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.niit.Model.User;
import com.niit.Model.BlogComment;
import com.niit.Model.BlogPost;
import com.niit.Model.BlogPostLikes;
import com.niit.Model.Chat;
import com.niit.Model.Friend;
import com.niit.Model.Job;
import com.niit.Model.Notification;
import com.niit.Model.ProfilePicture;
import com.niit.Model.User;

@Configuration
@EnableTransactionManagement
public class DBConfiguration {

	public DBConfiguration(){
		 System.out.println("DBConfiguration class is instantiated"); 
	  }
	  @Bean
		public SessionFactory sessionFactory() {
			LocalSessionFactoryBuilder lsf=
					new LocalSessionFactoryBuilder(getDataSource());
			Properties hibernateProperties=new Properties();
			hibernateProperties.setProperty(
					"hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.setProperty("hibernate.show_sql", "true");
			lsf.addProperties(hibernateProperties);
			Class classes[]=new Class[]{User.class,Job.class,BlogPost.class,Notification.class,BlogComment.class,BlogPostLikes.class,ProfilePicture.class,Friend.class,Chat.class};//class objects of all entities
		    return lsf.addAnnotatedClasses(classes).buildSessionFactory();
		}
		@Bean
		public DataSource getDataSource() {
		    BasicDataSource dataSource = new BasicDataSource();
		    dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		    dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		    dataSource.setUsername("madhu");
		    dataSource.setPassword("madhu");
		    return dataSource;
		    
		}
		@Bean
		public HibernateTransactionManager hibTransManagement(){
			return new HibernateTransactionManager(sessionFactory());
		}
	}