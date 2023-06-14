package com.example.jforce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.jforce.demo.modal.PersonTest;

@Repository
public interface PersonTestRepository extends JpaRepository<PersonTest, Long> {

}
