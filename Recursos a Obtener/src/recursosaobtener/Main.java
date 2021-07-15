/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursosaobtener;

/**
 *
 * @author Issis Hernandez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursos Valores;
        Valores = new Recursos();
        
        Valores.SalidaDeTexto("Programación Orientada a Objetos 2021");
        System.out.println(Valores.getSalidaDeTexto());
        
        Valores.sedEdad(22);
         System.out.println(Valores.getEdad());
         
        Valores.setValores(10, 20);
        System.out.println("La multiplicacion de los valores es: " + Valores.getValores());
        
        Valores.setImpresiones(100);
        Valores.getImpresiones();
        
    }
    
}
