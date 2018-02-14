package massiv;

import java.util.Scanner;

public class MaxElemet {
    public void maxElementFind() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite koli4estvj elementov massiva");
        int quantity = sc.nextInt();
        String[] mass = new String[quantity];
        for(int i = 0; i < mass.length; ++i){
            System.out.println("Vvedite " + i + " element massiva");
            mass[i] = sc.next();
        }
        String st = mass[0];
        int k = 0;
        for(int i = 0; i < quantity; i++){
            if(mass[i].length() > k){
                k = mass[i].length();
                st = mass[i];
            }
        }
        System.out.println("max element mass " + st);
    }
}
