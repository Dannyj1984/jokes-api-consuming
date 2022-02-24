package com.projectprep.projectprep.jokes.controller;


import com.google.gson.Gson;
import com.projectprep.projectprep.jokes.entity.Jokes;
import com.projectprep.projectprep.jokes.repository.JokesRepository;
import com.projectprep.projectprep.jokes.service.JokesService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Slf4j
@RestController
public class JokesController implements CommandLineRunner {


    @Autowired
    private JokesService jokesService;

    @Autowired
    private JokesRepository jokesRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    Gson gson;


//    @PostMapping("/jokes")
//    public Jokes saveJokes(@RequestBody Jokes jokes) {
//        return jokesRepository.save(jokes);
//    }

    @GetMapping("/jokes")
    public void saveJokes () {
        String uri = "https://v2.jokeapi.dev/joke/Any";
        int counter = 1;
        while(counter < 11) {
            Jokes jokes = restTemplate.getForObject(uri, Jokes.class);
            assert jokes != null;
            Jokes joke = new Jokes(jokes);
            jokesRepository.save(joke);
            counter++;
        }
    }

    @GetMapping("/getJokes")
    public List<Jokes> getJokes() {
        return jokesRepository.findAll();
    }

    @Override
    public void run(String... args) throws Exception {
        saveJokes();
    }
}

