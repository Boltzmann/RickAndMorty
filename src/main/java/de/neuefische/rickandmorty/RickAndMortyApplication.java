package de.neuefische.rickandmorty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RickAndMortyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RickAndMortyApplication.class, args);
    }

    @Bean
    public WebClient getWebClient(){
        return WebClient.create("https://rickandmortyapi.com/api");
    }

}
