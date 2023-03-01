package TALLER3.EJERCICIOSBASICOS;

import java.util.Scanner;

public class PTO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en fahrenheit");
        double temperatura = sc.nextDouble();
        temperatura = (temperatura - 32) / 1.8;
        System.out.println("La temperatura en celsius es de: " + temperatura);
    }
}