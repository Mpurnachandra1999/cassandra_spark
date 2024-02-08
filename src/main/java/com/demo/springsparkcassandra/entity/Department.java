package com.demo.springsparkcassandra.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
public class Department {
    private final String id;
    private final String name;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private final String empId;
}
