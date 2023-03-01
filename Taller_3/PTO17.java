package TALLER3;
import java.util.Scanner;

public class PTO17   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      // Leer los detalles de la hora de partida
        System.out.print("Ingrese la hora de partida (en formato HH:MM:SS): ");
        String horaPartidaStr = input.nextLine();
        String[] horaPartidaArr = horaPartidaStr.split(":");
        int horaPartida = Integer.parseInt(horaPartidaArr[0]);
        int minutoPartida = Integer.parseInt(horaPartidaArr[1]);
        int segundoPartida = Integer.parseInt(horaPartidaArr[2]);

      // Leer el tiempo de viaje en segundos
        System.out.print("Ingrese el tiempo de viaje (en segundos): ");
        int tiempoViaje = input.nextInt();

      // Calcular la hora de llegada
        int horaLlegada = horaPartida;
        int minutoLlegada = minutoPartida;
        int segundoLlegada = segundoPartida + tiempoViaje;

      // Ajustar la hora de llegada si los segundos superan los 60
    if (segundoLlegada >= 60) {
        minutoLlegada += segundoLlegada / 60;
        segundoLlegada = segundoLlegada % 60;
    }      
      // Ajustar la hora de llegada si los minutos superan los 60
    if (minutoLlegada >= 60) {
        horaLlegada += minutoLlegada / 60;
        minutoLlegada = minutoLlegada % 60;
    }

      // Imprimir la hora de llegada
        System.out.printf("El ciclista llegará a la ciudad B a las %02d:%02d:%02d.", horaLlegada, minutoLlegada, segundoLlegada);
    }
}