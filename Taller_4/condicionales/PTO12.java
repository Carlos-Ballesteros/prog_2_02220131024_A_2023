package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduzca la jornada en la que se hizo la llamada (Mañana/Tarde): ");
            String jornada = sc.nextLine();
            System.out.println("Introduzca el dia que se hizo la llamada: ");
            String dia = sc.nextLine();
            System.out.println("Introduzca la duracion de la llamada: ");
            System.out.print("Minutos:");
            int minutos = sc.nextInt();
            System.out.print("Segundos:");
            int segundos = sc.nextInt();
            double costo;
            if (minutos < 5) {
                costo = minutos+(segundos/60);
            } else if ( minutos == 5 || minutos < 8) {
                costo = 5 + ((minutos-5)+segundos/60)/80;
            } else if ( minutos == 8 || minutos < 10) {
                costo = 7.4 + ((minutos-5)+segundos/60)/70;
            } else {
                costo = 8.8 + ((minutos-5)+segundos/60)/50;
            }
            if (dia.equals("domingo")) {
                costo = costo + costo*0.03;
            }else {
                if (jornada.equals("mañana")) {
                    costo = costo + costo*0.15;
                } else {
                    costo = costo + costo*0.10;
                }
            }
            System.out.println("El precio a pagar por la llamada es de " + costo + " euros");
        }
    }
}
