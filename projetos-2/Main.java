
import java.util.HashSet;
import java.util.Set;

class RepositoryUser{

    private Set<User> usuarios = new HashSet<>();

    public void addNome(String value){

        usuarios.add(new User (value));

        System.out.println(usuarios.getNome());
    }

    public Set<User> exibir(){
        return usuarios;
    }
}

class User{
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

class Main{

    public static void main(String[] args){

        RepositoryUser user1 = new RepositoryUser();



        user1.addNome("Marcos");
        user1.addNome("Marc");



        //user1.exibir;

    }
    
}