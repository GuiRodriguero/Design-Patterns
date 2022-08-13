package br.com.builder;

import java.time.LocalDate;

/**
 * Aqui temos a classe que fará o papel de Builder do nosso Design Pattern. É ela quem vai dividir o nosso objeto em partes para que
 * ele possa ser criado mais facilmente
 */
public interface UserDTOBuilder {
    //Métodos para criar partes do nosso objeto alvo
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);

    //Método para juntar as partes e criar o objeto final
    UserDTO build();

    UserDTO getUserDTO();
}
