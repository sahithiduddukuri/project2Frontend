/**
 * 
 */
app.controller('UserController',function($scope,$rootScope,$location,UserService,$cookieStore){
	$scope.registerUser=function(user){ 
		console.log('entering usercontroller registerUser function in frontend' + user)
		UserService.registerUser(user).then(
		function(response){
			alert('Registered Successfully')
			$location.path('/home')
		},function(response){
			$scope.error=response.data
		})
		
		
	}
	$scope.login=function(user){
		console.log('UserController -> login')
		console.log(user)
		UserService.login(user).then(function(response){
			$rootScope.loggedInUser=response.data
			$cookieStore.put('currentuser',response.data)
			$location.path('/home')
		},function(response){
			console.log('error')
			$scope.error=response.data
			$location.path('/login')
		}
		)
	}
	
	if($rootScope.loggedInUser!=undefined) {
		UserService.getUser().then (
				function(response) {
					$scope.user=response.data
				},
				function(response) {
					if(response.status==401)
						$location.path('/login')
						else
							$scope.error=response.data;
				
	})
	}
				$scope.updateUser=function(user) {
					UserService.updateUser(user).then(function(response){
						alert('updated user profile successfully')
						$rootScope.loggedInUser=response.data
						$cookieStore.put('loggedInUser',response.data)
						$location.path('/home')
				},function(response) {
					if(response.status==401)
						$location.path('/login')
						else
							$scope.error=response.data
				})
				}
				
				$rootScope.searchUser=function(user) {
					UserService.searchUser(user).then(function(response) {
						$scope.users=response.data
					},function(response) {
						$scope.error=response.data
						$location.path('/login')
					})
				}
				})