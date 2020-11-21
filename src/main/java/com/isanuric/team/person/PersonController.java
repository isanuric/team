package com.isanuric.team.person;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/")
    public String healthcheck() {
        return "Welcome to Team application!";
    }

    @GetMapping("/get")
    public Optional<Person> get() {
        final Optional<Person> person = this.personRepository.findById(1L);
        System.out.println(person);
        return person;
    }

}
