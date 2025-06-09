import java.util.Scanner;

public class Slide28{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double b = input.nextDouble();

        System.out.print("Digite o próximo número: ");
        double h = input.nextDouble();
        double area = (b * h) / 2;

        System.out.printf("A área do triangulo é: %.2f\n", area);
        
        //String formatado = String.format("%.2f", area);
        //System.out.println("A área do triangulo é: "+ formatado);
        input.close();
    }
}
