package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jforce.demo.modal.AccountType;

public interface AccountTypeRepository  extends JpaRepository<AccountType, Long> {

}