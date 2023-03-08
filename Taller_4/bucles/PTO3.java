package TALLER4.Bucles;

import java.util.Scanner;

public class PTO3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduzca un caracter");
            String chars = sc.nextLine();

            while (!chars.isBlank()) {

                if (chars.matches("[aeiouAEIOU]")) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
                System.out.println("Introduzca un caracter, introduzca un espacio para salir");
                chars = sc.nextLine();
            }
        }
    }
}
