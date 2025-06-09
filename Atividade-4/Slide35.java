import java.util.Scanner;

public class Slide35 {

    public static double raiz(double x){
        double z = Math.sqrt(x);
        return z;
    } 
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Entre com a: ");
        double a = input.nextDouble();

        System.out.print("Entre com b: ");
        double b = input.nextDouble();

        System.out.print("Entre com c: ");
        double c = input.nextDouble();

        double delta = b * b - (4 * a * c);

        if(delta <= 0){
            System.out.printf("Delta negativo: %.2f, não possui raize \n", delta);
        }else{
            double _x = (-b + raiz(delta)) / (2 * a);
    
            double __x = (-b - raiz(delta))/ (2 * a);
    
            System.out.printf("Resultado x':%.2f x'':%.2f\n", _x, __x);
        }

        input.close();
    }
}
