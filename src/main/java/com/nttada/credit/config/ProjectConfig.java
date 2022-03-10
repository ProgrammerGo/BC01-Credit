package com.nttada.credit.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@EnableWebFlux
@Service
public class ProjectConfig {
    @Autowired
    @Qualifier("wc")
    private WebClient.Builder webClientBuilder(){
        return WebClient.builder();
    }
    /*@value("${application.location}")
    private String location;*/
}

