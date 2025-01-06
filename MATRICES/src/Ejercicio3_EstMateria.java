import java.util.Random;
import java.util.Scanner;
public class Ejercicio3_EstMateria {
    public static void main(String[] args) {
        int NUM_ESTUDIANTES = 28;
        String[] nombres = new String[NUM_ESTUDIANTES];
        double[] acd = new double[NUM_ESTUDIANTES];
        double[] ape = new double[NUM_ESTUDIANTES];
        double[] aa = new double[NUM_ESTUDIANTES];
        double[] promedios = new double[NUM_ESTUDIANTES];
        double sumaPromedios = 0;
        double promedioCurso;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ingrese los nombres de los estudiantes:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            acd[i] = random.nextDouble() * 10; 
            ape[i] = random.nextDouble() * 10; 
            aa[i] = random.nextDouble() * 10;   
            promedios[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.30);
            sumaPromedios += promedios[i];
        }
        promedioCurso = sumaPromedios / NUM_ESTUDIANTES;
        System.out.println("\nPromedio del curso: " + promedioCurso);
        System.out.println("\nEstudiantes con promedio por encima del promedio del curso:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + ": " + promedios[i]);
            }
        }

        System.out.println("\nEstudiantes con promedio por debajo del promedio del curso:");
        for (int i = 0; i < NUM_ESTUDIANTES; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + ": " + promedios[i]);
            }
        }
        double mayorPromedio = promedios[0];
        double menorPromedio = promedios[0];
        String estudianteMayor = nombres[0];
        String estudianteMenor = nombres[0];
        for (int i = 1; i < NUM_ESTUDIANTES; i++) {
            if (promedios[i] > mayorPromedio) {
                mayorPromedio = promedios[i];
                estudianteMayor = nombres[i];
            }
            if (promedios[i] < menorPromedio) {
                menorPromedio = promedios[i];
                estudianteMenor = nombres[i];
            }
        }
        System.out.println("\nEstudiante con el mayor promedio:");
        System.out.println(estudianteMayor + ": " + mayorPromedio);
        System.out.println("\nEstudiante con el menor promedio:");
        System.out.println(estudianteMenor + ": " + menorPromedio);
        
    }
}
/*
Ingrese los nombres de los estudiantes:
Estudiante 1: Juan
Estudiante 2: Pedro
Estudiante 3: Juana
Estudiante 4: Maria
Estudiante 5: Alejandro
Estudiante 6: Pablo
Estudiante 7: Jose
Estudiante 8: Cristian
Estudiante 9: Diego
Estudiante 10: Odalis
Estudiante 11: Valentina
Estudiante 12: Leandro
Estudiante 13: Paula
Estudiante 14: Ariana
Estudiante 15: Amely
Estudiante 16: Sheyla
Estudiante 17: Joe
Estudiante 18: Andy
Estudiante 19: Joel
Estudiante 20: Crhistopher
Estudiante 21: Nayeli
Estudiante 22: Adriana
Estudiante 23: Ricardo
Estudiante 24: Nicolas
Estudiante 25: Moises
Estudiante 26: Gabriel
Estudiante 27: Sofia
Estudiante 28: Raquel

Promedio del curso: 4.928069669213335

Estudiantes con promedio por encima del promedio del curso:
Pedro: 6.659505146822633
Maria: 7.706651178681568
Cristian: 7.497784830951339
Diego: 6.95394420892394
Paula: 5.239016403268344
Ariana: 4.9914017357142155
Joe: 6.807865080371389
Andy: 6.198663328642806
Nayeli: 6.669801303243863
Ricardo: 6.54440771473888
Nicolas: 7.956835770845574
Sofia: 5.793203007717343

Estudiantes con promedio por debajo del promedio del curso:
Juan: 4.0795153559036095
Juana: 2.9333834186223804
Alejandro: 2.9834451541590155
Pablo: 4.825917789270844
Jose: 2.6042137362544504
Odalis: 3.6228704622073176
Valentina: 2.8640820517505867
Leandro: 2.880868622188183
Amely: 4.198998230309215
Sheyla: 4.751673310813384
Joel: 4.276560187768684
Crhistopher: 1.3826114471476023
Adriana: 4.5182791177099535
Moises: 4.82269066233077
Gabriel: 4.031283611824908
Raquel: 4.190477869790587

Estudiante con el mayor promedio:
Nicolas: 7.956835770845574

Estudiante con el menor promedio:
Crhistopher: 1.3826114471476023
BUILD SUCCESSFUL (total time: 2 minutes 15 seconds)
*/
