package com.example.jforce.demo.services;

import java.util.List;

import com.example.jforce.demo.modal.Departments;


public interface IDepartmentsService {

	List<Departments> listAll();

	void delete(Long id);

	Departments update(Departments departments);

	List<Departments> insertAll(List<Departments> newDepartmentsList);

	Departments insert(Departments departments);
}

