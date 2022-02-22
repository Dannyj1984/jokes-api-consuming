package com.projectprep.projectprep.jokes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projectprep.projectprep.jokes.entity.Jokes;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JokesRepository extends  JpaRepository<Jokes,Long>{
    Jokes save(List<Jokes> jokes);
}
