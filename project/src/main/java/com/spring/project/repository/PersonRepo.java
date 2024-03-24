package com.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.project.model.entity.Person;
import org.springframework.stereotype.Component;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}
