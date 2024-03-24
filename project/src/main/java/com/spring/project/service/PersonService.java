package com.spring.project.service;

import com.spring.project.model.dto.PersonDto;
import com.spring.project.model.entity.Person;
import com.spring.project.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    /*@Autowired
    public PersonRepo personRepo;*/

    public final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public PersonDto getUSer(int id ){
        Optional<Person> person =this.personRepo.findById(id);

//return person.orElse(null);
        if(person.isPresent()) return PersonDto.toDto(person.get()) ;
        return null;
    }


    public PersonDto save(Person person){
    /*  return   this.personRepo.save(person);*/
        return PersonDto.toDto(personRepo.save(person));
    }

    public void delete(Integer id){
        personRepo.deleteById(id);
    }



}
