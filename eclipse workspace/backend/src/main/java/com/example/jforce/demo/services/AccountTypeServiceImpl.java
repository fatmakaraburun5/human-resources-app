package com.example.jforce.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jforce.demo.modal.AccountType;
import com.example.jforce.demo.repository.AccountTypeRepository;

@Service
public class AccountTypeServiceImpl implements IAccountTypeService  {

	@Autowired
	AccountTypeRepository accountTypeRepository;
	
	@Override
	public List<AccountType> listAll() { //listDepartments döndürdüğü için return kullanılır 
		return  accountTypeRepository.findAll();
	}

	@Override
	public void delete(Long id) { //voidde return edilmez, yalnızca iş yapar 
		 accountTypeRepository.deleteById(id);
	}

	@Override
	public AccountType update(AccountType accountType) {
		return  accountTypeRepository.save( accountType);
	}

	@Override
	public List<AccountType> insertAll(List<AccountType> newaccountTypeList) {
		return  accountTypeRepository.saveAll(newaccountTypeList); // liste olduğu için saveAll
	}

	@Override
	public AccountType insert(AccountType accountType) {
		return accountTypeRepository.save(accountType);
	}	
	
	

}
