package TALLER4.Array;

import java.util.Scanner;

public class PTO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        for (int e = 0; e < 4; e++) {
            for (int f = 0; f < 5; f++) {
                System.out.print("Ingrese un numero entero: ");
                numeros[e][f] = sc.nextInt();
            }
        }
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
                System.out.printf("%5d", numeros[i][j]);
            }
            sumaTotal += sumaFila;
            System.out.printf("%5d%n", sumaFila);
        }
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%5d", sumaColumna);
        }
        System.out.printf("%5d%n", sumaTotal);
        sc.close();
    }
}
