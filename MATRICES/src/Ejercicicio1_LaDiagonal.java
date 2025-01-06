import java.util.Random;

public class Ejercicicio1_LaDiagonal {
    public static void main(String[] args) {
        int m = 5; // Tamaño de la matriz
        int[][] matriz = new int[m][m];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(100); 
            }
        }
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos de la diagonal principal:");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println();
        System.out.println("\nElementos de la diagonal secundaria:");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][m - 1 - i] + "\t");
        }
        System.out.println();
        System.out.println("\nElementos ubicados bajo la diagonal principal:");
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("\nElementos ubicados sobre la diagonal principal:");
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("\nElementos ubicados bajo la diagonal secundaria:");
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("\nElementos ubicados sobre la diagonal secundaria:");
        for (int i = 0; i < m; i++) {
            for (int j = m - 1 - i + 1; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println();
    }
}
/*
Matriz:
29	62	87	33	19	
30	81	66	10	93	
32	94	77	31	12	
13	53	95	55	35	
74	28	6	51	89	

Elementos de la diagonal principal:
29	81	77	55	89	

Elementos de la diagonal secundaria:
19	10	77	53	74	

Elementos ubicados bajo la diagonal principal:
30	32	94	13	53	95	74	28	6	51	

Elementos ubicados sobre la diagonal principal:
62	87	33	19	66	10	93	31	12	35	

Elementos ubicados bajo la diagonal secundaria:
29	62	87	33	30	81	66	32	94	13	

Elementos ubicados sobre la diagonal secundaria:
93	31	12	95	55	35	28	6	51	89	
BUILD SUCCESSFUL (total time: 0 seconds)
*/