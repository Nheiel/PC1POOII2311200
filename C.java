/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.lab2pooi2311200;

import java.io.InputStream;

/**
 *
 * @author Nheiel
 */
public class C {
    /*import java.util.Scanner;*/

    private static class Scanner {

        public Scanner(InputStream in) {
        }

        private double nextDouble() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int nextInt() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

public class CalculoSalarioEmpleado {

    public static void main(String[] args) {
        double salarioActual; // salario anual actual
        int calificacion; // Calificación de desempeño (1-excelente, 2-bueno y 3-malo).

        double aumento = 0; // monto en dólares del aumento

        Scanner scanner = new Scanner(System.in);

        // Obtenga el salario actual y la calificación de desempeño
        System.out.print("Ingrese el salario actual: ");
        salarioActual = scanner.nextDouble();

        System.out.print("Ingrese la calificación de desempeño (1-excelente, 2-bueno, 3-malo): ");
        calificacion = scanner.nextInt();

        // Ingresa aquí la lógica para calcular el aumento - Usa if... else
        if (calificacion == 1) {
            aumento = salarioActual * 0.06; // Aumento del 6%
        } else if (calificacion == 2) {
            aumento = salarioActual * 0.04; // Aumento del 4%
        } else if (calificacion == 3) {
            aumento = salarioActual * 0.015; // Aumento del 1.5%
        }

        // Calcula el nuevo salario
        double nuevoSalario = salarioActual + aumento;

        // Imprime los resultados
        System.out.println("Cantidad de su aumento: $" + aumento);
        System.out.println("Su nuevo salario: $" + nuevoSalario);
    }
}
}
