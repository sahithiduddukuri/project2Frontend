package com.niit.DAO;

import java.util.List;

import com.niit.Model.Job;

public interface JobDAO {
	void addJob(Job job);
	List<Job> getAllJobs();
	Job getJob(int id);
	

}