
package Puntos;


public class Punto1 {
     public static void main(String[] args) {
         double longitud = 50.9;
        double anchura = 40.4;
        double superficie = calcularSuperficie(longitud, anchura);
        System.out.println("Superficie=" + superficie);
    }

    public static double calcularSuperficie(double longitud, double anchura) {

        return longitud * anchura;

    }

}
     

