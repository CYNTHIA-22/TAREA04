
package edades;

import javax.swing.JOptionPane;

public class EDADES {

    public static void main(String[] args) {
       int edad1,edad2,edad3;
       
       edad1=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA EDAD DE JUAN"));
       edad2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA EDAD DE MARIA"));
       edad3=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA EDAD DE MARIO"));
       
       if (edad1 >=18 && edad1<=100  && edad2 >=18 && edad2<=100 && edad3>=18 && edad3<=100){
           }
       else{
            System.out.println("INGRESE NUEVAS EDADES MAYORES A 17"); 
           main(args);
       } 
       
       if (edad1 == edad2 && edad2 == edad3){
           System.out.println("LOS TRES TIENEN LA MISMA EDAD"); 
           
       }else if (edad1 > edad2 && edad1 > edad3){
           System.out.println("JUAN TIENE.." + edad1 +  "..AÑOS Y ES MAYOR QUE MARIA Y MARIO");
           
       }
       else if (edad2 > edad1 && edad2 > edad3){
           System.out.println("MARIA TIENE.." + edad2 + "..AÑOS Y ES MAYOR QUE JUAN Y MARIO");
       }
       else{
           System.out.println("MARIO TIENE.." + edad3 + "..AÑOS Y ES MAYOR QUE JUAN Y MARIA");
       }
    }
    
}
