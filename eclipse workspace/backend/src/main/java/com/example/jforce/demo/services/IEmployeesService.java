package com.example.jforce.demo.services;

import java.util.List;

import com.example.jforce.demo.modal.Employees;

public interface IEmployeesService {

	List<Employees> listAll();

	void delete(Long id);

	Employees update(Employees employee);

	List<Employees> insertAll(List<Employees> newEmployeesList);

	Employees insert(Employees employee);
}
