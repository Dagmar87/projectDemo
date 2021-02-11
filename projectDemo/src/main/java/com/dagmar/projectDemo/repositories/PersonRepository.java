package com.dagmar.projectDemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dagmar.projectDemo.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
