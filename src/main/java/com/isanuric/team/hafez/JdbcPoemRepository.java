package com.isanuric.team.hafez;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPoemRepository implements PoemRepository {

    // Spring Boot creates and configures DataSource and JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Poem getEntryByName(String name) {
        return jdbcTemplate.queryForObject(
                "select * from poems WHERE id=2172",
                (result, ln) -> new Poem(
                        result.getString("poem_name"),
                        result.getString("poem"))
        );
    }

    @Override
    public Iterable<Poem> findAll() {
        return jdbcTemplate.query(
                "select * from poems",
                (result, ln) -> new Poem(
                        result.getString("poem_name"),
                        result.getString("poem"))
        );
    }
}
