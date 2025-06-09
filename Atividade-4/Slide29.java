import java.util.Scanner;

public class Slide29 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digiter a hora: ");
        float horas = input.nextFloat();

        float minutos = horas * 60;

        System.out.printf("%s/h convertida em minutos: %.2f\n",horas, minutos);

        input.close();
    }
}
