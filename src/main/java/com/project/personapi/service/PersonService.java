package com.project.personapi.service;

import com.project.personapi.dto.MessageResponse;
import com.project.personapi.entity.Person;
import com.project.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponse createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponse
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }


}
