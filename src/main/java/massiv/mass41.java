package massiv;

import java.util.Random;
/* Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами. */
public class mass41 {
    public void run41(){
        int mass[] = new int[20];
        for(int i = 0; i < mass.length; i++){
            Random rand = new Random();
            int randomNum = rand.nextInt((10 - (-10))) - 10;
            mass[i] = randomNum;
        }
        int maxOtr = -11;
        int minPol =  11;
        System.out.println("ishodnii massiv: " );
        for(int i = 0; i < mass.length; i++){
            System.out.print(" " + mass[i]);
            if(mass[i] > 0 && mass[i] < minPol){
                minPol = mass[i];
            }
            if(mass[i] < 0 && mass[i] > maxOtr){
                maxOtr = mass[i];
            }
        }
        System.out.println();
        System.out.println("minPol elem: " + minPol );
        System.out.println("maxOtr elem: " + maxOtr);
        int k = 0;
        int n = 0;
        int m =0;
        for(int i = 0; i < mass.length; i++){
            if(mass[i] == minPol ){
                k = i;
            }
            if(mass[i] == maxOtr){
                n = i;
            }
        }
        mass[k] = maxOtr;
        mass[n] = minPol;

        System.out.println("change array: ");
        for(int i : mass){
            System.out.print(i + " ");
        }
    }
}
