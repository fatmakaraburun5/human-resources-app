package com.example.jforce.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.jforce.demo.modal.Departments;
import com.example.jforce.demo.services.IDepartmentsService;

@RestController
public class DepartmentsController {
	
	@Autowired 
	IDepartmentsService iDepartmentsService;

	@GetMapping(path = "/departmentsList") 
	public List<Departments> getPersons(){
		return iDepartmentsService.listAll();
	}
	
	@DeleteMapping(path = "/departments/{id}")
	public void deleteDepartments(@PathVariable(name = "id") Long id ) {
		iDepartmentsService.delete(id);
	}

	@PostMapping (path = "/updateDepartments")
	public Departments updatedDepartments(@RequestBody Departments departments) {
		return iDepartmentsService.update(departments);
	}

	@PostMapping (path = "/insertDepartments")
	public Departments insertDepartments(@RequestBody Departments departments) {
		return iDepartmentsService.insert(departments);
	}
	
	@PostMapping (path = "/insertAllDepartments")
	public List<Departments> insertAllDepartments(@RequestBody List<Departments> departments) {
		return iDepartmentsService.insertAll(departments);
	}
	
}

