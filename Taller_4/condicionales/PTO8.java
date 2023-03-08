package TALLER4.Condicionales;
import java.util.Scanner;

public class PTO8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el primer lado del triángulo:");
            double l1 = sc.nextDouble();
            System.out.println("Ingrese el segundo lado del triángulo:");
            double l2 = sc.nextDouble();
            System.out.println("Ingrese el tercer lado del triángulo:");
            double l3 = sc.nextDouble();
            
            if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
                if (l1 == l2 && l1 == l3) {
                    System.out.println("El triángulo es equilátero.");
                } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                    System.out.println("El triángulo es isósceles.");
                } else if (Math.pow(l1, 2) + Math.pow(l2, 2) == Math.pow(l3, 2) ||
                    Math.pow(l1, 2) + Math.pow(l3, 2) == Math.pow(l2, 2) ||
                    Math.pow(l2, 2) + Math.pow(l3, 2) == Math.pow(l1, 2)) {
                    System.out.println("El triángulo es rectángulo.");
                } else {
                    System.out.println("El triángulo es escaleno.");
                }
            } else {
                System.out.println("Los lados ingresados no forman un triángulo válido.");
            }
        }
    }
}
