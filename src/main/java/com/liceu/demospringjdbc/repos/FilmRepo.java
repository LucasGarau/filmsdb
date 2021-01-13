package com.liceu.demospringjdbc.repos;

import com.liceu.demospringjdbc.entities.Film;

import java.util.List;

public interface FilmRepo {
    List<Film> findAll();
    List<Film> findOverdue();
}
