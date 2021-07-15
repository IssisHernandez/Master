
package tarea5;

import java.util.Scanner;

/**
 *
 * @author ISSIS HERNANDEZ
 */

public class circulo extends formas {
   
    double  Diametro=0;

    public circulo(Scanner entrada) {
        System.out.println("Ingrese el Diametro del Circulo");
        Diametro=entrada.nextDouble();
        setDibujar("circulo");
        System.out.println("Ingrese Color de Circulo");
        setColor(entrada.next());
       
        
       
       

    }   
    public double radio(){
        
        
        return Diametro/2;
    }


    
}
    
    
    

