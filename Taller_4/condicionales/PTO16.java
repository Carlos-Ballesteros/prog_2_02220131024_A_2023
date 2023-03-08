package TALLER4.Condicionales;

import java.util.Scanner;

public class PTO16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String destino = sc.nextLine();
            double peso = sc.nextDouble();
                if (peso < 5) {
                    switch (destino) {
                        case "america del norte":
                            
                            break;
                    
                        case "america central":
                            
                            break;
                    
                        case "america del sur":
                            
                            break;
                    
                        case "europa":
                            
                            break;
                    
                        case "Asia":
                            
                            break;
                    }
                }else{
                    System.out.println("Los paquetes de mas de 5kg no son trnasportados");
            }
        }
    }
}

