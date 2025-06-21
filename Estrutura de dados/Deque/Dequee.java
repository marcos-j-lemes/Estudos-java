import java.util.Deque;
import java.util.ArrayDeque;

public class Dequee{

    public static  void main(String[] args){

        Deque<String> fila = new ArrayDeque<>();

        fila.addFirst("A");
        fila.addLast("Z");

        while(!fila.isEmpty()){
            String doc = fila.poll();
            System.out.println("Elementes em orde: "+doc);
        }

        fila.addFirst("marcos");
        fila.addFirst("junior");


        System.out.println("Primeiro elemento: "+ fila.peekFirst());
        System.out.println("último elemento: "+ fila.peekLast());

    }
}