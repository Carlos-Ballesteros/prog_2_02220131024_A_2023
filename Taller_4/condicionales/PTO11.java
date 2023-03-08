package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO11 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de alumnos");
        try (Scanner sc = new Scanner(System.in)) {
            int cantAlumnos = sc.nextInt();
            int pAlumno = 0; 
            if (cantAlumnos>=100) {
                pAlumno = 65;
            } else if (cantAlumnos >= 50 && cantAlumnos <= 99) {
                pAlumno = 70;
            } else if (cantAlumnos >= 30 && cantAlumnos <= 49) {
                pAlumno = 95;
            }

            if (cantAlumnos < 30) {
                System.out.println("El precio costo de alquilar el bus es de 4000 por lo que cada alunmo debe pagar " + (4000/cantAlumnos));
            } else {
                System.out.println("Se le va a pagar  " + (cantAlumnos*pAlumno) + " por a la compañia de autobuses y lo que cada alunmo debe pagar es " + pAlumno);
            }
        }
    }
}
