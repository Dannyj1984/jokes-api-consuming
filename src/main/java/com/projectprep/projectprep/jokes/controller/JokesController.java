package com.projectprep.projectprep.jokes.controller;


import com.projectprep.projectprep.jokes.entity.Jokes;
import com.projectprep.projectprep.jokes.service.JokesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@Slf4j
@RestController
public class JokesController  implements CommandLineRunner{


    @Autowired
    private JokesService jokesService;

    @Autowired
    private RestTemplate restTemplate;

  /*
  @PostMapping("/jokes")
    public List<Jokes> saveJokes(@RequestBody Iterable<Jokes> jokes ){
         return jokesService.saveJokes(jokes);
    }
*/
    @Override
    public void run(String... args) throws Exception {
        String jokesUrl = "https://v2.jokeapi.dev/joke/Any?type=single&amount=8";
      Jokes response = restTemplate.getForObject(jokesUrl,Jokes.class);
      List<Jokes> jokesList= Arrays.asList(response);
        System.out.println(jokesList);
      jokesService.save(jokesList);

    }


}

