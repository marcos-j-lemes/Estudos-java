import java.util.Scanner;

public class Slide33 {
    
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com a quantidade de Ano: ");
        int ano = input.nextInt();

        float dias = ano*365;

        System.out.printf(" %s em dias %.0f\n", ano, dias);

        input.close();

    }
}
