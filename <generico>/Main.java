
public class Main{

    public static void main(String[] args){

        Caixa<String> nomes = new Caixa<>();

        nomes.guardar("Marcos");
        nomes.guardar("Luiz");


        String a = nomes.pegar();
        //System.out.println(a);


        Caixa<Integer> age = new Caixa<>();
        age.guardar(20);
        int b = age.pegar();
        //System.out.println(b);

        System.out.printf("Nome: %s, tm %d anos\n", a,b);


    }
}