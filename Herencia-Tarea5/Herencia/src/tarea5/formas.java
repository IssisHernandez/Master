
package tarea5;

public class formas {
    private String dibujar;
    private String color;
   
    
   public formas(){
    
}
   public void setDibujar(String dibujar){
       this.dibujar=dibujar;
   }
   public String getDibujar(){
       return this.dibujar;
   }
    public void setColor(String color){
       this.color=color;
   }
   public String getColor(){
       return this.color;
   }
   
   
   
   public void Obtener_Informacion(){
       System.out.println("Dibujar: "+dibujar);
       System.out.println("Color: "+color);
       
   }
   
}
     
   
   

