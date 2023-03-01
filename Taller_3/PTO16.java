package TALLER3;

import java.util.Scanner;

public class PTO16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la velocidad del vehiculo 1 en km/h");
        double vel1 = sc.nextDouble();
        System.out.println("Introduzca la velocidad del vehiculo 2 en km/h");
        double vel2 = sc.nextDouble();
        System.out.println("Introduzca la distancia entre ambos vehiculos en km");
        double distancia = sc.nextDouble();

        if (vel1<vel2) {
            System.out.println(vel2-vel1);
            System.out.println("El vehiculo 2 alcanzara al vehiculo 1 en " + (distancia/(vel2-vel1))*60 + " minutos");
        }else{
            System.out.println(vel1-vel2);
            System.out.println("El vehiculo 1 alcanzara al vehiculo 2 en " + (distancia/(vel1-vel2))*60 + " minutos");
        }

    }
}
