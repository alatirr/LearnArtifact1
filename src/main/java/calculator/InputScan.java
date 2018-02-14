package calculator;

import java.util.Scanner;

public class InputScan {
    public void InputScanArithmetic(){
        boolean stop = true;
        while(stop) {
            System.out.println("Choose operation: input minus or sum or degree or multiple");
            Scanner sc = new Scanner(System.in);
            String inputOperation = sc.nextLine();
            System.out.println("Enter the first number: ");
            float num1 = sc.nextFloat();
            System.out.println("Enter the second number: ");
            float num2 = sc.nextFloat();
            Arithmetic arithmetic = new Arithmetic();
            System.out.println("Enter the first number: ");
            if(new String("minus").equals(inputOperation)) {
                System.out.printf("%.4f", arithmetic.MinusFraction(num1, num2));
            }
             else if(new String("sum").equals(inputOperation)){
                System.out.printf("%.4f", arithmetic.SumFraction(num1, num2));
            }
            else if(new String("degree").equals(inputOperation)){
                System.out.printf("%.4f", arithmetic.DivisionFraction(num1, num2));
            }
            else if(new String("multiple").equals(inputOperation)){
                System.out.printf("%.4f", arithmetic.MultiplicationFraction(num1, num2));
            }
            System.out.println("You want exit? Press q");
            String exit = sc.nextLine();
            if(new String("q").equals(exit)){
                stop = false;
            }
        }
    }
}
