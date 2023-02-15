import java.util.Random;
public class Taller3 {
    public static void main(String[] args) {
        Random prgn = new Random(System.currentTimeMillis());
        String[][] numeros = new String[24][5];
        

        // System.out.println("Inventario usando un for");
        // forM(prgn, numeros);

        System.out.println("Inventario usando un while");
        WhileM(prgn, numeros);

        // System.out.println("Inventario usando un do while");
        // forM(prgn, numeros);
    }

    private static void WhileM(Random prng, String[][] numeros) {
        // Generar Precio, Costo, Ganancia, Cantidad.
        
        numeros[0][0] = "Numero del Producto";
        numeros[0][1] = "  Costo";
        numeros[0][2] = "  Precio";
        numeros[0][3] = "  Ganancia";
        numeros[0][4] = "  Cantidad";
            System.out.println(numeros[0][0]+numeros[0][1]+numeros[0][2]+numeros[0][3]+numeros[0][4]);
        
        int[] tempVector = new int[5];
        int e = 1;
        while (e < 24) {
            int tempNumeros = 0; 
            // numero productos
            tempVector[0] = e; 
            // costo producto
            tempNumeros = (prng.nextInt(100)+1)*1000;
            tempVector[1] = tempNumeros;
            // precio producto
            tempNumeros = (int) (tempVector[1] + (tempVector[1]*0.10));
            tempVector[2] = tempNumeros;
            // ganancia por venta
            tempNumeros = (int) (tempVector[1] -  tempVector[2])*-1;
            tempVector[3] = tempNumeros;
            // cantidad producto
            tempNumeros = prng.nextInt(100)+1;
            tempVector[4] = tempNumeros;

            int f = 0; 
            while (f < 5) {
                numeros[e][f] = "   " + tempVector[f];
                f++;
            }
            System.out.println(numeros[e][0]+numeros[e][1]+numeros[e][2]+numeros[e][3]+numeros[e][4]);
            e++;
        }
    }

    public static void forM(Random prng,String[][] numeros) {
        // Generar Precio, Costo, Ganancia, Cantidad.
        
        numeros[0][0] = "Numero del Producto";
        numeros[0][1] = "  Costo";
        numeros[0][2] = "  Precio";
        numeros[0][3] = "  Ganancia";
        numeros[0][4] = "  Cantidad";
            System.out.println(numeros[0][0]+numeros[0][1]+numeros[0][2]+numeros[0][3]+numeros[0][4]);
        
            
        int[] tempVector = new int[5];
        
        for (int e = 1; e < 24; e++) {
            int tempNumeros = 0; 
            // numero productos
            tempVector[0] = e;
            // costo producto
            tempNumeros = (prng.nextInt(100)+1)*1000;
            tempVector[1] = tempNumeros;
            // precio producto
            tempNumeros = (int) (tempVector[1] + (tempVector[1]*0.10));
            tempVector[2] = tempNumeros;
            // ganancia por venta
            tempNumeros = (int) (tempVector[1] -  tempVector[2])*-1;
            tempVector[3] = tempNumeros;
            // cantidad producto
            tempNumeros = prng.nextInt(100)+1;
            tempVector[4] = tempNumeros;

            for (int f = 0; f < 5; f++) {
                numeros[e][f] = "   " + tempVector[f];
            }
            System.out.println(numeros[e][0]+numeros[e][1]+numeros[e][2]+numeros[e][3]+numeros[e][4]);
        }
    }
}
