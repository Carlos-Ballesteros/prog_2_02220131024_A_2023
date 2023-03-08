package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Introduzca el dia de la semana: [1:Lunes - 7:Domingo]");
            int dia = sc.nextInt();
            switch (dia) {
                case 1:
                System.out.println("Lunes");
                    break;

                case 2:
                System.out.println("Martes");
                    break;

                case 3:
                System.out.println("Miercoles");
                    break;

                case 4:
                System.out.println("jueves");
                    break;

                case 5:
                System.out.println("Viernes");
                    break;

                case 6:
                System.out.println("Sabado");
                    break;
                
                case 7:
                System.out.println("Domingo");
                    break;
                    
                default:
                System.out.println("El numero ingresado no forma parte de un dado de 6 caras");
                    break;
            }
        } 
    }
}
