package repository;

import model.User;

import java.util.HashSet;
import java.util.Set;

public class RepositoryUser{

    private Set<User> usuarios = new HashSet<>();

    public void addNome(String value){

        usuarios.add(new User (value));

    }

    public Set<User> exibir(){
        return usuarios;
    }
}