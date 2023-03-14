/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24.cap4;

import java.util.Scanner;


public class Ejercicio24Cap4 {

    public static void main(String[] args) {
        double A, B, C;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Peso de esfera A: ");
        A = entrada.nextDouble();
        System.out.print("Peso de esfera B: ");
        B = entrada.nextDouble();
        System.out.print("Peso de esfera C: ");
        C = entrada.nextDouble();
        
         if (A > B && A > C) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (B > C) {
            System.out.println("La esfera B es la de mayor peso.");
        } else {
            System.out.println("La esfera C es la de mayor peso.");
        }
    }
}
