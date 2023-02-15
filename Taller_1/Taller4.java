import java.util.Scanner;

public class Taller4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] crucigrama  = new String[5];

            System.out.println("INTRODUZCA PALABRA 1");
            crucigrama[0] = leer.nextLine();
            System.out.println("INTRODUZCA PALABRA 2");
            crucigrama[1] = leer.nextLine();
            System.out.println("INTRODUZCA PALABRA 3");
            crucigrama[2] = leer.nextLine();
            System.out.println("INTRODUZCA PALABRA 4");
            crucigrama[3] =  leer.nextLine();
            System.out.println("INTRODUZCA PALABRA 5");
            crucigrama[4] =  leer.nextLine();
            System.out.println("\n");
        
            System.out.println("Usando for");
            forM(crucigrama);
            System.out.println("Usando while");
            whileM(crucigrama);
            System.out.println("Usando do while");
            doDhileM(crucigrama);

    }

    private static void whileM(String[] crucigrama) {
        String sortear = "";
        int e = 0;
        while (e < crucigrama.length) {
            int f = 0;
            while (f < crucigrama.length) {
                if (crucigrama[e].length() < crucigrama[f].length()) {
                    sortear = crucigrama[e];
                    crucigrama[e] = crucigrama[f];
                    crucigrama[f] = sortear;
                }
                f++;
            }
            e++;
        }
        System.out.println(crucigrama[4]);
        String raiz = "";
        raiz = crucigrama[4];

        char[] strtWord = new char[raiz.length()];
        strtWord = raiz.toCharArray();

        int[] posCoincidio = new int[raiz.length()];
        
        int g = 0;
        while (g < crucigrama.length-1) {
            int coincidio = 0;
            int h = 0;
            while (h < raiz.length()) {
                String palabra = crucigrama[g];
                if (h < crucigrama[g].length() && g < crucigrama.length && strtWord[h] == palabra.charAt(h)){
                    if (coincidio == 0) {
                        if (posCoincidio[g] == 0) {
                            System.out.println(" La palabra " + raiz + " coinciden con " + palabra + " en la letra " + strtWord[h]);   
                            coincidio = 1;
                            posCoincidio[h] = 1;
                        }
                    }
                }
                h++;
            }
            g++;
        }
    }

    private static void doDhileM(String[] crucigrama) {
        String sortear = "";
        int e = 0;
        do {
            int f = 0;
            while (f < crucigrama.length) {
                if (crucigrama[e].length() < crucigrama[f].length()) {
                    sortear = crucigrama[e];
                    crucigrama[e] = crucigrama[f];
                    crucigrama[f] = sortear;
                }
                f++;
            }
            e++;
        }while (e < crucigrama.length);
        System.out.println(crucigrama[4]);
        String raiz = "";
        raiz = crucigrama[4];

        char[] strtWord = new char[raiz.length()];
        strtWord = raiz.toCharArray();

        int[] posCoincidio = new int[raiz.length()];
        
        int g = 0;
        do {
            int coincidio = 0;
            int h = 0;
            do {
                String palabra = crucigrama[g];
                if (h < crucigrama[g].length() && g < crucigrama.length && strtWord[h] == palabra.charAt(h)){
                    if (coincidio == 0) {
                        if (posCoincidio[g] == 0) {
                            System.out.println(" La palabra " + raiz + " coinciden con " + palabra + " en la letra " + strtWord[h]);   
                            coincidio = 1;
                            posCoincidio[h] = 1;
                        }
                    }
                }
                h++;
            }while (h < raiz.length());
            g++;
        }while (g < crucigrama.length-1);
    }

    private static void forM(String[] crucigrama) {
        String sortear = "";
        for (int e = 0; e < crucigrama.length; e++) {
            for (int f = e + 1; f < crucigrama.length; f++) {
                if (crucigrama[e].length() < crucigrama[f].length()) {
                    sortear = crucigrama[e];
                    crucigrama[e] = crucigrama[f];
                    crucigrama[f] = sortear;
                }
            }
        }
            String raiz = "";
            raiz = crucigrama[0];
            
            char[] strtWord = new char[raiz.length()];
            strtWord = raiz.toCharArray();

            int[] posCoincidio = new int[raiz.length()];
        
        for (int e = 1; e < crucigrama.length; e++) {
            int coincidio = 0;
            for (int f = 0; f < raiz.length(); f++) {
                String palabra = crucigrama[e];
                if (f < crucigrama[e].length() && e < crucigrama.length && strtWord[f] == palabra.charAt(f)){
                    if (coincidio == 0) {
                        if (posCoincidio[f] == 0) {
                            System.out.println(" La palabra " + raiz + " coinciden con " + palabra + " en la letra " + strtWord[f]);   
                            coincidio = 1;
                            posCoincidio[f] = 1;
                        }
                    }
                }
            }
        }
    }    
}