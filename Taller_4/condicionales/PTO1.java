package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese dos numeros");
            System.out.print("Numero 1:");
            double num1 = sc.nextDouble();
            System.out.print("Numero 2:");
            double num2 = sc.nextDouble();
            if (num1 > num2) {
                System.out.println("El numero " + num1 + " es mayor que " + num2);
            } else if(num2 > num1){
                System.out.println("El numero " + num2 + " es mayor al numero " + num1);
            }else {
                System.out.println("Los numeros son iguales");
            }
        }
    }
}
