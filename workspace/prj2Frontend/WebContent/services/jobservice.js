/**
 * 
 */
app.factory('JobService',function($http) {
	var jobService={}
 
	jobService.addJob=function(job) {
		return $http.post("http://localhost:8181/proj2Backend/addjob",job)
	}
	
	jobService.getAllJobs=function() {
		return $http.get("http://localhost:8181/proj2Backend/alljobs");
	}
	
	jobService.getJob=function(id) {
		return $http.get("http://localhost:8181/proj2Backend/getjob/"+id)
	}		
		return jobService;

})