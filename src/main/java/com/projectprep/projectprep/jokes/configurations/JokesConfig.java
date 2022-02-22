package com.projectprep.projectprep.jokes.configurations;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectprep.projectprep.jokes.entity.Jokes;
import com.projectprep.projectprep.jokes.service.JokesServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class JokesConfig {


    @Bean
    CommandLineRunner runner(JokesServiceImpl jokesService){

        return arg ->{

       /*     //String jokesUrl = "https://v2.jokeapi.dev/joke/Any?amount=5";
            ObjectMapper mapper=new ObjectMapper();
            TypeReference<List<Jokes>> typeReference = new TypeReference<List<Jokes>>(){};
            InputStream inputStream = TypeReference.class.getResourceAsStream("https://v2.jokeapi.dev/joke/Any?type=single&amount=8");
            try {
                List<Jokes> jokes = mapper.readValue(inputStream,typeReference);
                jokesService.saveJokes(jokes);
                System.out.println("Users Saved!");
            } catch (IOException e){
                System.out.println("Unable to save users: " + e.getMessage());
            }

        */

        };
    }

}
