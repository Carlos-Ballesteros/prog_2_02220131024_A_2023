package TALLER4.Bucles;

import java.util.Scanner;

public class PTO6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduzca la base");
            double base = sc.nextDouble();
            double exponente = -1;
            do{
            System.out.println("Introduzca el exponente [entero positivo]");
            exponente = sc.nextInt();
                Math.round(exponente);
            }while (exponente <= 0);
            
            for (int e = 1; e < exponente; e++) {
                base*=base;
            }
            System.out.println("Resultado: " + base);
        }
    }
}
