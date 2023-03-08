package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un numero ");
            double num = sc.nextDouble();
            System.out.print("Ingrese su exponente ");
            double exp = sc.nextDouble();

            if (exp > 0) {
                System.out.println( num + " elevado a la potencia de " + exp + " es " + Math.pow(num, exp));
            } else if(exp < 0){
                System.out.println( num + " elevado a la potencia de " + exp + " es 1/" + Math.pow(num, -(exp)));
            }else if( exp == 0){
                System.out.println( num + " elevado a la potencia de 0 es 1" );
            }else {
                System.out.println("0 elevado a la 0 es indefinido");
            }
            
        }
    }
}
