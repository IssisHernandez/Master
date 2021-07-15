/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.matematicas;

import java.util.Scanner;

/**
 *
 * @author Issis Hernandez
 */
public class Operaciones {
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
        int  Val1;
        int Val2;
        System.out.println("Ingrese Pimer Numero");
        Val1 = Leer.nextInt();
        System.out.println("Ingrese Segundo Numero");
        Val2= Leer.nextInt();
        
        System.out.println("La suma de los valores ingresados es: " + (Val1+Val2));
        System.out.println("La Resta de los valores ingresados es: " + (Val1-Val2));
        System.out.println("La Multiplicacion de los valores ingresados es: " + (Val1*Val2));
        System.out.println("La Division de los valores ingresados es: " + (Val1/Val2));
        
    }
    
}
