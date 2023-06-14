package com.example.jforce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jforce.demo.modal.Employees;
import com.example.jforce.demo.repository.EmployeesRepository;

@Service
public class EmployeesServiceImpl implements IEmployeesService {

	@Autowired
	EmployeesRepository employeesRepository;

	@Override
	public List<Employees> listAll() {
		return employeesRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		employeesRepository.deleteById(id);
	}

	@Override
	public Employees update(Employees employee) {
		return employeesRepository.save(employee);
	}

	@Override
	public List<Employees> insertAll(List<Employees> newEmployeesList) {
		return employeesRepository.saveAll(newEmployeesList);
	}

	@Override
	public Employees insert(Employees employee) {
		return employeesRepository.save(employee);
	}

}
