/**
 * 
 */
app.factory('NotificationService',function($http) {
	var notificationService={}
	notificationService.getNotificationsNotViewed=function() {
		 return $http.get("http://localhost:8181/proj2Backend/getnotifications")
	}
	
	notificationService.getNotification=function(id) {
		return $http.get("http://localhost:8181/proj2Backend/getnotification/"+id)
	}
	
	notificationService.updateNotification=function(id) {
		return $http.put("http://localhost:8181/proj2Backend/updatenotification/"+id)
	}
	
	return notificationService;
})