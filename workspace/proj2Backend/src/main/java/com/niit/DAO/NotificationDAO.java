package com.niit.DAO;

import java.util.List;

import com.niit.Model.Notification;

public interface NotificationDAO {
	List<Notification> getNotificationNotViewed(String email);

	Notification getNotification(int id);

	void updateNotification(int id);
	

}