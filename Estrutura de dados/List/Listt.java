import java.util.ArrayList;
import java.util.List;

public class Listt{

    public static void listt(){

        List<String> carros = new ArrayList<>();

        carros.add("BMW");
        carros.add("Porsche");

        System.out.println(carros);

    }

    public static void printt(List<String> value){
        for(String v: value){
            System.out.println(v);
        }
    }

    public static void main(String[] args){

        //listt();

        List<String> letras = new ArrayList<>();

        letras.add("a");
        letras.add("b");
        letras.add("c");
        letras.add("d");
        letras.add("e");
        letras.add("f");
        letras.add("g");

        printt(letras);

    }
}