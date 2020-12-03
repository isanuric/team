package com.isanuric.team.hafez;


public interface PoemRepository  {

    Poem getEntryByName(String name);

    Iterable<Poem> findAll();

}
