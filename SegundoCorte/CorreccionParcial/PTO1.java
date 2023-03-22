package co.edu.udes.correccionparcial;

import java.util.Scanner;

public class PTO1 {

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en segundos: ");
        int tiempo = sc.nextInt();
        int dias = tiempo/86400;
        int horas = (tiempo%86400)/3600;
        int minutos = ((tiempo%86400)%3600)/60;
        int segundos = (tiempo%311040000)%60;
        System.out.println(dias +" dias, " + horas + " horas, " + minutos+ " minutos y " + segundos + " segundos.");
        
    }
    
}
