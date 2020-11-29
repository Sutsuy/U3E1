/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasarreglos;
import java.util.*;
/**
 *
 * @author HP
 */
public class OperacionPilas {
 Scanner leer=new Scanner (System.in); 
 
 String [] arreglo=new String [5];
 int tope=-1;
 
 
  public void insertar()
 {
   if(tope >= arreglo.length-1){
            System.out.println("La pila está llena");
        }
        else{
            tope +=1;
            System.out.println("Ingrese los datos  ");            
            arreglo[tope] =leer.nextLine();
        }
 }
 
  
 public void eliminar()
 {
     
     if(tope == -1){
            System.out.println("Corazon no hay nada ");
        }
        else{
            System.out.println("Se elimino un elemento");
            arreglo[tope]= "";
         tope--;
        } 
     
 }
 
 
   
 public void mostar ()
 {
     for(int tope = 4; tope >= 0; tope--){
            System.out.println("" +arreglo[tope]);            
        }
 }
 
 
 
  public void Menu(){
        Scanner leer=new Scanner(System.in); 
        int opcion,opc;
        
       do{
        System.out.println("**********************************************");
        System.out.println("++++++++++++++Pilas  ++++++++++++++++");
        System.out.println("1.- Insertar ");
        System.out.println("2.- Eliminar  ");
        System.out.println("3.- mostrar   ");
        System.out.println("4.- Salir  ");
        System.out.println("**********************************************");
            System.out.println("Elige una opcion ---->");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:
               insertar();
             
            break;
                
            case 2:
              eliminar();  
            break;
                
            case 3:
               mostar();
            break;
            
         
               
             
            case 4:
                System.out.println("CAMBIO Y FUERA ");
            break;
                
            
            default: 
            {
                System.out.println("Corazon la opcion que ingresaste es incorresta :c  ");    
            }    
                
                
        }
    
           System.out.println("-- 7)si  8)no"); 
           opc=leer.nextInt();
}
       while(opc==7);
        
       if(opc==8){
           System.out.println("Gracias por estar aqui");
      }
                
         
     
     
                
     }
 
 
 
 
 
    
    
}
