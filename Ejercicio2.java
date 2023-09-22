/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.practicacalificada1;

/**
 *
 * @author Nheiel
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPuntos = 0;

        System.out.println("Ingrese la cantidad de puntos que su equipo ha obtenido en cada juego de esta temporada.");
        System.out.println("Ingrese -1 cuando haya terminado.");

        while (true) {
            try {
                System.out.print("Introduce puntos del juego o -1 para finalizar: ");
                int puntosJuego = scanner.nextInt();

                if (puntosJuego == -1) {
                    break;
                } else if (puntosJuego < 0) {
                    System.out.println("Programa finalizado, usted debe ingresar un número válido.");
                    System.exit(0);
                }

                totalPuntos += puntosJuego;
            } catch (InputMismatchException e) {
                System.out.println("Programa finalizado, usted debe ingresar un número válido.");
                System.exit(0);
            }
        }

        System.out.println("Los puntos totales son " + totalPuntos + ".");
    }
}

