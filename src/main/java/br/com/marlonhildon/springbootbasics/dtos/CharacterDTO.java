package br.com.marlonhildon.springbootbasics.dtos;

public class CharacterDTO {

    private String name;

    public CharacterDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
