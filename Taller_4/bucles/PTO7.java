package TALLER4.Bucles;

import java.util.Scanner;

public class PTO7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioTotal = sc.nextDouble();
        System.out.print("Ingrese la cantidad de meses para pagar: ");
        int plazoMeses = sc.nextInt();
        
        double pagoMensual = precioTotal / plazoMeses;
        double totalPagado = 0;
        for (int mes = 1; mes <= plazoMeses; mes++) {
            double pagoMes = pagoMensual * Math.pow(2, mes - 1);
            totalPagado += pagoMes;
            System.out.println("Mes: " + mes + " Pago mensual: $"+ mes + " euros");
        }
        System.out.println("Total pagado después de " + plazoMeses + " meses: $" + totalPagado + " euros");
        sc.close();
    }
}
