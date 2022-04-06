package de.neuefische.rickandmorty.controller;

import de.neuefische.rickandmorty.model.RMCharacter;
import de.neuefische.rickandmorty.service.RickAndMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("RMcharacter")
public class RickAndMortyController {

    private final RickAndMortyService rmService;

    @Autowired
    public RickAndMortyController(RickAndMortyService rmService) {
        this.rmService = rmService;
    }

    // Methoden aus Service folgend
    @GetMapping
    public List<RMCharacter> getAllCharacters() {
        return rmService.getAllCharacters();
    }

}
