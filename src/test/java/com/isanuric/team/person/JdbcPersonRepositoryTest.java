package com.isanuric.team.person;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class JdbcPersonRepositoryTest {

    @Autowired
    private JdbcPersonRepository jdbcPersonRepository;

    @Test
    void save() {
    }

    @Test
    void findById() {
        final Iterable<Person> personIterable = jdbcPersonRepository.findAll();
    }

    @Disabled
    @Test
    void existsById() {
        final Optional<Person> person = jdbcPersonRepository.findById(1L);
        assertThat(person.get().getLastName().equalsIgnoreCase("Nietzsche"));
    }

    @Test
    void findAll() {
        final Iterable<Person> personIterable = jdbcPersonRepository.findAll();
        personIterable.forEach(v -> System.out.println(v.getLastName()));
    }

    @Test
    void findAllById() {
    }

    @Test
    void count() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteAll() {
    }

    @Test
    void testDeleteAll() {
    }

    @Test
    void getTables() {
        jdbcPersonRepository.getTables();
    }
}