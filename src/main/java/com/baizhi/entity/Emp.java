package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emp")
public class Emp implements Serializable {
    private Integer id;
    private String name;
    private double salary;
    private int age;


}
