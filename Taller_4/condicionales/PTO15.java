package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el numero del mes: ");
            int mes = sc.nextInt();
            switch (mes) {
                case 1,3,5,7,8,10,12:
                    System.out.println("El mes tiene 31 dias");
                    break;

                case 4,6,9,11:
                    System.out.println("El mes tiene 30 dias");
                    break;

                case 2:
                    System.out.println("El mes tiene 28 dias p 29 si es año bisiesto");
                    break;
                default:
                    break;
            }
        }
    }
}
