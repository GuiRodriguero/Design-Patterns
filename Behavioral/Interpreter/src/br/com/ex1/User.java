package br.com.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Contexto -> provê às nossas expressions, tudo que precisamos.
 * Nossas expressions só precisarão ter acesso ao User, pois elas só precisam
 * conseguir interpretar quais roles o nosso user tem
 */
public class User {

    private List<String> permissions;
    private String username;

    public User(String username, String... permissions) {
        this.username = username;
        this.permissions = new ArrayList<>();
        Stream.of(permissions).forEach(e->this.permissions.add(e.toLowerCase()));
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public String getUsername() {
        return username;
    }

}
