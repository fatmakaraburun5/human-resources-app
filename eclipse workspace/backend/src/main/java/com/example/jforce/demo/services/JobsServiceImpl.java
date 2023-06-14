package com.example.jforce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jforce.demo.modal.Jobs;
import com.example.jforce.demo.repository.JobsRepository;

@Service
public class JobsServiceImpl implements IJobsService {
	
	@Autowired
	JobsRepository jobsRepository;
	
	@Override
	public List<Jobs> listAll() { //listDepartments döndürdüğü için return kullanılır 
		return  jobsRepository.findAll();
	}

	@Override
	public void delete(Long id) { //voidde return edilmez, yalnızca iş yapar 
		jobsRepository.deleteById(id);
	}

	@Override
	public Jobs update(Jobs jobs) {
		return  jobsRepository.save( jobs);
	}

	@Override
	public List<Jobs> insertAll(List<Jobs> newJobsList) {
		return  jobsRepository.saveAll(newJobsList); // liste olduğu için saveAll
	}

	@Override
	public Jobs insert(Jobs jobs) {
		return jobsRepository.save(jobs);
	}	

}
