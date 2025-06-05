public class Main{

    public static final double PI = 3.1416;

    public static void main(String[] args){

        byte numberByte = 120;
        short numberShort = 30000;
        int numberInt = 30000;
        long numberLong = 100000L;

        float numberFloat = 5.75f;
        double numberDouble = 19.99;

        for (int i  = 0; i < 10000; i++){
            System.out.println("Number byte: "+ numberByte);
            System.out.println("Number Short: "+ numberShort);
            System.out.println("Number Int: "+ numberInt);
            System.out.println("Number Long:  "+ numberLong);
    
            System.out.println("Number float:  "+ numberFloat);
            System.out.println("Number double:  "+ numberDouble);
    
            System.out.printf("Valor da constante PI: %.4f\n", PI);
            System.out.printf("Valor da constante PI: %.4f\n", PI);
        }

    }
}