package TALLER4.Array;

import java.util.Scanner;

public class PTO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        for (int e = 0; e < 10; e++) {
            System.out.print("Ingrese un numero: ");
            nums[e] = sc.nextDouble();
        }
        for (int e = 9; e >= 0; e--) {
            System.out.println(nums[e]);
        }
        sc.close();
    }
}
