import java.util.HashSet;
import java.util.Set;

public class Sett{

    public static void exibir(Set<String> value){
        for(String v: value){
            System.out.println(v);
        }
    }

    public static void main(String[] args){

        Set<String> linguagens = new HashSet<>();

        linguagens.add("Python");
        linguagens.add("Node");
        linguagens.add("Java");
        linguagens.add("C");
        linguagens.add("HTML");
        linguagens.add("Shell");
        linguagens.add("C#");

        exibir(linguagens);


    }
}
