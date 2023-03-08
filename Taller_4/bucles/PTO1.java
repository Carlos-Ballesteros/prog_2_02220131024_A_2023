package TALLER4.Bucles;

import java.util.Random;
import java.util.Scanner;

public class PTO1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random pRNG = new Random(System.currentTimeMillis());
            int numAdivinar = pRNG.nextInt(100)+1 ;
            boolean adivinado = false;

            int contador =0;
            while (!adivinado) {
                contador++;
                System.out.println("Intento #" + contador);
                System.out.println("Introduzca un numero entero del 1 al 100"); 
                    int num = sc.nextInt();
                if (numAdivinar == num) {
                    System.out.println("A adivinado el numero");
                    adivinado = true;
                }else if (numAdivinar > num) {
                    System.out.println("El numero introducido es menor");
                } else if(numAdivinar < num){
                    System.out.println("El numero introducido es mayor");
                }
                if (contador == 10) {
                    System.out.println("No tiene mas intentos");
                    adivinado = true;
                }
            }
            if (adivinado && contador == 10) {
                System.out.println("A perdido, el numero a adivinar era " + numAdivinar);
            }
        }
    }
}
