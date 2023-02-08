import java.util.Scanner;

public class Taller1 {
    static char[] palabraVector;
    int largo = 0;
    private static Scanner leer;
    public static void main(String[]args){
    


    System.out.println("Por favor ingrese una palabra");    
        leer = new Scanner(System.in);
            String palabra = leer.nextLine();
            int largo = palabra.length();
            palabraVector =new char[largo];

            // Llamadas de Metodos
            System.out.println("La palabra invertida usando un for: " + forM(largo, palabra));
            System.out.println("La palabra invertida usando un do while: " + doWhileM(largo, palabra));
            System.out.println("La palabra invertida usando un while: " + whileM(largo, palabra));
    }

    private static String whileM(int largo, String palabra) {
        int e = largo;
        while (e > largo ) {
            palabraVector[largo - e - 1] = palabra.charAt(e);

        }
        return String.copyValueOf(palabraVector);    
    }

    private static String doWhileM(int largo, String palabra) {
        int e = 0;

        do {
        palabraVector[largo - e - 1] = palabra.charAt(e);
            e++;    
        } while (e < largo);
        return String.copyValueOf(palabraVector);
    }

    private static String forM(int largo, String palabra) {
        for (int e=0; e < largo; e++){
            palabraVector[largo - e - 1] = palabra.charAt(e);
        }
        return String.copyValueOf(palabraVector);
    }
}
