package br.com.marlonhildon.springbootbasics.controllers;

import br.com.marlonhildon.springbootbasics.dtos.CharacterDTO;
import br.com.marlonhildon.springbootbasics.services.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping(path = "/character/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CharacterDTO> getCharacter(@PathVariable Integer id) {
        return ResponseEntity.ok( characterService.getCharacter(id) );
    }

    @PostMapping(path = "/character", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> saveCharacter(@RequestBody CharacterDTO characterToSave) {
        characterService.saveCharacter(characterToSave);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
