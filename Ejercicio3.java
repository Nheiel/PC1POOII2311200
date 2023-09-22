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
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num1 = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
        int num2 = random.nextInt(101);
        int suma = num1 + num2;

        System.out.println("¿Cuál es la respuesta al siguiente problema?");
        System.out.println(num1 + " + " + num2 + " = ¿?");

        try {
            int respuestaUsuario = scanner.nextInt();

            if (respuestaUsuario == suma) {
                System.out.println("¡Correcto!");
            } else {
                System.out.println("Disculpa, respuesta equivocada. La respuesta correcta es " + suma + ".");
            }
        } catch (InputMismatchException e) {
            System.out.println("Programa finalizado, usted debe ingresar un número válido.");
        }
    }
}

