package br.com.marlonhildon.springbootbasics.controllers;

import br.com.marlonhildon.springbootbasics.dtos.CharacterDTO;
import br.com.marlonhildon.springbootbasics.services.CharacterService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping(path = "/character", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CharacterDTO> getCharacter() {
        return ResponseEntity.ok( characterService.getCharacter() );
    }

}
