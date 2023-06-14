package com.example.jforce.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jforce.demo.modal.AccountType;
import com.example.jforce.demo.services.IAccountTypeService;

@RestController
public class AccountTypeController {
	
	@Autowired 
	IAccountTypeService iAccountTypeService;
	
	@GetMapping(path = "/accountTypeList") 
	public List<AccountType> getPersons(){
		return iAccountTypeService.listAll();
	}
	
	@DeleteMapping(path = "/deleteAccountType/{id}")
	public void deleteAccountType(@PathVariable(name = "id") Long id ) {
		iAccountTypeService.delete(id);
	}
	
	@PostMapping (path = "/updateAccountType")
	public AccountType updateAccountType(@RequestBody AccountType accountType) {
		return iAccountTypeService.update(accountType);
	}
	
	@PostMapping (path = "/insertAccountType")
	public AccountType insertAccountType(@RequestBody AccountType accountType) {
		return iAccountTypeService.insert(accountType);
	}
	
	@PostMapping (path = "/insertAllAccountType")
	public List<AccountType> insertAllAccountType (@RequestBody List<AccountType> accountType) {
		return iAccountTypeService.insertAll(accountType);
	}	
}	
	
	