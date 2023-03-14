package io.github.com.gabrielsilvan.service;

import io.github.com.gabrielsilvan.entities.Person;
import io.github.com.gabrielsilvan.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public Person createPerson(Person p) {
        return personRepository.save(p);
    }

    public Optional<Person> getById(Long id) {
        return personRepository.findById(id);
    }
}
