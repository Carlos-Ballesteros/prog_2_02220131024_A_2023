package TALLER4.Bucles;

import java.util.Scanner;

public class PTO2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Cuantos numeros quiere introducir?");
            double num[] = new double[ sc.nextInt()];
            for (int e = 0; e < num.length; e++) {
                System.out.println("Introduzca un numero");
                num[e] = sc.nextInt();
            }
            int mayores = 0;
            int menores = 0;
            int iguales = 0;
            double comp0[][] = new double[2][num.length]; 
            for (int e = 0; e < num.length; e++) {
                if (num[e] > 0) {
                    System.out.println(num[e] + " es mayor a 0");
                    comp0[0][mayores] = num[e];
                    mayores++;
                }else if (num[e] < 0) {
                    System.out.println(num[e] + " es menor a 0");
                    comp0[1][menores] = num[e];
                    menores++;
                }else {
                    System.out.println(" es igual a 0");
                    iguales++;
                }
            }
            System.out.println("Los numeros mayores a 0 fueron: ");
            for (int e = 0; e < mayores; e++) {
                System.out.print(comp0[0][e]);
                if (e < comp0.length-1) {
                    System.out.print(",");
                }
            }

            System.out.println("Los numeros iguales a 0 fueron " + iguales);

            System.out.println("Los numeros menores a 0 fueron: ");
            for (int e = 0; e < menores; e++) {
                System.out.print(comp0[1][e]);
                if (e < comp0.length-1) {
                    System.out.print(",");
                }
            }
        }
    }
}
