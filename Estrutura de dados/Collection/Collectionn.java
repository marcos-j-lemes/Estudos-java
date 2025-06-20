import java.util.Collection;
import java.util.ArrayList;

public class Collectionn{

    public static void Colle(){

        Collection<String> frutas = new ArrayList<>();

        frutas.add("maça");
        frutas.add("banana");


        for(String f: frutas){
            System.out.println(f);
        }
    }

    public static void imprimirColecao(Collection<String> colecao) {
    for (String item : colecao) {
        System.out.println(item);
    }
}

    public static void main(String[] args){

        //Colle();

        Collection<String> nomes = new ArrayList<>();

        nomes.add("Marcos");
        nomes.add("luiz");
        nomes.add("ana");
        nomes.add("joão");

        imprimirColecao(nomes);
    }
}

