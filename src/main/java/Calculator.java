import calculator.InputScan;
import massiv.MaxElemet;
import massiv.mass41;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        int check = 0;
        System.out.println("1 - run calculator, 2 - run massiv, 3 - task 4.1, 0 - exit");
        Scanner sc = new Scanner(System.in);
        check = sc.nextInt();
        if(check == 1){
            InputScan inputScan = new InputScan();
            inputScan.InputScanArithmetic();
        }
        else if(check == 2){
            MaxElemet maxElemet = new MaxElemet();
            maxElemet.maxElementFind();
        }
        else if(check == 3){
            mass41 m41 = new mass41();
            m41.run41();
        }
    }
}
