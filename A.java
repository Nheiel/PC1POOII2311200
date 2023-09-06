/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicas.lab2POOI2311200;

/**
 *
 * @author Nheiel
 */
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");

        try {
            long n = sc.nextLong();
            System.out.println(n + " puede ser almacenado en:");

            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println("(*) byte");
            }
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println("(*) short");
            }
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println("(*) int");
            }
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println("(*) long");
            }

            if (!(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) &&
                !(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) &&
                !(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) &&
                !(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)) {
                System.out.println(n + " no se puede almacenar en ningún tipo de dato primitivo.");
            }

        } catch (Exception e) {
            System.out.println("Entrada no válida. Debe ingresar un número entero.");
        } finally {
            sc.close();
        }
    }
}


