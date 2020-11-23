package com.isanuric.team.person;


import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Value("${spring.user.name}")
    private String username;

    @Value("${bean.message}")
    private String beanMessage;

    private final PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Team application!";
    }

    @GetMapping("/info")
    public String info() {
        System.out.println("username: " + username);
        logger.info("username: [{}]", username);
        logger.info("beanMessage: [{}]", beanMessage);
        return "Info";
    }

    @GetMapping("/get")
    public Optional<Person> get() {
        final Optional<Person> person = this.personRepository.findById(1L);
        System.out.println(person);
        return person;
    }

}
