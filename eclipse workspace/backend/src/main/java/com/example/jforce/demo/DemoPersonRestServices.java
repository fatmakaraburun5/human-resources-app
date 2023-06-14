package com.example.jforce.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.jforce.demo.entity.Person;
import com.example.jforce.demo.services.IPersonService;

@RestController
public class DemoPersonRestServices { //rest clas olduğunu söyler

	
	@Autowired //ipersonservice türemiş classtan bir obje yaratıp bize verir
	private IPersonService personService; //spring, objeleri kendisi yaratmak ister. bu yüzden interface olan ipersonservice'e bağlanır
	
	@GetMapping(path = "/persons") //data çekileceğini, yolunu, persons olduğunu söyler 
	public List<Person> getPersons(){
		
		return personService.listAll();
	}
	
	@DeleteMapping(path = "/persons/{id}")
	public Person deletePerson(@PathVariable(name = "id")Long id ) {
		return personService.delete(id);
	}
	
	// ----------------------------------------------------

	
	@PostMapping (path = "/update")
	public Person updatedPerson(@RequestBody Person person) {
		return personService.update(person);
	}

	@PostMapping (path = "/insert")
	public Person insertPerson(@RequestBody Person person) {
		return personService.insert(person);
	}
	
	@PostMapping (path = "/insertAll")
	public List<Person> insertAllPerson(@RequestBody List<Person> person) {
		return personService.insertAll(person);
	}
	
	
}
