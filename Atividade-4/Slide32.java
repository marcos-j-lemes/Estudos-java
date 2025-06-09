import java.util.Scanner;

public class Slide32 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor Total: ");
        double valor = input.nextDouble();

        System.out.print("Digite o valor do desconto: ");
        double desconto = input.nextDouble();

        double valor_com_desconto = valor - desconto;


        System.out.printf("Valor com desconto %.2f\n", valor_com_desconto);

        input.close();
    }
}
