package TALLER4.Condicionales;
import java.util.Scanner;

public class PTO13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca el resultado del lanzamiento de un dado de 6 caras: ");
            int d6 = sc.nextInt();
                switch (d6) {
                    case 1:
                    System.out.println("La cara opuesta es 6");
                        break;

                    case 2:
                    System.out.println("La cara opuesta es 5");
                        break;

                    case 3:
                    System.out.println("La cara opuesta es 4");
                        break;

                    case 4:
                    System.out.println("La cara opuesta es 3");
                        break;

                    case 5:
                    System.out.println("La cara opuesta es 2");
                        break;

                    case 6:
                    System.out.println("La cara opuesta es 3");
                        break;
                    default:
                    System.out.println("El numero ingresado no forma parte de un dado de 6 caras");
                }
        } 
    }
}
