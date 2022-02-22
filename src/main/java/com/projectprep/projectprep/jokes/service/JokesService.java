package com.projectprep.projectprep.jokes.service;

import com.projectprep.projectprep.jokes.entity.Jokes;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JokesService {
   Jokes save(List<Jokes> jokes);
}
