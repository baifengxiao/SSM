package com.this0.springmvc.pojo;

import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

public class User {
    private Integer id;


    @Length(min = 3,max = 10)
    private String name;

    @Min(10)
    private int age = 18;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}