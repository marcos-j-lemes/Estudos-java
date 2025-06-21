import java.util.LinkedList;
import java.util.Queue;

public class Queuee{

    public static void main(String[] args){

        Queue<String> fila = new LinkedList<>();

        fila.offer("A");
        fila.offer("B");
        fila.offer("C");

        System.out.println("-- método .offer - Para adicionar novos elementos");
       System.out.println(fila);

       System.out.println("-- Método .peek - pegar por ordem --");
       System.out.println(fila.peek());



       System.out.println("-- Método .pool - pegar por ordem com while --");

       while(!fila.isEmpty()){
        String doc = fila.poll();
        System.out.println("Exibir por ordem de colocação: "+doc);
       }
    }
}