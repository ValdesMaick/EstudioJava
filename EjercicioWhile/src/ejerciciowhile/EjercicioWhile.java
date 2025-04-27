package ejerciciowhile;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        
        // Ejemplo bucle con contador
        /*int contador = 0;
        
        while (contador < 10) {
            System.out.println("Estoy en la vulta N°: " + (contador + 1));
            contador ++;
            
        }*/
        
        
        // Ejemplo bucle controlado por centinela
        
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        while (bandera == true){
             System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("Estas actualemnte suscrito? " +  bandera);
            
            System.out.println("Quieres Cancelar la suscripcion al canal?");
            respuesta = teclado.next();
            
            if (respuesta.equalsIgnoreCase("si")){
                bandera = false;
            }
            
            System.out.println("*********************************************");
        }
        
    }
    
}
