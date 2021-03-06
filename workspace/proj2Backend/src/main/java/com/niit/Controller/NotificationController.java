package com.niit.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.DAO.NotificationDAO;
import com.niit.Model.ErrorClass;
import com.niit.Model.Notification;

@Controller
public class NotificationController {
	@Autowired
	private NotificationDAO notificationDao;
	public NotificationController() {
		System.out.println("NotificationController bean is created");
	}
@RequestMapping(value="/getnotifications",method=RequestMethod.GET)
public ResponseEntity<?> getNotificationsNotViewed(HttpSession session) {
	String email=(String)session.getAttribute("loginId");
	if(email==null) {
		ErrorClass error=new ErrorClass(5,"Unauthorized access");
		return new ResponseEntity<ErrorClass>(error,HttpStatus.UNAUTHORIZED);
		
	}
	List<Notification> notificationsNotViewed=notificationDao.getNotificationNotViewed(email);
	return new ResponseEntity<List<Notification>>(notificationsNotViewed,HttpStatus.OK);
}
@RequestMapping(value="/getnotification/{id}",method=RequestMethod.GET)
public ResponseEntity<?> getNotification(@PathVariable int id,HttpSession session) {
	String email=(String)session.getAttribute("loginId");
	if(email==null) {
		ErrorClass error=new ErrorClass(5,"Unauthorized access");
		return new ResponseEntity<ErrorClass>(error,HttpStatus.UNAUTHORIZED);
		
	}
	Notification notification=notificationDao.getNotification(id);
	return new ResponseEntity<Notification>(notification,HttpStatus.OK);
}
@RequestMapping(value="/updatenotification/{id}",method=RequestMethod.PUT)
public ResponseEntity<?> updateNotification(@PathVariable int id,HttpSession session) {
	String email=(String)session.getAttribute("loginId");
	if(email==null) {
		ErrorClass error=new ErrorClass(5,"Unauthorized access");
		return new ResponseEntity<ErrorClass>(error,HttpStatus.UNAUTHORIZED);	
	}
	notificationDao.updateNotification(id);
	return new ResponseEntity<Void>(HttpStatus.OK);
}
}