package Puntos;

import java.util.Scanner;

public class Punto7 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);

        // Solicitar al usuario la cantidad de horas trabajadas
        System.out.print("Introduce las horas semanales trabajadas: ");
        double horasTrabajadas = A.nextDouble();

        // Solicitar al usuario la tasa de salario por hora
        System.out.print("Introduce la tasa de salario por hora: ");
        double tasaSalarioHora = A.nextDouble();

        // Calcular el salario bruto
        double salarioBruto;

        if (horasTrabajadas < 38) {
            salarioBruto = horasTrabajadas * tasaSalarioHora;
        } else {
            double horasOrdinarias = 38;
            double horasExtras = horasTrabajadas - horasOrdinarias;
            salarioBruto = (horasOrdinarias * tasaSalarioHora) + (horasExtras * 1.5 * tasaSalarioHora);
        }

        // Calcular los impuestos
        double impuestos;
        if (salarioBruto <= 750) {
            impuestos = 0.0;
        } else {
            impuestos = salarioBruto * 0.10;
        }

        // Calcular el salario neto
        double salarioNeto = salarioBruto - impuestos;

        // Imprimir el salario neto
        System.out.println("Salario bruto: " + salarioBruto + " euros");
        System.out.println("Impuestos: " + impuestos + " euros");
        System.out.println("Salario neto: " + salarioNeto + " euros");
    }
}
