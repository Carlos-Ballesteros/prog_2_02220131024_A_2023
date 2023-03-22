/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.correccionparcial;

import java.util.Scanner;

/**
 *
 * @author xcarl
 */
public class PTO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la fecha [formato fecha/mes/año numerico]: ");
        String fechaStr = sc.nextLine();
        String[] fecha = fechaStr.split("/");
        int day = Integer.parseInt(fecha[0]);
        int month = Integer.parseInt(fecha[1]);
        int year = Integer.parseInt(fecha[2]);
                
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))){
            switch (month) {
                case 1,3,5,7,8,10,12:
                    if(day > 0 && day<=31){
                        System.out.println("La fecha es valida");
                    }else{
                        System.out.println("La fecha es invalida");
                    }
                        
                    break;

                case 4,6,9,11:
                    if(day > 0 && day<=30){
                        System.out.println("La fecha es valida");
                    }else{
                        System.out.println("La fecha es invalida");
                    }
                    
                    break;

                case 2:
                    if(day > 0 && day<=29){
                        System.out.println("La fecha es valida");
                    }else{
                        System.out.println("La fecha es invalida");
                    }
                    break;
                default:
                    break;
            }
        }else{
                        switch (month) {
                case 1,3,5,7,8,10,12:
                    if(day > 0 && day<=31){
                        System.out.println("La fecha es valida");
                    }else{
                        System.out.println("La fecha es invalida");
                    }
                        
                    break;

                case 4,6,9,11:
                    if(day > 0 && day<=30){
                        System.out.println("La fecha es valida");
                    }else{
                        System.out.println("La fecha es invalida");
                    }
                    
                    break;

                case 2:
                    if(day > 0 && day<=28){
                        System.out.println("La fecha es valida");
                    }else{
                        System.out.println("La fecha es invalida");
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
}
