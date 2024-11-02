package com.example.demo.controller;

import com.example.demo.person.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> findByCity(@RequestParam String city) {
        return personRepository.getPersonsByCity(city);
    }
}