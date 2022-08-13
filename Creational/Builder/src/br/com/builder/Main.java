package br.com.builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User user = createUser();

        //Qual builder vamos usar? Aquele que serve para criar a classe que queremos
        UserDTOBuilder builder = new UserWebDTOBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);
    }

    //Este método faz o papel do Director (poderia ser uma classe separada)
    //Aqui passamos a sequência lógica que o nosso objeto deve seguir para ser criado
    private static UserDTO directBuild(UserDTOBuilder builder, User user){
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    private static User createUser() {
        LocalDate birthday = LocalDate.of(2002, 10, 13);
        Address address = new Address("44", "São Paulo", "SP", "Rua 02", "012345666");
        return new User("Guilherme", "Rodriguero", birthday, address);
    }

}
