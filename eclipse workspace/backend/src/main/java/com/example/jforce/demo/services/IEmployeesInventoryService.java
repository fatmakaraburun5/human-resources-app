package com.example.jforce.demo.services;

import java.util.List;

import com.example.jforce.demo.modal.EmployeesInventory;

public interface IEmployeesInventoryService {

	List<EmployeesInventory> listAll();

	void delete(Long id);

	EmployeesInventory update(EmployeesInventory employeesInventory);

	List<EmployeesInventory> insertAll(List<EmployeesInventory> newemployeesInventoryList);

	EmployeesInventory insert(EmployeesInventory employeesInventory);
}
