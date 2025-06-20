public class Array{

    public static void arrayNumeros(){

        int[] number = new int[5];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;

        for(int i = 0; i < 5; i++){
            System.out.printf("index %d, número: %d\n",i, number[i] );
        }

    }

    public static void arrayString(){

        String[] nomes = new String[3];

        nomes[0] = "marcos";
        nomes[1] = "Junior";
        nomes[2] = "Ferreira";

        for(int i = 0; i< 3; i++){
            System.out.printf("index: %s, Nome: %s\n", i, nomes[i]);
        }

        String[] alunos = {"marcos", "luiz", "bernado"};

        for(int i = 0; i < 3; i++){
            System.out.printf("index: %s, Nome: %s\n", i, alunos[i]);

        }

    }

    public static void arrayBoolean(){

        boolean[] ligado = new boolean[2];

        ligado[0] = true;
        ligado[1] = false;

        for(int i =0; i < 2; i++){
            System.out.printf("Index: %d, elemento: %b\n", i, ligado[i]);
        }


    }

    public static void main(String[] args){

        arrayNumeros();
        arrayString();
        arrayBoolean();

    }
}