import java.util.Scanner;

public class Ejercicio4_InveTienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] inventario = new String[100][3]; 
        int contadorProductos = 0;
        int opcion;
        boolean continuar = true;
        do {
            System.out.println("\n--- Gestión de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1: 
                    if (contadorProductos < 100) {
                        System.out.print("Ingrese el nombre del producto: ");
                        inventario[contadorProductos][0] = scanner.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        inventario[contadorProductos][1] = scanner.nextLine();
                        System.out.print("Ingrese la cantidad del producto: ");
                        inventario[contadorProductos][2] = scanner.nextLine();
                        contadorProductos++;
                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("No se pueden agregar más productos. Inventario lleno.");
                    }
                    break;

                case 2: 
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    boolean encontradoActualizar = false;

                    for (int i = 0; i < contadorProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreActualizar)) {
                            System.out.print("Ingrese la nueva cantidad: ");
                            inventario[i][2] = scanner.nextLine();
                            encontradoActualizar = true;
                            System.out.println("Existencias actualizadas.");
                            break;
                        }
                    }
                    if (!encontradoActualizar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 3: 
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontradoBuscar = false;

                    for (int i = 0; i < contadorProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + inventario[i][0]);
                            System.out.println("Precio: " + inventario[i][1]);
                            System.out.println("Cantidad: " + inventario[i][2]);
                            encontradoBuscar = true;
                            break;
                        }
                    }
                    if (!encontradoBuscar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4: 
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    boolean encontradoEliminar = false;

                    for (int i = 0; i < contadorProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreEliminar)) {
                            for (int j = i; j < contadorProductos - 1; j++) {
                                inventario[j] = inventario[j + 1];
                            }
                            inventario[contadorProductos - 1] = null; 
                            contadorProductos--;
                            encontradoEliminar = true;
                            System.out.println("Producto eliminado.");
                            break;
                        }
                    }
                    if (!encontradoEliminar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 5: 
                    System.out.println("\n--- Inventario ---");
                    for (int i = 0; i < contadorProductos; i++) {
                        System.out.println("Nombre: " + inventario[i][0] + ", Precio: " + inventario[i][1] + ", Cantidad: " + inventario[i][2]);
                    }
                    break;

                case 6: 
                    continuar = false; 
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (continuar);

    }
}
/*
--- Gesti�n de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opci�n: 5

--- Inventario ---

--- Gesti�n de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opci�n: 6
Saliendo del programa...
BUILD SUCCESSFUL (total time: 22 seconds)

*/

