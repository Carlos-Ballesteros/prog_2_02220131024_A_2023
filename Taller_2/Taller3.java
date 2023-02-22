import java.util.Random;
import java.util.Scanner;
public class Taller3 {
    
    public static void main(String[] args) {
        Random prgn = new Random(System.currentTimeMillis());
        Scanner leer = new Scanner(System.in);
        String[][] numeros = new String[24][5];
        leer.useDelimiter("\n");
        
        numeros[0][0] = "Nombre";
        numeros[0][1] = "  Costo";
        numeros[0][2] = "  Precio";
        numeros[0][3] = "  Ganancia";
        numeros[0][4] = "  Cantidad";
        System.out.println("Inventario usando un for");
        ForM(prgn, numeros, leer);

        System.out.println("Inventario usando un while");
        DoWhileM(prgn, numeros, leer);

        System.out.println("Inventario usando un do while");
        WhileM(prgn, numeros, leer);
    }

    private static void WhileM(Random prng, String[][] numeros, Scanner leer) {
        // Generar Precio, Costo, Ganancia, Cantidad.
        
        String[] tempVector = new String[5];
        int e = 1;
        while (e < 24) {

            // nombre productos
            System.out.print("Introduzca el nombre del producto: "); 
            String tempNombre = leer.nextLine();
            tempVector[0] = tempNombre;
            // costo producto
            System.out.print("Introduzca el costo del producto: ");
            tempVector[1] = leer.nextLine();
            int costo = Integer.parseInt(tempVector[1]);
            // precio producto
            System.out.print("Introduzca el precio del producto: ");
            tempVector[2] = leer.nextLine();
            int precio = Integer.parseInt(tempVector[2]);
            // ganancia por venta
            System.out.println("Calculando costo...");
            tempVector[3] = "" +(precio - costo);
            // cantidad producto
            System.out.print("Introzuca la cantidad: ");
            tempVector[4] = leer.nextLine();

            int f = 0;
            while (f < 5) {
                numeros[e][f] = "   " + tempVector[f];
                f++;
            }
            e++;
        }
        int f = 0;
        while (f < 24) {
            System.out.println(numeros[f][0]+numeros[f][1]+numeros[f][2]+numeros[f][3]+numeros[f][4]);
            f++;
        }
    }
    private static void DoWhileM(Random prng, String[][] numeros, Scanner leer) {
        // Generar Precio, Costo, Ganancia, Cantidad.
        
        String[] tempVector = new String[5];
        int e = 1;
        do {

            // nombre productos
            System.out.print("Introduzca el nombre del producto: "); 
            String tempNombre = leer.nextLine();
            tempVector[0] = tempNombre;
            // costo producto
            System.out.print("Introduzca el costo del producto: ");
            tempVector[1] = leer.nextLine();
            int costo = Integer.parseInt(tempVector[1]);
            // precio producto
            System.out.print("Introduzca el precio del producto: ");
            tempVector[2] = leer.nextLine();
            int precio = Integer.parseInt(tempVector[2]);
            // ganancia por venta
            System.out.println("Calculando costo...");
            tempVector[3] = "" +(precio - costo);
            // cantidad producto
            System.out.print("Introzuca la cantidad: ");
            tempVector[4] = leer.nextLine();

            int f = 0;
            do {
                numeros[e][f] = "   " + tempVector[f];
                f++;
            }while (f < 5);
            e++;
        }while (e < 24);
        int f = 0;
        do {
            System.out.println(numeros[f][0]+numeros[f][1]+numeros[f][2]+numeros[f][3]+numeros[f][4]);
            f++;
        }while (f < 24);
    }

    public static void ForM(Random prng,String[][] numeros, Scanner leer) {
        // Generar Precio, Costo, Ganancia, Cantidad.
        
        System.out.println(numeros[0][0]+numeros[0][1]+numeros[0][2]+numeros[0][3]+numeros[0][4]);
        
        String[] tempVector = new String[5];
        
        for (int e = 1; e < 24; e++) {
             // nombre productos
            System.out.println(e + "////////////////////////////////////////////////");
            System.out.print("Introduzca el nombre del producto: "); 
            String tempNombre = leer.nextLine();
            tempVector[0] = tempNombre;
             // costo producto
            System.out.print("Introduzca el costo del producto: ");
            tempVector[1] = leer.nextLine();
            int costo = Integer.parseInt(tempVector[1]);
             // precio producto
            System.out.print("Introduzca el precio del producto: ");
            tempVector[2] = leer.nextLine();
            int precio = Integer.parseInt(tempVector[2]);
             // ganancia por venta
            System.out.println("Calculando costo...");
            tempVector[3] = "" +(precio - costo);
             // cantidad producto
            System.out.print("Introzuca la cantidad: ");
            tempVector[4] = leer.nextLine();

            for (int f = 0; f < 5; f++) {
                numeros[e][f] = "   " + tempVector[f];
            }
        }
        
        for (int e = 0; e < 24; e++) {
            System.out.println(numeros[e][0] + numeros[e][1] + numeros[e][2] + numeros[e][3] + numeros[e][4]);
            }
    }
}