package com.isanuric.team.hafez;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PoemController {

    private final JdbcPoemRepository jdbcPoemRepository;

    public PoemController(final JdbcPoemRepository jdbcPoemRepository) {
        this.jdbcPoemRepository = jdbcPoemRepository;
    }

    @GetMapping("/test-index")
    public String getIndex() {
        System.out.println("index...");
        return "index";
    }

    @GetMapping("/hafez")
    public String getPoemPage(
            @RequestParam(name="id", required=true, defaultValue="1") Integer id,
            Model model) {
        model.addAttribute("poem", this.jdbcPoemRepository.getEntryById(id).getPoem());
        return "hafez";
    }

    @GetMapping("/poem/all")
    public Iterable<Poem> getPoem(final String name) {
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
