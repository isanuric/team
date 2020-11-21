package com.isanuric.team.person;


import java.util.Optional;

public interface PersonRepository {

    int save(Person person);

    Optional<Person> findById(Long id);

    boolean existsById(Long id);

    Iterable<Person> findAll();

    Iterable<Person> findAllById(Iterable<Long> id);

    long count();

    void deleteById(Long id);

    void delete(Person person);

    void deleteAll(Iterable<? extends Person> var1);

    void deleteAll();

}
