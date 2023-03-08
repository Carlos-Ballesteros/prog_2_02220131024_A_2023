package TALLER4.Bucles;

import java.util.Scanner;

public class PTO5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca el limite inferior: ");
            int limInferior = sc.nextInt();
            System.out.print("Introduzca el limite superior: ");
            int limSuperior = sc.nextInt();
            
            double[] numeros = new double[limSuperior];
            double num = -1;
            while(limSuperior < limInferior){
                System.out.println("El limite inferior es menor al superior, introduzca los limites de nuevo:");
                System.out.println("Limite Inferior: ");
                limInferior = sc.nextInt();
                System.out.println("Limite Superior: ");
                limSuperior = sc.nextInt();
            }
            int i=-1;
            int fuera = 0;
            boolean igualLim= false;
            while (num!=0) {
                System.out.print("Introduzca un numero: ");
                num = sc.nextDouble();
                if (num>limInferior && num<limSuperior) {
                    i++;
                    numeros[i] = num;
                    System.out.println(numeros[i] + "  " + num);
                }else if (num == limInferior || num == limSuperior) {
                    igualLim = true;
                }else{
                    fuera++;
                }
            }
            double sumNum = 0;
            for (int e = 0; e < numeros.length; e++) {
                sumNum+= numeros[e];
            }
            System.out.println("La suma de los numeros dentro del intervalo es: " + sumNum 
                            +  "\nQuedaron " + fuera + " numeros fuera del intervalo");
            if (igualLim) {
                System.out.println("Se introdujeron numeros iguales a los limites");
            }
        }
    }
}