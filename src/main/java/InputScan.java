import java.util.Scanner;

public class InputScan {
    public void InputScanArithmetic(){
        boolean stop = true;
        while(stop) {
            System.out.println("Choose operation: input minus or sum");
            Scanner sc = new Scanner(System.in);
            String inputOperation = sc.nextLine();
            if(new String("minus").equals(inputOperation)) {
                System.out.println("Enter the first number: ");
                float num1 = sc.nextFloat();
                System.out.println("Enter the second number: ");
                float num2 = sc.nextFloat();
                Arithmetic arMinus = new Arithmetic();
                System.out.println("Enter the first number: ");
                System.out.printf("%.4f", arMinus.MinusFraction(num1, num2));
            }
             else if(new String("sum").equals(inputOperation)){
                System.out.println("Enter the first number: ");
                float num1 = sc.nextFloat();
                System.out.println("Enter the second number: ");
                float num2 = sc.nextFloat();
                Arithmetic arSum = new Arithmetic();
                System.out.println("Enter the first number: ");
                System.out.printf("%.4f", arSum.SumFraction(num1, num2));
            }
            System.out.println("You want exit? Press q");
            String exit = sc.nextLine();
            if(new String("q").equals(exit)){
                stop = false;
            }
        }
    }
}
