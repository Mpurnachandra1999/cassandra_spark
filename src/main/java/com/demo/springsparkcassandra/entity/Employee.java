package com.demo.springsparkcassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "employee" )
@Data
@AllArgsConstructor
public class Employee {
    private final String emp_id;
    private final String name;
    private final int age;

    private final String address;
}
