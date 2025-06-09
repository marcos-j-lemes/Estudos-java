import java.util.Scanner;

public class Slide31 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = input.nextFloat();

        System.out.print("Digite o primeiro valor: ");
        float valor2 = input.nextFloat();

        System.out.print("Digite o primeiro valor: ");
        float valor3 = input.nextFloat();

        System.out.print("Digite o primeiro valor: ");
        float valor4 = input.nextFloat();

        float soma = valor1 + valor2 + valor3 + valor4;

        float media = soma /4;

        System.out.printf("A média é: %.2f\n", media);
        
        input.close();
    }
}
