import java.util.Scanner;

public class Ejercicio5_EmisFact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] inventario = new String[100][4]; 
        int contadorProductos = 0;
        int opcion;
        inventario[contadorProductos++] = new String[]{"Producto A", "10.0", "50", "001"};
        inventario[contadorProductos++] = new String[]{"Producto B", "20.0", "30", "002"};
        inventario[contadorProductos++] = new String[]{"Producto C", "15.0", "20", "003"};

        do {
            System.out.println("\n--- Gestión de Inventario y Facturación ---");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Facturar producto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1: 
                    System.out.println("\n--- Inventario ---");
                    for (int i = 0; i < contadorProductos; i++) {
                        System.out.println("Código: " + inventario[i][3] + ", Nombre: " + inventario[i][0] + ", Precio: " + inventario[i][1] + ", Cantidad: " + inventario[i][2]);
                    }
                    break;
                case 2: 
                    System.out.print("Ingrese el código del producto a facturar: ");
                    String codigoProducto = scanner.nextLine();
                    System.out.print("Ingrese la cantidad a facturar: ");
                    int cantidadFacturar = scanner.nextInt();
                    scanner.nextLine(); 
                    boolean encontrado = false;
                    for (int i = 0; i < contadorProductos; i++) {
                        if (inventario[i][3].equals(codigoProducto)) {
                            encontrado = true;
                            int cantidadDisponible = 0;
                            for (int j = 0; j < inventario[i][2].length(); j++) {
                                cantidadDisponible = cantidadDisponible * 10 + (inventario[i][2].charAt(j) - '0');
                            }

                            if (cantidadFacturar > cantidadDisponible) {
                                System.out.println("Alerta: No hay suficientes unidades en stock.");
                            } else {
                                // Calcular el total
                                double precio = 0;
                                for (int j = 0; j < inventario[i][1].length(); j++) {
                                    precio = precio * 10 + (inventario[i][1].charAt(j) - '0');
                                }
                                precio += (inventario[i][1].contains(".")) ? 0.1 : 0; 
                                double total = precio * cantidadFacturar;
                                double iva = total * 0.15;
                                total += iva;
                                if (total > 100) {
                                    double descuento = total * 0.10; 
                                    total -= descuento;
                                    System.out.println("Se aplica un descuento del 10%.");
                                }
                                inventario[i][2] = String.valueOf(cantidadDisponible - cantidadFacturar);
                                System.out.println("\n--- Factura ---");
                                System.out.println("Producto: " + inventario[i][0]);
                                System.out.println("Cantidad: " + cantidadFacturar);
                                System.out.println("Precio unitario: $" + precio);
                                System.out.println("IVA (15%): $" + iva);
                                System.out.println("Total a pagar: $" + total);
                            }
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3: 
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
}
/*
--- Gesti�n de Inventario y Facturaci�n ---
1. Mostrar inventario
2. Facturar producto
3. Salir
Seleccione una opci�n: 2
Ingrese el c�digo del producto a facturar: 1235643
Ingrese la cantidad a facturar: 125
Producto no encontrado.

--- Gesti�n de Inventario y Facturaci�n ---
1. Mostrar inventario
2. Facturar producto
3. Salir
Seleccione una opci�n: 1

--- Inventario ---
C�digo: 001, Nombre: Producto A, Precio: 10.0, Cantidad: 50
C�digo: 002, Nombre: Producto B, Precio: 20.0, Cantidad: 30
C�digo: 003, Nombre: Producto C, Precio: 15.0, Cantidad: 20

--- Gesti�n de Inventario y Facturaci�n ---
1. Mostrar inventario
2. Facturar producto
3. Salir
Seleccione una opci�n: 3
Saliendo del programa...
BUILD SUCCESSFUL (total time: 27 seconds)

*/