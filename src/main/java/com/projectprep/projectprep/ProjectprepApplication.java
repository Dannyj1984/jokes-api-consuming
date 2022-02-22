package com.projectprep.projectprep;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectprep.projectprep.jokes.entity.Jokes;
import com.projectprep.projectprep.jokes.service.JokesServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ProjectprepApplication {


	public static void main(String[] args) {
		SpringApplication.run(ProjectprepApplication.class, args);

	}

@Bean
	public RestTemplate myRestTemplate(){
		return new RestTemplate();
	}





}
