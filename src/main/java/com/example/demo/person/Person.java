package com.example.demo.person;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Person {
    @EmbeddedId
    private BasicInfo basicInfo;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "city_of_living")
    private String city;
}