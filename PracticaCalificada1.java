/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package practicas.practicacalificada1;

/**
 *
 * @author Nheiel
 */
import java.util.Scanner;

public class PracticaCalificada1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número final para los kilómetros por hora mayor a 60KPH: ");
        
        int finalKPH = scanner.nextInt();

        if (finalKPH <= 60 || finalKPH % 10 != 0) {
            System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
            System.exit(0);
        }

        System.out.println("KPH\tMPH");
        System.out.println("-------------------");

        for (int kph = 60; kph <= finalKPH; kph += 10) {
            double mph = kph * 0.6214;
            System.out.printf("%d\t%.1f\n", kph, mph);
        }
    }
}
