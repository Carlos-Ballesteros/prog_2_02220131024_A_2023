/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class Supermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productosAgregados = 0;
        int empleadosAgregados = 0;
        int clientesAgregados = 0;
        int establecimientosAgregados = 0;
        int cajasAgregadas = 0;
        int inventariosAgregados = 0;
        Producto[] productos = null;
        Caja[] cajas = null;
        Empleado[] empleados = null;
        Establecimineto[] establecimientos = null;
        Inventario[] inventarios = null;
        Cliente[] clientes = null;
        
        int menu = mostrarMenu(scanner);
        int subMenu;
        while (menu != 8) {
            switch (menu) {
                case 1: // producto //
                    subMenu = mostrarSub(scanner, menu);
                    switch (subMenu) {
                        case 1: // listado //
                            listado(productos);
                            break;
                        case 2: // agregar //
                            if (productos == null) {
                                System.out.println("Digite la cantidad de productos que desea agregar.");
                                productos = new Producto[scanner.nextInt()];
                            }
                            productos = agregarProducto(scanner, productos, productosAgregados);
                            productosAgregados++;
                            listado(productos);
                            break;
                    }
                    break;
                case 2: // caja //
                    subMenu = mostrarSub(scanner, menu);
                    switch (subMenu) {
                        case 1: // listado //
                            listado(cajas);
                            break;
                        case 2: // agregar //
                            if (cajas == null) {
                                System.out.println("Digite la cantidad de cajas que desea agregar.");
                                cajas = new Caja[scanner.nextInt()];
                            }
                            cajas = agregarCaja(scanner, cajas, cajasAgregadas);
                            cajasAgregadas++;
                            listado(cajas);
                            break;
                    }
                    break;
                case 3: // empleado //
                    subMenu = mostrarSub(scanner, menu);
                    switch (subMenu) {
                        case 1: // listado //
                            listado(empleados);
                            break;
                        case 2: // agregar //
                            if (empleados == null) {
                                System.out.println("Digite la cantidad de empleados que desea agregar.");
                                empleados = new Empleado[scanner.nextInt()];
                            }
                            empleados = agregarEmpleado(scanner, empleados, empleadosAgregados);
                            empleadosAgregados++;
                            listado(empleados);
                            break;
                    }
                    break;
                case 4: // cliente //
                    subMenu = mostrarSub(scanner, menu);
                    switch (subMenu) {
                        case 1: // listado //
                            listado(clientes);
                            break;
                        case 2: // agregar //
                            if (clientes == null) {
                                System.out.println("Digite la cantidad de clientes que desea agregar.");
                                clientes = new Cliente[scanner.nextInt()];
                            }
                            clientes = agregarCliente(scanner, clientes, clientesAgregados);
                            clientesAgregados++;
                            listado(clientes);
                            break;
                    }
                    break;
                case 5: // establecimiento //
                    subMenu = mostrarSub(scanner, menu);
                    switch (subMenu) {
                        case 1: // listado //
                            listado(establecimientos);
                            break;
                        case 2: // agregar //
                            if (establecimientos == null) {
                                System.out.println("Digite la cantidad de establecimientos que desea agregar.");
                                establecimientos = new Establecimineto[scanner.nextInt()];
                            }
                            establecimientos = agregarEstablecimiento(scanner, establecimientos, establecimientosAgregados);
                            establecimientosAgregados++;
                            listado(establecimientos);
                            break;
                    }
                    break;
                case 6: // inventario //
                    subMenu = mostrarSub(scanner, menu);
                    switch (subMenu) {
                        case 1: // listado //
                            listado(inventarios);
                            break;
                        case 2: // agregar //
                            if (inventarios == null) {
                                System.out.println("Digite la cantidad de productos en inventario que desea agregar.");
                                inventarios = new Inventario[scanner.nextInt()];
                            }
                            inventarios = agregarInventario(scanner, inventarios, inventariosAgregados);

                    }
                    menu = mostrarMenu(scanner);
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
        for (Caja caja : cajas) {
            System.out.println(caja.toString());
        }
    }

    public static void listado(Producto[] productos) {
        System.out.println("Los productos registrados son:");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public static void listado(Cliente[] clientes) {
        System.out.println("Los clientes registados son");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public static void listado(Empleado[] empleados) {
        System.out.println("Los empleados registados son");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }
    }

    public static void listado(Establecimineto[] establecimientos) {
        System.out.println("Los establecimientos registrados son");
        for (Establecimineto establecimiento : establecimientos) {
            System.out.println(establecimiento.toString());
        }
    }

    public static void listado(Inventario[] inventarios) {
        System.out.println("Los inventarios registrados son:");
        for (Inventario inventario : inventarios) {
            System.out.println(inventario.toString());
        }
    }

    public static Caja[] agregarCaja(Scanner scanner, Caja[] cajas, int cajasAgregadas) {
        System.out.println("Digite la informacion de la Caja");
        System.out.println("dinero:");
        String auxDinero = scanner.next();
        double dinero = Double.parseDouble(auxDinero);
        System.out.println("modelo:");
        String numCaja = scanner.next();
        System.out.println("transacciones:");
        String transacciones = scanner.next();

        Caja caja = new Caja(dinero, Integer.parseInt(numCaja), Integer.parseInt(transacciones));
        cajas[cajasAgregadas] = caja;

        return cajas;
    }

    public static Producto[] agregarProducto(Scanner scanner, Producto[] productos, int productosAgregados) {
        System.out.println("Digite la informacion del Producto");
        System.out.println("precio:");
        String auxCodigo = scanner.next();
        int codigo = Integer.parseInt(auxCodigo);
        System.out.println("nombre:");
        String nombre = scanner.next();
        System.out.println("precio:");
        String auxPrecio = scanner.next();
        double precio = Double.parseDouble(auxPrecio);
        System.out.println("marca:");
        String marca = scanner.next();
        System.out.print("fecha de estreno (yyyy-mm-dd): ");
        String auxFechaEstreno = scanner.next();
        Date fechaVencimineto = Date.valueOf(auxFechaEstreno);

        Producto producto = new Producto(codigo, nombre, precio, marca, fechaVencimineto);
        productos[productosAgregados] = producto;

        return productos;
    }

    public static Cliente[] agregarCliente(Scanner scanner, Cliente[] clientes, int clientesAgregados) {
        System.out.println("Digite la informacion del Cliente");
        System.out.println("nombre:");
        String nombre = scanner.next();
        System.out.println("edad:");
        String auxEdad = scanner.next();
        int edad = Integer.parseInt(auxEdad);
        System.out.println("id:");
        String id = scanner.next();
        System.out.println("compras:");
        String compras = scanner.next();
        System.out.println("genero:");
        String genero = scanner.next();
        System.out.println("telefono:");
        String telefono = scanner.next();
        System.out.println("correo:");
        String correo = scanner.next();

        Cliente cliente = new Cliente(nombre, edad, id, compras, genero, telefono, correo);
        clientes[clientesAgregados] = cliente;

        return clientes;
    }

    public static Empleado[] agregarEmpleado(Scanner scanner, Empleado[] empleados, int empleadosAgregados) {
        System.out.println("Digite la informacion del Empleado");
        System.out.println("Nombre:");
        String nombre = scanner.next();
        System.out.println("Edad:");
        String auxEdad = scanner.next();
        int edad = Integer.parseInt(auxEdad);
        System.out.println("ID:");
        String id = scanner.next();
        System.out.println("Género:");
        String genero = scanner.next();
        System.out.println("Teléfono:");
        String telefono = scanner.next();
        System.out.println("Correo:");
        String correo = scanner.next();
        System.out.println("Salario:");
        String salario = scanner.next();
        System.out.println("Tipo:");
        String tipo = scanner.next();
        Empleado empleado = new Empleado(nombre, edad, id, genero, telefono, correo, salario, tipo);
        empleados[empleadosAgregados] = empleado;

        return empleados;
    }

    public static Establecimineto[] agregarEstablecimiento(Scanner scanner, Establecimineto[] establecimientos, int establecimientosAgregados) {
        System.out.println("Digite la informacion del Establecimiento");
        System.out.println("Direccion:");
        String direccion = scanner.next();
        System.out.println("Area:");
        String auxArea = scanner.next();
        int area = Integer.parseInt(auxArea);

        Establecimineto establecimiento = new Establecimineto(direccion, area);
        establecimientos[establecimientosAgregados] = establecimiento;

        return establecimientos;
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
}
