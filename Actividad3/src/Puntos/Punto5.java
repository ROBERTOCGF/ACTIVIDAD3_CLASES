package Puntos;


public class Punto5 {

    public static void main(String[] args) {

        int[] A = {101, 102, 103, 104, 105};
        double[] B = {10.5, 15.0, 12.75, 20.0, 9.99};
        int[] C = {20, 15, 30, 10, 25};

        // Calcular el total de productos vendidos en el día
        int totalProductosVendidos = 0;
        for (int cantidad : C) {
            totalProductosVendidos += cantidad;
        }

        // Calcular el total de ingresos por ventas del día
        double totalIngresos = 0.0;
        for (int i = 0; i < A.length; i++) {
            totalIngresos += B[i] * C[i];
        }

        // Encontrar el producto más vendido
        int productoMasVendido = A[0];
        int maxCantidad = C[0];
        for (int i = 1; i < A.length; i++) {
            if (C[i] > maxCantidad) {
                productoMasVendido = A[i];
                maxCantidad = C[i];
            }
        }

        // Encontrar el producto más costoso vendido
        int productoMasCostoso = A[0];
        double maxPrecio = B[0];
        for (int i = 1; i < A.length; i++) {
            if (B[i] > maxPrecio) {
                productoMasCostoso = A[i];
                maxPrecio = B[i];
            }
        }

        // Imprimir los resultados
        System.out.println("Total productos vendidos en el día: " + totalProductosVendidos);
        System.out.println("Total ingresos por ventas del día: $" + totalIngresos);
        System.out.println("Producto más vendido (Código): " + productoMasVendido);
        System.out.println("Producto más costoso vendido (Código): " + productoMasCostoso);
    }
}
