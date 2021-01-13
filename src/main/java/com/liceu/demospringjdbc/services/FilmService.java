package com.liceu.demospringjdbc.services;

import com.liceu.demospringjdbc.entities.Film;
import com.liceu.demospringjdbc.repos.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {
    @Autowired
    FilmRepo filmRepo;

    public List<Film> findAll() {
        return filmRepo.findAll();
    }
    public List<Film> findOverdue() {
        return filmRepo.findOverdue();
    }

}
