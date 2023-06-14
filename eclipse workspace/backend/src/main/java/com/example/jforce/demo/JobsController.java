package com.example.jforce.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jforce.demo.modal.Jobs;
import com.example.jforce.demo.services.IJobsService;

@RestController
public class JobsController {
	
	@Autowired 
	IJobsService iJobsService;
	
	@GetMapping(path = "/JobsList") 
	public List<Jobs> getPersons(){
		return iJobsService.listAll();
	}
	
	@DeleteMapping(path = "/deleteJobs/{id}")
	public void deleteJobs(@PathVariable(name = "id") Long id ) {
		iJobsService.delete(id);
	}
	
	@PostMapping (path = "/updateJobs")
	public Jobs updateJobs(@RequestBody Jobs jobs) {
		return iJobsService.update(jobs);
	}
	
	@PostMapping (path = "/insertJobs")
	public Jobs insertJobs(@RequestBody Jobs jobs) {
		return iJobsService.insert(jobs);
	}
	
	@PostMapping (path = "/insertAllJobs")
	public List<Jobs> insertAllJobs (@RequestBody List<Jobs> jobs) {
		return iJobsService.insertAll(jobs);
	}	
	

}
