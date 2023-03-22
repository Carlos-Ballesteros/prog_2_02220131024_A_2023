package co.edu.udes.correccionparcial;


import java.util.Scanner;

public class PTO4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca cuantos numeros quiere ver: ");
        int cantidad = sc.nextInt();
        int fibnacc[] = new int[cantidad];
        fibnacc[0]=0;
        fibnacc[1]=1;
        for(int e = 0;e <cantidad; e++){
        if(e<=1){
            System.out.println(e);
        }else{
            System.out.println(fibnacc[e]=fibnacc[e-1]+fibnacc[e-2]);
        }
        }
    }
}
