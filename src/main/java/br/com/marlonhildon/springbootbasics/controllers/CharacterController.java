package br.com.marlonhildon.springbootbasics.controllers;

import br.com.marlonhildon.springbootbasics.dtos.CharacterDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CharacterController {

    @GetMapping(path = "/character", produces = "application/json")
    public ResponseEntity<CharacterDTO> getCharacter() {
        return ResponseEntity.ok( new CharacterDTO("Mario") );
    }

}
