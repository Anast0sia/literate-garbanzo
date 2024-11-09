package com.example.demo.controller;

import com.example.demo.person.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {
    PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/by-city")
    public List<Person> findByCity(@RequestParam String city) {
        return personRepository.findByCity(city);
    }

    @GetMapping("/less-than-age")
    public List<Person> findLessThanAge(@RequestParam int age) {
        return personRepository.findByBasicInfo_AgeLessThanOrderByBasicInfo_AgeAsc(age);
    }

    @GetMapping("/name-and-surname")
    public Optional<Person> findNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return personRepository.findByBasicInfo_NameAndBasicInfo_Surname(name, surname);
    }
}