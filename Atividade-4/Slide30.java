import java.util.Scanner;

public class Slide30 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite os mínutos: ");
        float minutos = input.nextFloat();
        
        float horas = minutos/60;

        System.out.printf("%s/m para horas %.2f\n", minutos, horas);

        input.close();
    }

}
