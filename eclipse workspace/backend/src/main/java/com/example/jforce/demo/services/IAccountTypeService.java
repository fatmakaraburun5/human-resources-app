package com.example.jforce.demo.services;

import java.util.List;

import com.example.jforce.demo.modal.AccountType;

public interface IAccountTypeService {


	List<AccountType> listAll();

	void delete(Long id);

	AccountType update(AccountType accountType);

	List<AccountType> insertAll(List<AccountType> newaccountTypeList);

	AccountType insert(AccountType accountType);
	
}
