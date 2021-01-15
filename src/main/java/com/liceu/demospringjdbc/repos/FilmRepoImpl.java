package com.liceu.demospringjdbc.repos;

import com.liceu.demospringjdbc.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepoImpl implements FilmRepo {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Film> findAll() {
        return jdbcTemplate.query("select * from film", new BeanPropertyRowMapper<>(Film.class));
    }

    public List<Film> findOverdue() {
       // return jdbcTemplate.query(" SELECT CONCAT(customer.last_name, ', ', customer.first_name) AS customer, address.phone, film.title FROM rental INNER JOIN customer ON rental.customer_id = customer.customer_id INNER JOIN address ON customer.address_id = address.address_id INNER JOIN inventory ON rental.inventory_id = inventory.inventory_id INNER JOIN film ON inventory.film_id = film.film_id WHERE rental.return_date IS NULL AND rental_date + INTERVAL film.rental_duration DAY < CURRENT_DATE() ORDER BY title LIMIT 5;", new BeanPropertyRowMapper<>(Film.class));
        return jdbcTemplate.query(" SELECT rental_date + INTERVAL film.rental_duration DAY AS returndate, film.title FROM rental INNER JOIN customer ON rental.customer_id = customer.customer_id INNER JOIN address ON customer.address_id = address.address_id INNER JOIN inventory ON rental.inventory_id = inventory.inventory_id INNER JOIN film ON inventory.film_id = film.film_id WHERE rental.return_date IS NULL AND rental_date + INTERVAL film.rental_duration DAY < CURRENT_DATE() ORDER BY title LIMIT 5;", new BeanPropertyRowMapper<>(Film.class));


    }
}
