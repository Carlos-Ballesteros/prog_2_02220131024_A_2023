package Cine;

import java.sql.Date;
import java.util.Scanner;


public class Cine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caja[] cajas = null;
        Cliente[] clientes = null;
        Boleto[] boletos = null;
        Empleado[] empleados = null;
        Establecimiento[] establecimientos = null;
        Inventario[] inventarios = null;
        Pelicula[] peliculas = null;
        
        int cajasAgregadas = 0;
        int clientesAgregados = 0;
        int empleadosAgregados = 0;
        int boletosAgregados = 0;
        int establecimientosAgregados = 0;
        int peliculasAgregadas = 0;
        int inventariosAgregados = 0;
        
        int menu = mostrarMenu(scanner);
        int subMenu;
        while(menu!=8){
            switch (menu) {
                case 1: // caja //
                    subMenu = mostrarSub(scanner, menu);
                    if(cajas == null){
                        System.out.println("Digite la cantidad de cajas que desea agregar.");
                        cajas = new Caja[scanner.nextInt()];
                    }else{
                        System.out.println("Hay registradas " + cajasAgregadas +" Cajas");
                    }
                    switch (subMenu) {
                        case 1:
                            listado(cajas);
                            break;
                        case 2:
                            cajas = agregarCajas(scanner, cajas, cajasAgregadas);
                            cajasAgregadas++;
                            listado(cajas);
                            break;
                    }
                    break;
                    
                case 2: // cliente //
                    subMenu = mostrarSub(scanner, menu);
                    if(clientes == null){
                        System.out.println("Digite la cantidad clientes que desea agregar.");
                        clientes = new Cliente[scanner.nextInt()];
                    }else{
                        System.out.println("Hay registrados " + clientesAgregados +" ");
                    }
                    switch (subMenu) {
                        case 1:
                            listado(cajas);
                            break;
                        case 2:
                            clientes = agregarClientes(scanner, clientes, clientesAgregados);
                            clientesAgregados++;
                            listado(clientes);
                            break;
                    }
                    break;
                    
                case 3: // empleado //
                    subMenu = mostrarSub(scanner, menu);
                    if(empleados == null){
                        System.out.println("Digite la cantidad empleados que desea agregar.");
                        empleados = new Empleado[scanner.nextInt()];
                    }else{
                        System.out.println("Hay registrados " + empleadosAgregados +" ");
                    }
                    switch (subMenu) {
                        case 1:
                            listado(empleados);
                            break;
                        case 2:
                            empleados = agregarEmpleado(scanner, empleados, empleadosAgregados);
                            empleadosAgregados++;
                            listado(empleados);
                            break;
                    }
                    break;
                    
                case 4: // inventario
                    subMenu = mostrarSub(scanner, menu);
                    if(inventarios == null){
                        System.out.println("Digite la cantidad de inventarios que desea agregar.");
                        inventarios = new Inventario[scanner.nextInt()];
                    }else{
                        System.out.println("Hay registrados " + inventariosAgregados +" inventarios.");
                    }
                    switch (subMenu) {
                        case 1:
                            listado(inventarios);
                            break;
                        case 2:
                            inventarios = agregarInventario(scanner, inventarios, inventariosAgregados);
                            inventariosAgregados++;
                            listado(inventarios);
                            break;
                    }
                    break;

                case 5: // establecimiento
                    subMenu = mostrarSub(scanner, menu);
                    if(establecimientos == null){
                        System.out.println("Digite la cantidad de establecimientos que desea agregar.");
                        establecimientos = new Establecimiento[scanner.nextInt()];
                    }else{
                        System.out.println("Hay registrados " + establecimientosAgregados +" establecimientos.");
                    }
                    switch (subMenu) {
                        case 1:
                            listado(establecimientos);
                            break;
                        case 2:
                            establecimientos = agregarEstablecimiento(scanner, establecimientos, establecimientosAgregados);
                            establecimientosAgregados++;
                            listado(establecimientos);
                            break;
                    }
                    break;

                case 6: // boleto
                    subMenu = mostrarSub(scanner, menu);
                    if(boletos == null){
                        System.out.println("Digite la cantidad de boletos que desea agregar.");
                        boletos = new Boleto[scanner.nextInt()];
                    }else{
                        System.out.println("Hay registrados " + boletosAgregados +" boletos.");
                    }
                    switch (subMenu) {
                        case 1:
                            listado(boletos);
                            break;
                        case 2:
                            boletos = agregarBoleto(scanner, boletos, boletosAgregados);
                            boletosAgregados++;
                            listado(boletos);
                            break;
                    }
                    break;

                case 7: // pelicula
                    subMenu = mostrarSub(scanner, menu);
                    if(peliculas == null){
                        System.out.println("Digite la cantidad de peliculas que desea agregar.");
                        peliculas = new Pelicula[scanner.nextInt()];
                    }else{
                        System.out.println("Hay registradas " + peliculasAgregadas +" peliculas.");
                    }
                    switch (subMenu) {
                        case 1:
                            listado(peliculas);
                            break;
                        case 2:
                            peliculas = agregarPelicula(scanner, peliculas, peliculasAgregadas);
                            peliculasAgregadas++;
                            listado(peliculas);
                            break;
                    }
                    break;

                default: 
                    menu = mostrarMenu(scanner);
                    break;
                    
            }
        }
    }

    public static int mostrarMenu(Scanner scanner) {
        System.out.println("""
                           Bienvenido al Sistema 
                            Seleccione una menu:
                                Digite 0 para salir.
                                Digite 1 para revisar cajas.
                                Digite 2 para revisar clientes.
                                Digite 3 para revisar empleados.
                                Digite 4 para revisar inventarios.
                                Digite 5 para revisar establecimientos.
                                Digite 6 para revisar boletos.
                                Digite 7 para revisar peliculas.
                           Que proceso quiere hacer?""");
        return scanner.nextInt();
    }

    public static int mostrarSub(Scanner scanner, int menu) {
        switch (menu) {
            case 1: //cajas
                System.out.println("Seleccione una accion");
                System.out.println("1. Listar");
                System.out.println("2. Crear");
                System.out.println("3. Salir.");
                return scanner.nextInt();
            case 2: // clientes
                System.out.println("Seleccione una accion");
                System.out.println("1. Listar");
                System.out.println("2. Crear");
                System.out.println("3. Salir.");
                return scanner.nextInt();
            case 3: // empleados
                System.out.println("Seleccione una accion");
                System.out.println("1. Listar");
                System.out.println("2. Crear");
                System.out.println("3. Salir.");
                return scanner.nextInt();
            case 4: // inventarios
                System.out.println("Seleccione una accion");
                System.out.println("1. Listar");
                System.out.println("2. Crear");
                System.out.println("3. Salir.");
                return scanner.nextInt();
            case 5: // establecimientos
                System.out.println("Seleccione una accion");
                System.out.println("1. Listar");
                System.out.println("2. Crear");
                System.out.println("3. Salir.");
                return scanner.nextInt();
            case 6: // boletos
                System.out.println("Seleccione una accion");
                System.out.println("1. Listar");
                System.out.println("2. Crear");
                System.out.println("3. Salir.");
            case 7: // peliculas
                System.out.println("Seleccione una accion");
                System.out.println("1. Listar");
                System.out.println("2. Crear");
                System.out.println("3. Salir.");
        }
        return 0;
    }

    public static void listado(Caja[] cajas) {
        System.out.println("Las cajas registadas son");
        for(Caja caja: cajas){
            System.out.println(caja.toString());
        }
    }
    public static void listado(Cliente[] clientes) {
        System.out.println("Las cajas registadas son");
        for(Cliente cliente: clientes){
            System.out.println(cliente.toString());
        }
    }
    public static void listado(Empleado[] empleados) {
        System.out.println("Las cajas registadas son");
        for(Empleado empleado: empleados){
            System.out.println(empleado.toString());
        }
    }
    public static void listado(Boleto[] boletos) {
        System.out.println("Las cajas registadas son");
        for(Boleto boleto: boletos){
            System.out.println(boleto.toString());
        }
    }
    public static void listado(Pelicula[] peliculas) {
        System.out.println("Las cajas registadas son");
        for(Pelicula pelicula: peliculas){
            System.out.println(pelicula.toString());
        }
    }
    public static void listado(Inventario[] inventarios) {
        System.out.println("Las cajas registadas son");
        for(Inventario inventario: inventarios){
            System.out.println(inventario.toString());
        }
    }
    public static void listado(Establecimiento[] establecimientos) {
        System.out.println("Las cajas registadas son");
        for(Establecimiento establecimiento: establecimientos){
            System.out.println(establecimiento.toString());
        }
    }

    public static Caja[] agregarCajas(Scanner scanner, Caja[] cajas, int cajasAgregadas) {
        System.out.println("Digite la informacion de la Caja");
        System.out.println("dinero:");
        String auxDinero = scanner.next();
        double dinero = Double.parseDouble(auxDinero);
        System.out.println("modelo:");
        String numCaja = scanner.next();
        System.out.println("transacciones:");
        String transacciones = scanner.next();
        
        Caja caja = new Caja( dinero, Integer.parseInt(numCaja), Integer.parseInt(transacciones));
        cajas[cajasAgregadas] = caja;
        
        return cajas;
    }
    public static Cliente[] agregarClientes(Scanner scanner, Cliente[] clientes, int clientesAgregados) {
        System.out.println("Digite la informacion del cliente");
        System.out.println("nombre:");
        String nombre = scanner.next();
        System.out.println("edad:");
        String auxEdad = scanner.next();
        int edad = Integer.parseInt(auxEdad);
        System.out.println("identificacion:");
        String identificacion = scanner.next();
        System.out.println("membresia:");
        String membresia = scanner.next();
        System.out.println("telefono:");
        String telefono = scanner.next();
        System.out.println("correo:");
        String correo = scanner.next();
        System.out.println("genero:");
        String genero = scanner.next();
        
        Cliente cliente = new Cliente(nombre, edad, identificacion, membresia, telefono, correo, genero);
        clientes[clientesAgregados] = cliente;
        
        return clientes;
    }
    public static Empleado[] agregarEmpleado(Scanner scanner, Empleado[] empleados,int empleadosAgregados) {
        System.out.println("Digite la informacion del Empleado");
        System.out.println("nombre:");
        String nombre = scanner.next();
        System.out.println("edad:");
        String auxEdad = scanner.next();
        int edad = Integer.parseInt(auxEdad);
        System.out.println("identificacion:");
        String identificacion = scanner.next();
        System.out.println("tipo:");
        String tipo = scanner.next();
        System.out.println("salario:");
        String auxSalario = scanner.next();
        double salario = Double.parseDouble(auxSalario);
        System.out.println("genero:");
        String genero = scanner.next();
        
        Empleado empleado = new Empleado(nombre, edad, identificacion, genero , salario, tipo);
        empleados[empleadosAgregados] = empleado;
        
        return empleados;
    }
    public static Inventario[] agregarInventario(Scanner scanner, Inventario[] inventarios, int inventariosAgregados) {
        System.out.println("Digite la informacion del Inventario");
        System.out.println("cantidad:");
        String auxCantidad = scanner.next();
        int cantidad = Integer.parseInt(auxCantidad);
        System.out.println("ingresos:");
        String auxIngresos = scanner.next();
        double ingresos = Double.parseDouble(auxIngresos);
        
        Inventario inventario = new Inventario(cantidad, ingresos);
        inventarios[inventariosAgregados] = inventario;
        
        return inventarios;
        
    }
    public static Establecimiento[] agregarEstablecimiento(Scanner scanner, Establecimiento[] establecimientos, int establecimientosAgregados) {
        System.out.println("Digite la informacion del Establecimiento:");
        System.out.print("Direccion: ");
        String direccion = scanner.next();
        System.out.print("Tamaño: ");
        String auxTamaño = scanner.next();
        int tamaño = Integer.parseInt(auxTamaño);

        Establecimiento establecimiento = new Establecimiento(direccion, tamaño);
        establecimientos[establecimientosAgregados] = establecimiento;

        return establecimientos;
    }

    public static Boleto[] agregarBoleto(Scanner scanner, Boleto[] boletos, int boletosAgregados) {
        System.out.println("Digite la informacion del Boleto:");
        System.out.print("comprador: ");
        String comprador = scanner.next();
        System.out.print("sala: ");
        String sala = scanner.next();
        System.out.print("asiento: ");
        String asiento = scanner.next();
        System.out.print("funcion: ");
        String funcion = scanner.next();
        System.out.print("precio: ");
        String auxPrecio = scanner.next();
        double precio = Double.parseDouble(auxPrecio);

        Boleto boleto = new Boleto(comprador, sala, asiento, funcion, precio);
        boletos[boletosAgregados] = boleto;

        return boletos;
    }
    public static Pelicula[] agregarPelicula(Scanner scanner, Pelicula[] peliculas, int peliculasAgregadas) {
        System.out.println("Digite la informacion de la Pelicula:");
        System.out.print("nombre: ");
        String nombre = scanner.next();
        System.out.print("genero: ");
        String genero = scanner.next();
        System.out.print("funcion: ");
        String funcion = scanner.next();
        System.out.print("fecha de estreno (yyyy-mm-dd): ");
        String auxFechaEstreno = scanner.next();
        Date fechaEstreno = Date.valueOf(auxFechaEstreno);
        System.out.print("sinopsis: ");
        String sinopsis = scanner.next();
        System.out.print("director: ");
        String director = scanner.next();
        System.out.print("actores: ");
        String actores = scanner.next();

        Pelicula pelicula = new Pelicula(nombre, genero, funcion, fechaEstreno, sinopsis, director, actores);
        peliculas[peliculasAgregadas] = pelicula;

        return peliculas;
    }   
}
