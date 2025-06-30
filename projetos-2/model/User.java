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

public class User{
    private String nome;


    public User(String value){
        this.nome = nome;
    }


    public final String getNome(){
        return nome;
    }

    public final void setNome(String value){

        if(value == null){
            System.out.println("Digite um valor valido");
        }else{
            nome = value;
            System.out.println("Nome alterado com sucesso");
        }
    }


}