import java.util.Scanner;

public class Scannerr {

    public static void main(String[] argts){
        
        Scanner line = new Scanner(System.in);
    
        System.out.print("Digite seu nome: ");
        String nome = line.nextLine();
    
        
        System.out.print("Digite sua idade: ");
        int age = line.nextInt();
        
        System.out.println("Seja bem-vindo: "+ nome);
        if(age >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade");
        }
    
        line.close();
    }

}
