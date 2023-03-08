package TALLER4.Bucles;

import java.util.Scanner;

public class PTO10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas de la pirámide: ");
        int filas = sc.nextInt();

        for (int e = 1; e < filas; e++) {
            int blank = filas-e;
            for (int f = 0; f < blank; f++) {
                System.out.print(" ");
            }
            for (int f = filas-1; f >=1 ; f++) {
                System.out.print(f);
            }
        }
        sc.close();
    }
}
