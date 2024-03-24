package com.spring.project.controller;

import com.spring.project.model.dto.PersonDto;
import com.spring.project.model.entity.Person;
import com.spring.project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

   /* @Autowired
    private PersonService personService;*/

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/user")
        public PersonDto getUser(@RequestParam Integer id) {
        return personService.getUSer(id);
    }

    @PostMapping("/save")
    public PersonDto savePerson(@RequestBody Person p) {
        return personService.save(p);
    }



    @GetMapping("/delete")
    public void delete(@RequestParam Integer id) {
         personService.delete(id);
    }


    @PostMapping("/update")
    public PersonDto updatePerson(@RequestBody PersonDto p) {
        return personService.save(Person.toEntity(p));
    }

   /* @PostMapping("/update")
    public Person updatePerson(@RequestBody Person p) {
        return personService.save(p);
    }*/


    @GetMapping("/print")
    public String printName(){
        return "Ali";
    }

}
