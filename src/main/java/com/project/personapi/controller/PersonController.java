package com.project.personapi.controller;

import com.project.personapi.dto.MessageResponse;
import com.project.personapi.entity.Person;
import com.project.personapi.repository.PersonRepository;
import com.project.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponse createPerson(@RequestBody Person person){
            return personService.createPerson(person);
    }
}
