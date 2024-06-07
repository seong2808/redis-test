package com.skkang.inmemory.person.controller;

import com.skkang.inmemory.person.dto.Person;
import com.skkang.inmemory.person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    @RequestMapping("/create")
    public void create(@RequestBody Person person) {
        System.out.println(person.getName());
        personService.create(person);
    }
}
