package com.isanuric.team.person;


import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPersonRepository implements PersonRepository {

    // Spring Boot creates and configures DataSource and JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(Person person) {
        return jdbcTemplate.update(
                "INSERT INTO person (first_name, last_name, city) VALUES ('Test', 'Test', 'Test')");
    }

    @Override
    public Optional<Person> findById(Long id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM person WHERE id =?",
                new Object[]{id},
                (result, ln) -> Optional.of(new Person(
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getString("city")))
        );
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public Iterable<Person> findAll() {
        return jdbcTemplate.query(
                "select * from person",
                (result, ln) -> new Person(
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getString("city"))
        );
    }

    @Override
    public Iterable<Person> findAllById(Iterable<Long> id) {
        return jdbcTemplate.query(
                "SELECT * FROM person WHERE id IN(1,3) LIMIT 2",
                (result, ln) -> new Person(
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getString("city"))
        );
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void deleteAll(Iterable<? extends Person> var1) {

    }

    @Override
    public void deleteAll() {

    }

    public void getTables() {
//        final String sql = "SELECT * FROM pg_catalog.pg_tables WHERE schemaname != 'pg_catalog' AND  schemaname != 'information_schema'";
//        final List<Object> query = jdbcTemplate.query(
//                sql,
//                (result, ln) -> new Object());
//        query.forEach(v -> System.out.println(v));

        try {
            final DatabaseMetaData metaData = jdbcTemplate.getDataSource().getConnection().getMetaData();
            ResultSet resultSet = metaData.getTables(null, null, "%", null);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(3).equalsIgnoreCase("uid_reservations"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
