package TALLER3;

import java.util.Scanner;

public class PTO10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese sus notas de parciales: ");
        double prom = 0;
        for (int i = 0; i < 3; i++) {
            prom = prom + sc.nextInt();
        }
        prom = prom/3;
        
        System.out.println("Introduzca la calificacion del examen final: ");
            double exam = sc.nextDouble();

        System.out.println("Introduzca la calificacion del trabajo final: ");
            double trab = sc.nextDouble();
        
        System.out.println("La nota final es de " + (prom*0.55 + exam*0.3 + trab*0.15) );
    }
}
