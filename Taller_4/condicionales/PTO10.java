package TALLER4.Condicionales;
import java.util.Scanner;

public class PTO10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el tipo de uva (A o B): ");
            String tipo = sc.nextLine();
            System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
            int tamaño = sc.nextInt();
            System.out.print("Ingrese la cantidad de kilos entregados: ");
            double kilos = sc.nextDouble();
            double pInicial;
            if (tipo.equals("A") || tipo.equals("a")) { 
                if (tamaño == 1) {
                    pInicial = 0.20;
                }else{
                    pInicial = 0.30;
                }
            } else {
                if (tamaño == 1) {
                    pInicial = -0.30;
                }else{
                    pInicial = -0.50;
                }
            }


            System.out.println("El precio a pagar es de $" +Math.abs( kilos*pInicial ) + " euros");
        }
    }
}
