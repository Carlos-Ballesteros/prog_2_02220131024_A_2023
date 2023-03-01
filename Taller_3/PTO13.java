package TALLER3;

import java.util.Scanner;

public class PTO13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if (num > 0) {
            double sqrt = Math.sqrt(num); 
            System.out.println("La raiz cuadrada es " + sqrt);
        }else{
            System.out.println("No se puede sacar la raiz cuadrada a numeros negativos");
        }
        double cbrt = Math.cbrt(num);
        System.out.println("La raiz cubica es " + cbrt);
    }
}
