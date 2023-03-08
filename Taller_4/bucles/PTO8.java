package TALLER4.Bucles;

public class PTO8 {
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int notMilSec = 0;
        while (true) {
            System.out.println(horas + ":" + minutos + ":" + segundos);
            notMilSec++;
            if(notMilSec==10000){
            segundos++;
            notMilSec =0;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) {
                            horas = 0;
                        }
                    }
                }
            }
        }
    }
}
