package com.example.demo.person;

import jakarta.persistence.Embeddable;
import lombok.Data;
import java.io.Serializable;

@Embeddable
@Data
public class BasicInfo implements Serializable {
    private String name;
    private String surname;
    private int age;
}