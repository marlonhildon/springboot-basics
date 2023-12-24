package br.com.marlonhildon.springbootbasics.services.impls;

import br.com.marlonhildon.springbootbasics.dtos.CharacterDTO;
import br.com.marlonhildon.springbootbasics.services.CharacterService;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Override
    public CharacterDTO getCharacter() {
        return new CharacterDTO("Mario");
    }

}
