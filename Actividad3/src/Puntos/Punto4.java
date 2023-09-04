package Puntos;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que introduzca la cantidad deseada
        System.out.print("Introduce la cantidad deseada: ");
        int objetivo = input.nextInt();

        // Inicializar variables para la suma y el número natural N
        int suma = 0;
        int N = 0;

        // Usar un bucle while para encontrar el valor de N
        while (suma <= objetivo) {
            N++;
            suma += N;
        }

        // Imprimir el resultado
        System.out.println("El número natural N más pequeño cuya suma excede " + objetivo + " es: " + N);
    }
}
