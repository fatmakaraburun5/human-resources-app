package com.example.jforce.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jforce.demo.modal.EmployeesInventory;
import com.example.jforce.demo.services.IEmployeesInventoryService;

@RestController
public class EmployeesInventoryController {
	
	@Autowired
	IEmployeesInventoryService iEmployeesInventoryServices;

	@GetMapping(path = "/employeesInventoryList") 
	public List<EmployeesInventory> getPersons(){
		return iEmployeesInventoryServices.listAll();
	}
	
	@DeleteMapping(path = "/deleteEmployeesInventory/{id}")
	public void deleteEmployeesInventory(@PathVariable(name = "id") Long id ) {
		iEmployeesInventoryServices.delete(id);
	}

	@PostMapping (path = "/updateEmployeesInventory")
	public EmployeesInventory updatedEmployeesInventory(@RequestBody EmployeesInventory employeesInventory) {
		return iEmployeesInventoryServices.update(employeesInventory);
	}

	@PostMapping (path = "/insertEmployeesInventory")
	public EmployeesInventory insertEmployeesInventory(@RequestBody EmployeesInventory employeesInventory) {
		return iEmployeesInventoryServices.insert(employeesInventory);
	}
	
	@PostMapping (path = "/insertAllEmployeesInventory")
	public List<EmployeesInventory> insertAllEmployeesInventory(@RequestBody List<EmployeesInventory> employeesInventory) {
		return iEmployeesInventoryServices.insertAll(employeesInventory);
	}
}
