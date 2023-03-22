package co.edu.udes.correccionparcial;


import java.util.Scanner;

public class PTO3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Introduzca el numero de latas que quiere apilar: ");
       int nLatas = sc.nextInt();
       if(nLatas%2 != 0){
           System.out.println("las latas se pueden apilar");
       }else{
           System.out.println("las latas no se pueden apilar");
       }
    }
    
}
