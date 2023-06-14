package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.jforce.demo.modal.Employees;

public interface EmployeesRepository  extends JpaRepository<Employees, Long> {
//
//	@Query("delete from Employees  where empId=?1 ")
//	void deleteById(int id);
}
