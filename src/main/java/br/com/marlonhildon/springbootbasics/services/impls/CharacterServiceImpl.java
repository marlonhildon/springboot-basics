package br.com.marlonhildon.springbootbasics.services.impls;

import br.com.marlonhildon.springbootbasics.dtos.CharacterDTO;
import br.com.marlonhildon.springbootbasics.entities.CharacterEntity;
import br.com.marlonhildon.springbootbasics.repositories.CharacterRepository;
import br.com.marlonhildon.springbootbasics.services.CharacterService;
import org.springframework.stereotype.Service;

@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterServiceImpl(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public CharacterDTO getCharacter(Integer id) {
        CharacterEntity characterFromDB = characterRepository.findById(id).orElseThrow();
        CharacterDTO characterToReturn = new CharacterDTO(characterFromDB.getId(), characterFromDB.getName());
        return characterToReturn;
    }

    @Override
    public void saveCharacter(CharacterDTO characterToSave) {
        CharacterEntity characterEntity = new CharacterEntity(characterToSave.getName());
        characterRepository.saveAndFlush(characterEntity);
    }

}
