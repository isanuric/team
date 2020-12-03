package com.isanuric.team.hafez;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoemController {

    private JdbcPoemRepository jdbcPoemRepository;

    public PoemController(JdbcPoemRepository jdbcPoemRepository) {
        this.jdbcPoemRepository = jdbcPoemRepository;
    }

    @GetMapping("/poem/all")
    public Iterable<Poem> getPoem(String name) {
        final Iterable<Poem> all = this.jdbcPoemRepository.findAll();
        return all;
    }

    @GetMapping("/poem/{name}")
    public Poem getPoemAll() {
        final Poem poem = this.jdbcPoemRepository.getEntryByName("غزل ۱");
        System.out.println(poem.getPoem());
        return poem;
    }
}
