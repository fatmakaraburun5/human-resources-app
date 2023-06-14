package com.example.jforce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jforce.demo.modal.Departments;
import com.example.jforce.demo.repository.DepartmentsRepository;

@Service
public class DepartmentsServiceImpl implements IDepartmentsService {

	@Autowired
	DepartmentsRepository departmentsRepository;
	
	@Override
	public List<Departments> listAll() { //listDepartments döndürdüğü için return kullanılır 
		return departmentsRepository.findAll();
	}

	@Override
	public void delete(Long id) { //voidde return edilmez, yalnızca iş yapar 
		departmentsRepository.deleteById(id);
	}

	@Override
	public Departments update(Departments departments) {
		return departmentsRepository.save(departments);
	}

	@Override
	public List<Departments> insertAll(List<Departments> newDepartmentsList) {
		return departmentsRepository.saveAll(newDepartmentsList); // liste olduğu için saveAll
	}

	@Override
	public Departments insert(Departments departments) {
		return departmentsRepository.save(departments);
	}	
}
