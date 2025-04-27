package ejerciocioif;

import java.util.Scanner;

public class EjerciocioIf {

    public static void main(String[] args) {
        
        int edad;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la edad:");
        edad = teclado.nextInt();
        
        /*
        if (edad >= 18) {
            System.out.println("Eres mayor de edad!");
        }else{
            System.out.println("No Tienes permiso");
        }
        */
        
        
        if (edad > 18) {
            System.out.println("Eres mayor de edad!");
            
            if (edad > 40){
                System.out.println("Felicidades eres generacion X");
            }else{
                System.out.println("Eres milenial");
            }
        }else{
            if (edad == 18){
                System.out.println("Teienes excatamente 18 años");
            }else {
            System.out.println("No Tienes permiso");
            }
        }
        
        
        
        System.out.println("Llegue al final.");
    }
        
    
}
