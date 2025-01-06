import java.util.Random;
public class Ejercicio2_Sum_Mult {
    public static void main(String[] args) {
        Random random = new Random();
        int filasA = 4, columnasA = 4; 
        int filasB = 4, columnasB = 4; 
        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasB][columnasB];
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j] = random.nextInt(10); 
            }
        }
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizB[i][j] = random.nextInt(10); 
            }
        }
        System.out.println("Matriz A:");
        for (int[] fila : matrizA) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz B:");
        for (int[] fila : matrizB) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
        if (filasA == filasB && columnasA == columnasB) {
            int[][] suma = new int[filasA][columnasA];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    suma[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            System.out.println("\nSuma de las matrices:");
            for (int[] fila : suma) {
                for (int elemento : fila) {
                    System.out.print(elemento + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se puede sumar las matrices: dimensiones incompatibles.");
        }
        if (columnasA == filasB) {
            int[][] producto = new int[filasA][columnasB];
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnasA; k++) {
                        producto[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            System.out.println("\nProducto de las matrices:");
            for (int[] fila : producto) {
                for (int elemento : fila) {
                    System.out.print(elemento + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se puede multiplicar las matrices: dimensiones incompatibles.");
        }
    }
}

/*
Matriz A:
3	3	0	3	
1	1	6	3	
5	9	6	7	
1	9	3	8	
Matriz B:
3	6	9	9	
6	0	2	1	
3	0	2	4	
4	9	5	9	

Suma de las matrices:
6	9	9	12	
7	1	8	4	
8	9	8	11	
5	18	8	17	

Producto de las matrices:
39	45	48	57	
39	33	38	61	
115	93	110	141	
98	78	73	102	
BUILD SUCCESSFUL (total time: 0 seconds)
*/
