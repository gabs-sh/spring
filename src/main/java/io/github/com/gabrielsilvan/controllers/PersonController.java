package io.github.com.gabrielsilvan.controllers;

import io.github.com.gabrielsilvan.dtos.ICreatePersonDTO;
import io.github.com.gabrielsilvan.entities.Person;
import io.github.com.gabrielsilvan.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;


    @PostMapping
    public Person createPerson(@RequestBody @Validated ICreatePersonDTO data) {
        Person p = new Person(data.getName(), data.getAge(), data.getBook());
        return personService.createPerson(p);
    }

    @GetMapping("/{id}")
    public Optional<Person> findById(@PathVariable String id) {
        return this.personService.getById(Long.parseLong(id));
    }


}
