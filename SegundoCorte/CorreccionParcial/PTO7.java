package co.edu.udes.correccionparcial;

import java.util.Arrays;
import java.util.Scanner;

public class PTO7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Introduzca el largo de ambos vectores");
        System.out.print("Vector 1: ");
        int[] vec1 = new int[sc.nextInt()];
            System.out.println("Llene el vector");
                for(int e = 0; e < vec1.length; e++){
                    System.out.println("num " + (e+1) + ": ");
                    vec1[e] = sc.nextInt();
                }
        System.out.print("Vector 2: ");
        int[] vec2 = new int[sc.nextInt()];
            System.out.println("Llene el vector");
                for(int e = 0; e < vec2.length; e++){
                    System.out.println("num " + (e+1) + ": ");
                    vec2[e] = sc.nextInt();
                }        
        int[] vec3= new int[vec1.length+vec2.length];
        for(int e = 0; e < vec1.length; e++){
            vec3[e]=vec1[e];
        }
        for(int e = vec1.length+1; e < vec3.length; e++){
            for(int f = 0; e < vec2.length; e++){
            vec3[e]=vec2[f];
            }
        }
        Arrays.sort(vec3);
        for(int e = 0; e < vec3.length; e++){
            System.out.println(" " + vec3[e]);
        }
    
    }
    
}
