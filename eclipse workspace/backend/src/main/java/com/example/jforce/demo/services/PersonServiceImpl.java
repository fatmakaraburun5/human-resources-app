package com.example.jforce.demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.jforce.demo.entity.Person;
import com.example.jforce.demo.modal.AccountType;
import com.example.jforce.demo.repository.AccountTypeRepository;

@Service
public class PersonServiceImpl implements IPersonService {

	@Autowired
	AccountTypeRepository accountTypeRepository;
	
	private List<Person> personList;

	@PostConstruct
	public void init() {
		personList = new ArrayList();

		personList.add(new Person(1L, "harun", "acar"));
		personList.add(new Person(2L, "oyku", "acar"));
		personList.add(new Person(3L, "fatma", "karaburun"));
		personList.add(new Person(4L, "erim", "karakus"));
		personList.add(new Person(5L, "fadime", "cimen"));
		personList.add(new Person(6L, "ebru", "karakus"));
		personList.add(new Person(7L, "hamza", "yılmaz"));
		personList.add(new Person(8L, "deneme8", "sekiz"));
		personList.add(new Person(9L, "deneme9", "dokuz"));
		personList.add(new Person(10L, "deneme10", "on"));
		personList.add(new Person(11L, "deneme11", "onbir"));

	}

	@Override
	public List<Person> listAll() {
	
		return this.personList; //db verilerini döndürecek
	}

	@Override
	public Person delete(Long id) {
		int found = -1;
		for (int i = 0; i < this.personList.size(); i++) {
			if (this.personList.get(i).getId().compareTo(id) == 0) {
				found = i;
				break;
			}
		}
		if (found > -1) {
			Person p = this.personList.get(found);
			this.personList.remove(found);
			return p;
		}
		throw new RuntimeException(id + " için herhangi bir kayıt yok.");
	}

	@Override
	public Person insert(Person person) {
		this.personList.add(person); //db için insert edilecek kısımlar düzenlenecek, update, delete vs. de aynı 
		return person;
	}
	// ----------------------------------------------------

	@Override
	public List<Person> insertAll(List<Person> newPersonList) {
		this.personList.addAll(newPersonList);
		return newPersonList;
	}

	@Override
	public Person update(Person person) {
		int found = -1;

		for (int i = 0; i < this.personList.size(); i++) {
			if (this.personList.get(i).getId().compareTo(person.getId()) == 0) {

				found = i;
				break;
			}
		}

		if (found > -1) {
			Person p = this.personList.get(found);

			p.setId(person.getId());
			p.setName(person.getName());
			p.setSurname(person.getSurname()); // yeni bilgileri çekmek için

			final Person updatedPerson = personList.set(found, p);
			return updatedPerson;
		}

		throw new RuntimeException(person.getId() + " için herhangi bir kayıt yok.");
	}

}

// ----------------------------------------------------
