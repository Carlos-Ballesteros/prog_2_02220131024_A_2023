package TALLER3;

import java.util.Scanner;

public class PTO11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int diferencia = Math.abs(num1 - num2);
        System.out.println("La distancia entre ambos numeros es " + diferencia);
    }
}
