
package tarea5;

import java.util.Scanner;

/**
 *
 * @author ISSIS HERNANDEZ
 */

public class cuadrado extends formas{
  double lado=0;
   
  
    public cuadrado(Scanner entrada)
    {
      System.out.println("Ingrese el La longitud de un lado del Cudrado");
      lado=entrada.nextDouble();
      setDibujar("cuadrado");
      System.out.println("Ingrese Color de Cuadrado");
      setColor(entrada.next());
    }
    
    public double Area()
    {
      
    return lado*lado;
    }

  
    }

