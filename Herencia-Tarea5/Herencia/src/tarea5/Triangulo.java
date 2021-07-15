
package tarea5;

import java.util.Scanner;

/**
 *
 * @author ISSIS HERNANDEZ
 */
public class Triangulo extends formas {
    
     int base=0;
     int altura=0;

    public Triangulo(Scanner entrada) {
       System.out.println("Ingrese la base del triangulo");
        base=entrada.nextInt();
        System.out.println("Ingrese la Altura del triangulo");
        altura=entrada.nextInt();
        setDibujar("Triangulo");
        System.out.println("Ingrese Color del triangulo");
        setColor(entrada.next());
       
    }

   
    public int Area()
    {
        
        
    return (base*altura)/2;
       
    }
     
    
}
