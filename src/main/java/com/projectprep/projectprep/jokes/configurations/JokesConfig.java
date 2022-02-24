package com.projectprep.projectprep.jokes.configurations;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectprep.projectprep.jokes.entity.Jokes;
import com.projectprep.projectprep.jokes.service.JokesServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class JokesConfig {


}
