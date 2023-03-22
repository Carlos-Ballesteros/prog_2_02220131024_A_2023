package co.edu.udes.correccionparcial;

import java.util.Scanner;

public class PTO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduzca una frase");
        String fraseStr = sc.nextLine();
        String[] frase = fraseStr.split(" ");
        System.out.println("Hay " + frase.length + " palabras");
    }
    
}
