import java.util.Arrays;
import java.util.Random;

public class Taller2 {
    public static void main(String[] args) {
        Random prgn = new Random(System.currentTimeMillis());
        int[] numeros = new int[prgn.nextInt(753)+1];
        int largo = numeros.length;
        System.out.println("For "+forM(numeros, largo, prgn));
        System.out.println("\nWhile " + WhileM(numeros, largo, prgn));
        System.out.println("\nDo While " + WhileM(numeros, largo, prgn));
    }

    public static String forM(int[] numeros, int largo, Random prgn) {

        double promedio = 0;
        double sumaPromedio = 0;
        
        // generar numeros / suma promedio
        for (int e = 0; e < largo; e++) {
            int genNum = prgn.nextInt(24);
            numeros[e] = genNum;
            sumaPromedio+= numeros[e];
        }
        Arrays.sort(numeros);
        promedio = sumaPromedio/largo;

        // calc mediana 
        int mediana = 0;
        if (numeros.length%2 == 0) {
            mediana= numeros[(largo/2)-1] + numeros[largo/2];
        }else{
            mediana = numeros[largo/2];
        }

        // calc moda
        int[] numDif = new int[largo];
        for (int e = 0; e < largo; e++) {
            numDif[e] = -1; // poner -1 para asegurarse de que no se cuenta uno por accidente
        }
        int posZ = 0;
        for (int posX = 0; posX < numDif.length; posX++) {
            int num = numeros[posX];
            int contadorNumExist = 0;
            for (int posY = 0; posY < numDif.length; posY++) {
                if (num == numDif[posY]) {
                    contadorNumExist++;
                }
            }
            if (contadorNumExist == 0) {
                numDif[posZ] = num;
                posZ++;
            }
        }
        int cuentaNum[] = new int[posZ];
        for (int posW = 0; posW < posZ; posW++) {
            int numDis = numDif[posW];
            for (int posV = 0; posV < largo; posV++) {
                if (numDis == numeros[posV]) {
                    cuentaNum[posW]++;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int numEncontrado = -1;
        for (int posNum = 0; posNum < cuentaNum.length; posNum++) {
            if (max < cuentaNum[posNum]) {
                numEncontrado = numDif[posNum];
                max = cuentaNum[posNum];
            }
        }
        int moda = numEncontrado;

        return ("\nCantidad " + largo + "\nLista de numeros: \n" + Arrays.toString(numeros) + "\n Promedio: " + sumaPromedio + "/" + largo + "=" + promedio + "\n Mediana: " + mediana + "\n Moda: " + moda);
    }

    public static String WhileM(int[] numeros, int largo, Random prgn) {

        double promedio = 0;
        double sumaPromedio = 0;
        
        // generar numeros / calc promedio
        int e = 0;
        while (e < largo-1) {
            e++; 
            int genNum = prgn.nextInt(24);
            numeros[e] = genNum;
            sumaPromedio+= numeros[e];
        }
        Arrays.sort(numeros);
        
        int cociente = 0;
        double dividendo;
        dividendo = sumaPromedio;
        while (dividendo>0) {
            cociente++;
            dividendo-=largo;
        }
        
        promedio = cociente;

        // calc mediana 
        int mediana = 0;
        if (numeros.length%2 == 0) {
            mediana= numeros[(largo/2)-1] + numeros[largo/2];
        }else{
            mediana = numeros[largo/2];
        }

        // calc moda
        int[] numDif = new int[largo];
        int m =0;
        while(m < largo-1) {
            m++;
            numDif[e] = -1; // poner -1 para asegurarse de que no se cuenta uno por accidente
        }
        int posZ = 0;
        int posX = 0;
        while(posX < numDif.length) {
            posX++;
            int num = numeros[posX-1];
            int contadorNumExist = 0;
            int posY = 0;
            while ( posY < numDif.length-1) {
                posY++;
                if (num == numDif[posY-1]) {
                    contadorNumExist++;
                }
            }
            if (contadorNumExist == 0) {
                numDif[posZ] = num;
                posZ++;
            }
        }
        int posW = 0;
        int cuentaNum[] = new int[posZ];
        while (posW < posZ) {
            posW++;
            int numDis = numDif[posW];
            int posV = 0; 
            while (posV < largo-1) {
                posV++;
                if (numDis == numeros[posV]) {
                    cuentaNum[posW-1]++;
                }
            }
        }
        int posNum = 0;
        int max = Integer.MIN_VALUE;
        int numEncontrado = -1;
        while ( posNum < cuentaNum.length-1) {
            posNum++;
            if (max < cuentaNum[posNum]) {
                numEncontrado = numDif[posNum];
                max = cuentaNum[posNum];
            }
        }
        int moda = numEncontrado;

        return ("\nCantidad " + largo + "\nLista de numeros: \n" + Arrays.toString(numeros) + "\n Promedio: " + sumaPromedio + "/" + largo + "=" + promedio + "\n Mediana: " + mediana + "\n Moda: " + moda);
    }
    public static String doWhileM(int[] numeros, int largo, Random prgn) {

        double promedio = 0;
        double sumaPromedio = 0;
        
        // generar numeros / suma promedio
        int e = 0;
        do {
            e++; 
            int genNum = prgn.nextInt(24);
            numeros[e] = genNum;
            sumaPromedio+= numeros[e];
        } while (e < largo-1);
        Arrays.sort(numeros);
        int cociente = 0;
        double dividendo;
        dividendo = sumaPromedio;
        do {
            cociente++;
            dividendo-=largo;
        }while (dividendo>0);
        
        promedio = cociente;

        // calc mediana
        int mediana = 0;
        cociente = 0;
        
        dividendo = numeros.length;

        if (numeros.length%2 == 0) {
            do {
                cociente++;
                dividendo-=2;
            }while (dividendo>0);
            mediana= (numeros[(cociente-1)] + numeros[cociente]);
            cociente = 0;
            do {
                cociente++;
                mediana-=2;
            }while (mediana>0);
            mediana = cociente;
        }else{
            mediana = numeros[largo/2];
        }

        // calc moda
        int[] numDif = new int[largo];
        int m =0;
        do  {
            m++;
            numDif[e] = -1; // poner -1 para asegurarse de que no se cuenta uno por accidente
        } while(m < largo);
        int posZ = 0;
        int posX = 0;
        do {
            posX++;
            int num = numeros[posX];
            int contadorNumExist = 0;
            int posY = 0;
            do{
                posY++;
                if (num == numDif[posY]) {
                    contadorNumExist++;
                }
            }while ( posY < numDif.length);
            if (contadorNumExist == 0) {
                numDif[posZ] = num;
                posZ++;
            }
        }while(posX < numDif.length);
        int posW = 0;
        int cuentaNum[] = new int[posZ];
        do {
            posW++;
            int numDis = numDif[posW];
            int posV = 0; 
            do {
                posV++;
                if (numDis == numeros[posV]) {
                    cuentaNum[posW]++;
                }
            }while (posV < largo);
        }while (posW < posZ);
        int posNum = 0;
        int max = Integer.MIN_VALUE;
        int numEncontrado = -1;
        do {
            posNum++;
            if (max < cuentaNum[posNum]) {
                numEncontrado = numDif[posNum];
                max = cuentaNum[posNum];
            }
        }while ( posNum < cuentaNum.length);
        int moda = numEncontrado;

        return ("\nCantidad " + largo + "\nLista de numeros: \n" + Arrays.toString(numeros) + "\n Promedio: " + sumaPromedio + "/" + largo + "=" + promedio + "\n Mediana: " + mediana + "\n Moda: " + moda);
    }


}
