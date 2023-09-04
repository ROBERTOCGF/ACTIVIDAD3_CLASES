package Puntos;


public class Punto3 {
    public static void main(String[] args) {
        int n=3;
        System.out.println("Suma terminos = " + sumaTerminos(n));
    }
    
    public static double sumaTerminos(int n){
        double suma = 0;
        for(int i=1; i<=n; i++ ){
            double termino = i / Math.pow(2, i);
            suma+=termino;
        }
        return suma;
    }
}
