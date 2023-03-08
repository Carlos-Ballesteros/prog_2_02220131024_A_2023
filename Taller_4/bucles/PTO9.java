package TALLER4.Bucles;

import java.util.Scanner;

public class PTO9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números primos a mostrar: ");
        int cantidad = sc.nextInt();

        int contador = 0;
        int numero = 2;

        while (contador < cantidad) {
            boolean esPrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numero);
                contador++;
            }
            if (numero < cantidad) {
                numero++;
            }else{
                break;
            }
        }
        sc.close();
    }
}
