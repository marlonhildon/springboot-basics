package br.com.marlonhildon.springbootbasics.repositories;

import br.com.marlonhildon.springbootbasics.entities.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterEntity,Integer> {
}
