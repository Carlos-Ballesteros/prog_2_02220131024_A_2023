package TALLER3.EJERCICIOSBASICOS;

public class PTO8 {
    public static void main(String[] args) {
        System.out.println("El vendedor recibe un salario de 1000000 mas un 10% por venta");
        double comVenta = 1000000 * 0.1;
        System.out.println("El dinero ganado por comision luego de 3 ventas mensuales es de " + comVenta*3);
        System.out.println("El total que recibira es de " + (1000000 + comVenta*3));
    }
}
