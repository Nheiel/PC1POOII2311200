/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Nheiel
 */
public class pregunta5 {

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numeroDia;
            
            System.out.print("Ingresa un número del 1 al 7 para representar un día de la semana: ");
            numeroDia = scanner.nextInt();
            
            switch (numeroDia) {
                case 1 -> System.out.println("Lunes");
                case 2 -> System.out.println("Martes");
                case 3 -> System.out.println("Miércoles");
                case 4 -> System.out.println("Jueves");
                case 5 -> System.out.println("Viernes");
                case 6 -> System.out.println("Sábado");
                case 7 -> System.out.println("Domingo");
                default -> System.out.println("Número ingresado fuera de rango (1-7)");
            }
        }
    }
}
}
