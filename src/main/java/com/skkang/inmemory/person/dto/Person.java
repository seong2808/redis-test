package com.skkang.inmemory.person.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data @Builder
@AllArgsConstructor
public class Person {

    @Id
    private String id;
    private String name;
    private Integer age;

    public Person() {}

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
