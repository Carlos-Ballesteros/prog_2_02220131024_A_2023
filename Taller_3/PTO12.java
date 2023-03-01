package TALLER3;

import java.util.Scanner;

public class PTO12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la primera coordenada");
        int cordX1 = sc.nextInt();
        int cordY1 = sc.nextInt();
        System.out.println("Introduzca la segunda coordenada");
        int cordX2 = sc.nextInt();
        int cordY2 = sc.nextInt();

        double distancia = (cordX1 - cordX2)^2 - (cordY1 - cordY2)^2;
        if (distancia < 0) {
            distancia = Math.abs(distancia);
        }
        System.out.println("La distancia entre ambos puntos es " + distancia);
    }
}
