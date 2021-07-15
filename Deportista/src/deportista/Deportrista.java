/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportista;

/**
 *
 * @author Issis Hernandez
 */
public class Deportrista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Basquetbolista Generales = new Basquetbolista();
        
        Generales.setNombre("LeBron James");
        System.out.println("Nombre del Futbolista: " +Generales.getNombre());
        
        
        Generales.setEquipo("Los Angeles Lakers");
        System.out.println("Equipo Actual: " +Generales.getEquipo());
        
        
        Generales.setPosicion("Alero");
        System.out.println("posicion: " +Generales.getPosicion());
        
        
        Generales.setEdad(36);
        System.out.println("Edad: " +Generales.getEdad()+ " años");
        
        
        Generales.setAltura(206);
         System.out.println("Estatura: " +Generales.getAltura()+ " cm");
                
    }
    
}
