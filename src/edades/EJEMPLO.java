
package edades;

import java.util.Scanner;

public class EJEMPLO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("INGRESE SU NOMBRE");
        String nombre = teclado.nextLine();
        System.out.println("EL LARGO DEL NOMBRE ES " + nombre.length());
    }
  
}
