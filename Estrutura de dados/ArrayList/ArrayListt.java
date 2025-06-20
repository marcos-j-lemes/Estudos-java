import java.util.ArrayList;

public class ArrayListt{

    public static void arrayListString(){

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        nomes.add("Marcos");
        nomes.add("Luiz");
        nomes.add("Arthur");

        System.out.println("--- Adicionar elementos ---");
        System.out.println("Um elemento por vez: "+nomes.get(0));
        System.out.println("Um elemento por vez: "+nomes.get(1));
        System.out.println("Um elemento por vez: "+nomes.get(2));

        System.out.println("\n --- Todos os elementos ---");

        System.out.println("\nTodos os elementos de uma vez: "+ nomes);

        System.out.println("\n --- Remover elementos ---");

        nomes.remove("Luiz");

        System.out.println("\nTodos os elementos de uma vez: "+ nomes);


        System.out.println("\n--- Adicionar elementos pelo index ---");
        nomes.add(0, "ana");

        System.out.println("\nNovo name: "+ nomes);

        System.out.println("\n --- Printar todos elementos com for ---");

        for(String nome: nomes){
            System.out.println(nome);
        }


        System.out.println("\n --- método .set: Substitui o valor na posição index ---");

        nomes.set(0, "Novo nome");

        System.out.println(nomes);

        System.out.println("\n --- método .contains: Retorna true se o elemento existir ---");

        System.out.println("\n Retorna false: "+nomes.contains("ana"));
        System.out.println(" Retorna true: "+nomes.contains("Marcos"));

        System.out.println("\n --- método .indexOf: Retorna o índice da primeira ocorrência (ou -1 se não existir). ---");

        System.out.println("\n (Marcos) - Index: "+nomes.indexOf("Marcos"));

        System.out.println(" (marcos) - Index: "+nomes.indexOf("marcos"));



        System.out.println("\n --- método .isEmpty: Retorna true se a lista estiver vazia ---");


        System.out.println("\n Listam com elementos: "+ nomes.isEmpty());
        System.out.println(" Listam sem elementos: "+ numeros.isEmpty());


        System.out.println("\n --- método .size: Retorna o tamanho da lista ---");

        System.out.println("\n Tamanho: "+ nomes.size());

        System.out.println("\n --- método .equal: Compara o conteúdo de duas listas. Só retorna true se os elementos forem iguais e na mesma ordem. ---");

        System.out.println("False: "+nomes.equals(numeros));

    }

    public static void main(String[] args){

        arrayListString();
    }

}