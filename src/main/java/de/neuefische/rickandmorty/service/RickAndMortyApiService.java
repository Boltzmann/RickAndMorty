package de.neuefische.rickandmorty.service;

import de.neuefische.rickandmorty.model.RMCharacter;
import de.neuefische.rickandmorty.model.RMCharacterInfo;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickAndMortyApiService {

    private final WebClient webClient;

    public RickAndMortyApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<RMCharacter> retrieveAllCharacters() {
        // API CALL

        List<RMCharacter> characters;
        try {
            RMCharacterInfo characterInfo = webClient.get()
                    .uri("/character")
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .retrieve()
                    .toEntity(RMCharacterInfo.class)
                    .block()
                    .getBody();

            characters = characterInfo.getResults();
        }  catch(NullPointerException e) {
            characters = null;
            // Todo Exception?
        }

        return characters;
    }

    public List<RMCharacter> retrieveAllAliveCharacters() {
        RMCharacterInfo characterInfo = webClient.get()
                .uri("/character?status=Alive")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(RMCharacterInfo.class)
                .block()
                .getBody();

        List<RMCharacter> characters = characterInfo.getResults();
        return characters;
    }
}
