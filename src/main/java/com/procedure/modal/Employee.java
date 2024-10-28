package com.procedure.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String designation;
    private LocalDate joining_date;
}
