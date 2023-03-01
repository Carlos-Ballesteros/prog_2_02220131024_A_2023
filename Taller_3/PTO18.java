package TALLER3;

import java.util.Scanner;

public class PTO18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un nombre y dos apellidos");
        String nombre = sc.nextLine();
        String apellido1 = sc.nextLine();
        String apellido2 = sc.nextLine();

        System.out.println("Sus iniciales son " + nombre.charAt(0) + ". " + apellido1.charAt(0) + ". " + apellido2.charAt(0));
    }
}
