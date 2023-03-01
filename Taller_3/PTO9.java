package TALLER3.EJERCICIOSBASICOS;

import java.util.Scanner;

public class PTO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su total para aplicarle el 15% de descuento");
        double total = sc.nextInt();
        total =  total - (total*0.15);
        System.out.println("El precio final es de " + (int)total);
    }
}
