import calculator.InputScan;
import massiv.MaxElemet;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        int check = 0;
        System.out.println("1 - run calculator, 2 - run massiv, 0 - exit");
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
    }
}
