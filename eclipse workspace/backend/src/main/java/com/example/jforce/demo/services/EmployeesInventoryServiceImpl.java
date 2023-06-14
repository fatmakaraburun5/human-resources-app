package com.example.jforce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jforce.demo.modal.EmployeesInventory;
import com.example.jforce.demo.repository.EmployeesInventoryRepository;

@Service
public class EmployeesInventoryServiceImpl implements IEmployeesInventoryService {
	
	@Autowired
	EmployeesInventoryRepository employeesInventoryRepository;

	@Override
	public List<EmployeesInventory> listAll() { //listDepartments döndürdüğü için return kullanılır 
		return employeesInventoryRepository.findAll();
	}

	@Override
	public void delete(Long id) { //voidde return edilmez, yalnızca iş yapar 
		employeesInventoryRepository.deleteById(id);
	}

	@Override
	public EmployeesInventory update(EmployeesInventory employeesInventory) {
		return employeesInventoryRepository.save(employeesInventory);
	}

	@Override
	public List<EmployeesInventory> insertAll(List<EmployeesInventory> newemployeesInventoryList) {
		return employeesInventoryRepository.saveAll(newemployeesInventoryList); // liste olduğu için saveAll
	}

	@Override
	public EmployeesInventory insert(EmployeesInventory employeesInventory) {
		return employeesInventoryRepository.save(employeesInventory);
	}	
}
