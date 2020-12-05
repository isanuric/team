package com.isanuric.team.hafez;


public interface PoemRepository  {

    Poem getEntryById(Integer id);

    Poem getEntryByName(String name);

    Iterable<Poem> findAll();



}
