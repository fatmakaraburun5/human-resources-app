package com.example.jforce.demo.services;

import java.util.List;

import com.example.jforce.demo.entity.Person;

public interface IPersonService {

	List<Person> listAll();
	
	Person delete(Long id );
	
	Person update(Person person);

	List<Person> insertAll(List<Person> newPersonList);

	Person insert(Person person);

}
