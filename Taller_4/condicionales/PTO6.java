package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese la nota, edad y sexo");
            System.out.print("Sexo [M: masculino / F: femenino]: ");
            Double nota = sc.nextDouble();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            String sexo = sc.nextLine();
            System.out.print("Nota: ");

            if (edad >= 18 && nota >= 5) {
                if (sexo.equals("f")) {
                    System.out.println("Solicitud aceptada");
                }else{
                    System.out.println("Solicitud posible");
                }
            } else {
                System.out.println("Solicitud no aceptada");
            }
        }
    }
}
