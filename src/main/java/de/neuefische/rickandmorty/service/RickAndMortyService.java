package de.neuefische.rickandmorty.service;

import de.neuefische.rickandmorty.model.RMCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RickAndMortyService {

    private final RickAndMortyApiService rickAndMortyApiService;

    @Autowired
    public RickAndMortyService(RickAndMortyApiService rickAndMortyApiService) {
        this.rickAndMortyApiService = rickAndMortyApiService;
    }


    public List<RMCharacter> getAllCharacters() {
        return rickAndMortyApiService.retrieveAllCharacters();
    }

    public List<RMCharacter> getAllAliveCharacters() {
        return rickAndMortyApiService.retrieveAllAliveCharacters();
    }
}
