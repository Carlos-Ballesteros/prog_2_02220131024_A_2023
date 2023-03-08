package TALLER4.Bucles;

import java.util.Scanner;

public class PTO4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca el primer numero: ");
            double num1 = sc.nextDouble();
            System.out.print("Introduzca el segundo numero: ");
            double num2 = sc.nextDouble();

            if (num1 < num2) {
                for (double e = num1; e < num2; e++) {
                    if (e%2==0) {
                        System.out.println(e);
                    }
                }
            }else{
                for (Double e = num2; e < num1; e++) {
                    if (e%2==0) {
                        System.out.println(e);
                    }
                }
            }
        }
    }
}
