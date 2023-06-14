package com.example.jforce.demo.services;

import java.util.List;

import com.example.jforce.demo.modal.Jobs;

public interface IJobsService {
	
	
	List<Jobs> listAll();
		
	void delete(Long id );
		
	Jobs update(Jobs jobs);

	List<Jobs> insertAll(List<Jobs> newJobsList);

	Jobs insert(Jobs jobs);


}
