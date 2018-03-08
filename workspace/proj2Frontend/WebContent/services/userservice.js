/**
 * 
 */
app.factory('UserService',function($http){
	var userService={}
	
	userService.registerUser=function(user){
	
	
	console.log(user)
	return	$http.post("http://localhost:8181/proj2Backend/registeruser",user)
	}
	userService.login=function(user){
		console.log('userservice-> login')
		console.log(user)
		return $http.post("http://localhost:8181/proj2Backend/login",user)
	}
	 userService.logout=function()
	 {
	        return $http.put("http://localhost:8181/proj2Backend/logout")
	 }
	 
	 userService.getUser=function(){
		 return $http.get("http://localhost:8181/proj2Backend/getuser")
	 }
	 
	 userService.updateUser=function(user){
		 return $http.put("http://localhost:8181/proj2Backend/updateuser",user)
	 }
	return userService;
})