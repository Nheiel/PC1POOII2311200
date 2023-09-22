/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.practicacalificada1;

/**
 *
 * @author Nheiel
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDias;
        double ventasTotales = 0.0;

        do {
            System.out.print("¿Para cuántos días tienes cifras de ventas? ");
            try {
                numeroDias = Integer.parseInt(scanner.nextLine());

                if (numeroDias < 1) {
                    System.out.println("Disculpa, el número ingresado es incorrecto. Ingrese un número mayor o igual a 1.");
                    continue;
                }

                for (int i = 1; i <= numeroDias; i++) {
                    System.out.print("Ingrese las ventas para el día " + i + ": ");
                    double ventasDia = Double.parseDouble(scanner.nextLine());

                    if (ventasDia < 0) {
                        System.out.println("Disculpa, el número ingresado es incorrecto. Ingrese un número mayor o igual a 0.");
                        i--; // Restar 1 al contador para volver a pedir la cifra de ventas para el mismo día.
                    } else {
                        ventasTotales += ventasDia;
                    }
                }

                System.out.println("Las ventas totales son S/ " + ventasTotales);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Disculpa, el número ingresado es incorrecto. Ingrese un número mayor o igual a 1.");
            }
        } while (true);

        scanner.close();
    }
}
