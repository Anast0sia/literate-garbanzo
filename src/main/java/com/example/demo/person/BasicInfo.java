package com.example.demo.person;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import java.io.Serializable;

@Embeddable
public class BasicInfo implements Serializable {
    @Getter
    private String name;
    @Getter
    private String surname;
    private int age;
}