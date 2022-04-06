package de.neuefische.rickandmorty.controller;

import de.neuefische.rickandmorty.service.RickAndMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("RMcharacter")
public class RickAndMortyController {

    private final RickAndMortyService rmService;

    @Autowired
    public RickAndMortyController(RickAndMortyService rmService) {
        this.rmService = rmService;
    }

    // Methoden aus Service folgend

}
