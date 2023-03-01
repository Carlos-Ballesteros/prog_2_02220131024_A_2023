package TALLER3.EJERCICIOSBASICOS;

import java.util.Scanner;

public class PTO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 valores numericos");
        double sum=0;
        for (int i = 0; i < 3; i++) {
            sum= sum + sc.nextDouble();
        }
        double media = sum/3;
        System.out.println("La media es de: " + media);
    }
}