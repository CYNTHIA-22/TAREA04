
package edades;

import java.util.Scanner;

public class DESIGUALDADTRIANGULAR {
    public static void main(String[]args){
        double x,y,z;
       
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("INGRESE EL VALOR DEL LADO X");
       
        
        x=Double.parseDouble(teclado.nextLine());
       
        
        while(x<=0){
            System.out.println("INGRESE VALOR POSITIVO"); 
        
            x=Double.parseDouble(teclado.nextLine());   
        }
          
        
        System.out.println("INGRESE EL VALOR DEL LADO Y ");
        y=Double.parseDouble(teclado.nextLine());
         while(y<=0){
            System.out.println("INGRESE VALOR POSITIVO"); 
        
            y=Double.parseDouble(teclado.nextLine());   
        }
          
        
        
        System.out.println("INGRESE EL VALOR DEL LADO Z");
        z=Double.parseDouble(teclado.nextLine());
         while(z<=0){
            System.out.println("INGRESE VALOR POSITIVO"); 
        
            z=Double.parseDouble(teclado.nextLine());   
        }
          
       
         if (x + y > z && y + z > x && z + x > y){
            System.out.println("ES UN TRIANGULO");
            
        }
        else{
            System.out.println("ESTE NO ES UN TRIANGULO");
        }
         
        
        
       
        
        
        
        
    }
           
}
