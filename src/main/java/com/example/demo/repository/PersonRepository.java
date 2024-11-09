package com.example.demo.repository;

import com.example.demo.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByCity(String city);
    List<Person> findByBasicInfo_AgeLessThanOrderByBasicInfo_AgeAsc(int age);
    Optional<Person> findByBasicInfo_NameAndBasicInfo_Surname(String name, String surname);
}