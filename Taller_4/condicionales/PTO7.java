package TALLER4.Condicionales;
import java.util.Scanner;

public class PTO7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese las coordenadas del centro de la primera circunferencia:");
            System.out.print("x: ");
            double x1 = sc.nextDouble();
            System.out.print("y: ");
            double y1 = sc.nextDouble();
            System.out.print("Ingrese el radio de la primera circunferencia:");
            double r1 = sc.nextDouble();
            System.out.println("Ingrese las coordenadas del centro de la segunda circunferencia:");
            System.out.print("x: ");
            double x2 = sc.nextDouble();
            System.out.print("y:");
            double y2 = sc.nextDouble();
            System.out.print("Ingrese el radio de la segunda circunferencia:");
            double r2 = sc.nextDouble();
            
            double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            
            if (d > r1 + r2) {
                System.out.println("Las circunferencias son exteriores.");
            } else if (d == r1 + r2) {
                System.out.println("Las circunferencias son tangentes exteriores.");
            } else if (d > Math.abs(r2 - r1) && d < r1 + r2) {
                System.out.println("Las circunferencias son secantes.");
            } else if (d == Math.abs(r2 - r1)) {
                System.out.println("Las circunferencias son tangentes interiores.");
            } else if (d < Math.abs(r2 - r1)) {
                System.out.println("Las circunferencias son interiores.");
            } else if (d == 0 && r1 == r2) {
                System.out.println("Las circunferencias son concéntricas.");
            } else {
                System.out.println("Las circunferencias no se pueden clasificar.");
            }
        }
    }
}
