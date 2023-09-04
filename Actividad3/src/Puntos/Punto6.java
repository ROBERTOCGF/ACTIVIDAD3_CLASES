
package Puntos;

import java.util.Scanner;

public class Punto6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicitar al usuario las longitudes de los catetos
        System.out.print("Ingresa la longitud del primer cateto: ");
        double catetoA = input.nextDouble();
        
        System.out.print("Ingresa la longitud del segundo cateto: ");
        double catetoB = input.nextDouble();
        
        // Calcular la hipotenusa usando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(catetoA * catetoA + catetoB * catetoB);
        
        // Calcular los ángulos agudos en radianes
        double anguloA = Math.atan(catetoA / catetoB);
        double anguloB = Math.atan(catetoB / catetoA);
        
        // Convertir los ángulos de radianes a grados
        anguloA = Math.toDegrees(anguloA);
        anguloB = Math.toDegrees(anguloB);
        
        // Imprimir los resultados
        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Ángulo agudo A: " + anguloA + " grados");
        System.out.println("Ángulo agudo B: " + anguloB + " grados");
        
        input.close();
    }
}

   
    
