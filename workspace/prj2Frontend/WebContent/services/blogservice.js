/**
 * 
 */
app.factory('BlogService',function($http) {
	var blogService={}

blogService.addBlog=function(blog) {
		return $http.post("http://localhost:8181/proj2Backend/addblogpost",blog);
	}
	
	blogService.getBlogsWaitingForApproval=function() {
		return $http.get("http://localhost:8181/proj2Backend/getblogs/"+0)	
	}
	
	blogService.getBlogsApproved=function() {
		return $http.get("http://localhost:8181/proj2Backend/getblogs/"+1)
	}
	 blogService.getBlog=function(id) {
		 return $http.get("http://localhost:8181/proj2Backend/getblog/"+id)
	 }
	 blogService.hasUserLikedBlog=function(id) {
		 return $http.get("http://localhost:8181/proj2Backend/hasuserlikedblog/"+id)
	 }
	 blogService.approve=function(blog) {
		 return $http.put("http://localhost:8181/proj2Backend/approve",blog)
	 }
	 blogService.reject=function(blog,rejectionReason) {
		 return $http.put("http://localhost:8181/proj2Backend/reject/"+rejectionReason,blog)
	 }
	 blogService.updateLikes=function(id) {
		 return $http.put("http://localhost:8181/proj2Backend/updatelikes/"+id);
	 }
	 blogService.addComment=function(blogComment){
		    return $http.post("http://localhost:8181/proj2Backend/addcomment",blogComment)
		    }

		blogService.getBlogComments=function(id){
		    return $http.get("http://localhost:8181/proj2Backend/blogcomments/"+id)
		    }
	return blogService;
})
