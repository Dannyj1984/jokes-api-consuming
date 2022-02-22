package com.projectprep.projectprep.jokes.service;

import com.projectprep.projectprep.jokes.entity.Jokes;
import com.projectprep.projectprep.jokes.repository.JokesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JokesServiceImpl implements JokesService{

    @Autowired
    private JokesRepository jokesRepository;

    @Override
    public Jokes save(List<Jokes> jokes) {
        return jokesRepository.save(jokes);
    }

  /*  @Override
    public Jokes saveJokes(List<Jokes> jokes) {
        return jokesRepository.saveAll(jokes);
    }*/
}
