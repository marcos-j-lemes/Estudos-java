import java.util.HashMap;
import java.util.Map;

public class Mapp{

    public static void main(String[] args){

        Map<Integer, String> nome = new HashMap<>();

        System.out.println("-- Adicionar elementos --");

        nome.put(1, "Luiz");
        nome.put(2, "Ana");
        nome.put(3, "Marcos");

        System.out.println("Pegando o elemento com a chave 1: "+nome.get(1));

        for(Map.Entry<Integer, String> entry : nome.entrySet()){
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }

    }
}