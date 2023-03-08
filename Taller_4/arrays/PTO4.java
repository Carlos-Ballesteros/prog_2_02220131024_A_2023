package TALLER4.Array;

public class PTO4 {
    public static void main(String[] args) {
        int[][] numeros = new int[4][5];
        
        System.out.println("Generando numeros ...");
        for (int e = 0; e < 4; e++) {
            for (int f = 0; f < 5; f++) {
                numeros[e][f] = (int) ((Math.random()*999)+100);
            }
        }
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
                System.out.printf("%10d", numeros[i][j]);
            }
            sumaTotal += sumaFila;
            System.out.printf("%10d%n", sumaFila);
        }
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            sumaTotal += sumaColumna;
            System.out.printf("%10d", sumaColumna);
        }
        System.out.printf("%10d%n", sumaTotal);
    }
}
