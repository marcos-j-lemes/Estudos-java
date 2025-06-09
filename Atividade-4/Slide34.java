import java.util.Scanner;

public class Slide34 {
    
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com a quantidade de dolares: ");
        double dolares= input.nextDouble();

        double reais = dolares*5.64;

        System.out.printf(" %s dolares para reais %.2f\n", dolares, reais);

        input.close();

    }
}
