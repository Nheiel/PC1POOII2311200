/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.practicacalificada1;

/**
 *
 * @author Nheiel
 */
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char respuesta;

        do {
            System.out.println("Tirando los dados...");
            int dado1 = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
            int dado2 = random.nextInt(6) + 1;
            
            System.out.println("Sus valores son:");
            System.out.println(dado1 + " " + dado2);

            System.out.print("¿Desea volver a tirar los dados (y = yes)? ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'y' || respuesta == 'Y');
        
        System.out.println("Programa finalizado.");
    }
}

