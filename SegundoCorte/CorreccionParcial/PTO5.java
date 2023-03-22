package co.edu.udes.correccionparcial;

import java.util.Scanner;

public class PTO5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese la altura del triángulo: ");
        int altura = sc.nextInt();
        System.out.print("Ingrese la base del triángulo: ");
        int base = sc.nextInt();

        for (int e = 0; e < altura; e++) {
            for (int j = 0; j <= e && j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}