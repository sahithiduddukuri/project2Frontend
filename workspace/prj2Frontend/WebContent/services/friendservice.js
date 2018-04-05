/**
 * 
 */
app.factory('FriendService',function($http) {
	var friendService={}
	friendService.getAllSuggestedUsers=function() {
		return $http.get("http://localhost:8181/proj2Backend/suggestedusers")
	}
	
	friendService.addFriend=function(toId) {
		return $http.post("http://localhost:8181/proj2Backend/addfriend",toId)
	}
	
	friendService.getPendingRequests=function(){
		return $http.get("http://localhost:8181/proj2Backend/pendingrequests")
	}
	
	friendService.acceptRequest=function(request) {
		return $http.put("http://localhost:8181/proj2Backend/acceptrequest",request);
	}
	
	friendService.deleteRequest=function(request) {
		return $http.put("http://localhost:8181/proj2Backend/deleterequest",request)
	}
	
	friendService.getAllFriends=function() {
		return $http.get("http://localhost:8181/proj2Backend/friends")
	}
	return friendService;
})
