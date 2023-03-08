package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el numerador: ");
            double num =  sc.nextDouble();
            System.out.print("Ingrese el denominador: ");
            double denom =  sc.nextDouble();

            if (denom != 0) {
                num = num/denom;
            }else{
                System.out.println("El denominador tiene que ser diferente de 0");
            }
        }
    }
}
