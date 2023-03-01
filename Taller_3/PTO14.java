package TALLER3;

import java.util.Scanner;

public class PTO14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero de dos cifras");
        int num = sc.nextInt();
            if (!((num > -99 && num < 99) && (num > -9 && num < 9))) {
                for (int e = 1; e > 0; e--) {
                    String inv = "" + num;
                    if (num < 0) {
                    System.out.print("El numero invertido es " + inv.charAt(2) + "" + inv.charAt(1) + "" + inv.charAt(0));
                    }else{
                        System.out.print("El numero invertido es " + inv.charAt(1) + "" + inv.charAt(0));
                    }
                }
            }else{
                System.out.println("No ingreso un numero valido");
                num = sc.nextInt();
            }
    }
}
