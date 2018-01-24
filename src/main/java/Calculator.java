import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = sc.nextFloat();
        Arithmetic ar = new Arithmetic();
        System.out.println("Enter the first number: ");
        System.out.printf("%.4f", ar.SumFraction(num1, num2));
    }
}
