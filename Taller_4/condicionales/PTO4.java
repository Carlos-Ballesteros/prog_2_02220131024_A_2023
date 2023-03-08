package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una palabra: ");
            String palabra = sc.nextLine();
            if (palabra.equals(palabra.toUpperCase())) {
                System.out.println("La cadena empieza con una mayuscula");
            }else {
                System.out.println("La cadena no es mayuscula");
            }
        }
    }
}
