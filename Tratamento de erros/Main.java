import java.util.Scanner;

class NomeInValido extends Exception{
    public NomeInValido(String mensage){
        super(mensage);
    }
}

public class Main {

    public static void main(String[] args) throws NomeInValido{

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int idade = input.nextInt();

        if (idade < 10){
            throw new NomeInValido("Idade invalida");
        }


    }
}


