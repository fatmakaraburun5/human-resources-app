package com.example.jforce.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.jforce.demo.modal.Employees;
import com.example.jforce.demo.services.IEmployeesService;

@RestController
public class EmployeesController {

	@Autowired 
	IEmployeesService iEmployeeServices;

	@GetMapping(path = "/employeeList") 
	public List<Employees> getPersons(){
		return iEmployeeServices.listAll();
	}
	
	@DeleteMapping(path = "/employee/{id}")
	public void deleteEmployees(@PathVariable(name = "id") Long id ) {
		iEmployeeServices.delete(id);
	}

	@PostMapping (path = "/updateEmployee")
	public Employees updatedEmployees(@RequestBody Employees employees) {
		return iEmployeeServices.update(employees);
	}

	@PostMapping (path = "/insertEmployee")
	public Employees insertEmployees(@RequestBody Employees employees) {
		return iEmployeeServices.insert(employees);
	}
	
	@PostMapping (path = "/insertAllEmployee")
	public List<Employees> insertAllEmployees(@RequestBody List<Employees> employees) {
		return iEmployeeServices.insertAll(employees);
	}
	
}
