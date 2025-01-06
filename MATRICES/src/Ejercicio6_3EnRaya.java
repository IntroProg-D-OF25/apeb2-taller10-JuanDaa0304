import java.util.Scanner;
public class Ejercicio6_3EnRaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] tablero = new String[3][3];
        String jugadorActual = "X";
        boolean juegoActivo = true;
        int movimientos = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = " ";
            }
        }
        while (juegoActivo) {
            System.out.println("Tablero:");
            for (int i = 0; i < 3; i++) {
                System.out.print(" | ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " | ");
                }
                System.out.println();
                System.out.println("-------------");
            }
            System.out.println("Jugador " + jugadorActual + ", ingrese fila (0-2) y columna (0-2): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || !tablero[fila][columna].equals(" ")) {
                System.out.println("Movimiento inválido. Intente de nuevo.");
                continue;
            }
            tablero[fila][columna] = jugadorActual;
            movimientos++;
            boolean hayGanador = false;
            for (int i = 0; i < 3; i++) {
                if ((tablero[i][0].equals(jugadorActual) && tablero[i][1].equals(jugadorActual) && tablero[i][2].equals(jugadorActual)) || // Filas
                    (tablero[0][i].equals(jugadorActual) && tablero[1][i].equals(jugadorActual) && tablero[2][i].equals(jugadorActual))) { // Columnas
                    hayGanador = true;
                }
            }
            if ((tablero[0][0].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[2][2].equals(jugadorActual)) ||
                (tablero[0][2].equals(jugadorActual) && tablero[1][1].equals(jugadorActual) && tablero[2][0].equals(jugadorActual))) {
                hayGanador = true;
            }

            if (hayGanador) {
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                juegoActivo = false;
            } else if (movimientos == 9) {
                // Verificar empate
                System.out.println("¡Es un empate!");
                juegoActivo = false;
            } else {
                jugadorActual = jugadorActual.equals("X") ? "O" : "X";
            }
        }

    }
}
/*
Tablero:
 |   |   |   | 
-------------
 |   |   |   | 
-------------
 |   |   |   | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2): 
1
2
Tablero:
 |   |   |   | 
-------------
 |   |   | X | 
-------------
 |   |   |   | 
-------------
Jugador O, ingrese fila (0-2) y columna (0-2): 
1
1
Tablero:
 |   |   |   | 
-------------
 |   | O | X | 
-------------
 |   |   |   | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2): 
2
2
Tablero:
 |   |   |   | 
-------------
 |   | O | X | 
-------------
 |   |   | X | 
-------------
Jugador O, ingrese fila (0-2) y columna (0-2): 
0
2
Tablero:
 |   |   | O | 
-------------
 |   | O | X | 
-------------
 |   |   | X | 
-------------
Jugador X, ingrese fila (0-2) y columna (0-2): 
2
1
Tablero:
 |   |   | O | 
-------------
 |   | O | X | 
-------------
 |   | X | X | 
-------------
Jugador O, ingrese fila (0-2) y columna (0-2): 
2
0
�Jugador O ha ganado!
BUILD SUCCESSFUL (total time: 1 minute 25 seconds)

*/