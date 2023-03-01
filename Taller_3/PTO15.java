package TALLER3;

import java.util.Scanner;

public class PTO15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca dos valores");
        int[] nums = {sc.nextInt(), sc.nextInt()};
        
        for (int e = 0; e < nums.length; e++) {
            for (int f = e++; f < nums.length; f++) {
                int sortear = nums[e]; 
                nums[e] = nums[f];
                nums[f] = sortear;
            }
        }
        System.out.println("El valor en la primera posicion ahora es " + nums[0] + " y el de la segunda posicion es " + nums[1]);
    }
}
