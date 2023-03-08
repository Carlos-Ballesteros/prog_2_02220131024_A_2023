package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            double num = sc.nextDouble();

            if (num%2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }
    }
}
