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
public class Recursos {
    private String SalidaDeTexto; 
    
    private int edad;
    
    private int Valor1, Valor2; 
    
    private int Impresiones;
    
    
  
    public void SalidaDeTexto(String Mensaje){
       this.SalidaDeTexto = Mensaje; 
    }
    
    public String getSalidaDeTexto(){
     return SalidaDeTexto;    
    }
    
      public void sedEdad(int edad){
   this.edad = edad; 
    }
    
    public String getEdad(){
        String E = null;
        if(edad >= 21){
         E = "Mayor de edad";   
        }
        
        if (edad < 21){
            E = "Menor de edad";
        }
        
        return E; 
    }
    
    public void setValores(int entero1, int entero2){
        this.Valor1 = entero1;
        this.Valor2 = entero2;
    }
    
    public int getValores (){
        int  Resultado;
        Resultado = this.Valor1*this.Valor2;
        return Resultado;
    }
    
       public void setImpresiones(int Impresiones){
        this.Impresiones = Impresiones;
        
    }
    
    public int getImpresiones (){
        int ALMACEN
                =0;
        for(int i=0; i<this.Impresiones+1; i++){
            ALMACEN=i;
            System.out.println(ALMACEN);
            }
        
        return (ALMACEN);
    } 
    
    
}
