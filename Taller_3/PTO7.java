package TALLER3.EJERCICIOSBASICOS;

import java.util.Scanner;

/**
 * PTO7
 */
public class PTO7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        double min = sc.nextDouble();
        double horas = min/60;
        double segundos = min*60;
        System.out.println("Equivale a " + horas + " horas o " + segundos + " segundos");
    }
}