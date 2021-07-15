
package tarea5;

import java.util.Scanner;

/**
 *
 * @author ISSIS HERNANDEZ
 */

public class Linea extends formas {
    int linea=0;
    

    public Linea(Scanner entrada) {
       System.out.println("Ingrese Tamaño de linea");
       linea=entrada.nextInt();
       setDibujar("Linea");
       System.out.println("Ingrese Color de linea");
       setColor(entrada.next());
       
    }


    public int Linea ()
    {
       return linea;
        
 
        
    }
    

}