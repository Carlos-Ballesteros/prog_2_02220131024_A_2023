package TALLER4.Condicionales;
import java.util.Scanner;

public class PTO9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un año:");
            int year = sc.nextInt();
            
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                        System.out.println(year + " es un año bisiesto.");
                } else {
                    System.out.println(year + " no es un año bisiesto.");    
                }
            }
        }
    }
}
