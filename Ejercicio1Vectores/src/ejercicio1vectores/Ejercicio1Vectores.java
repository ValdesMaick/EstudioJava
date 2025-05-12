package ejercicio1vectores;

import java.util.Scanner;

public class Ejercicio1Vectores {

    public static void main(String[] args) {
        /**
         * llevar a cabo un programa que incluya un vector que almacene los nombres:
         * Alejandra Leonardo Rosa Guillermo Gabriel Daniel Luisa y Luzmila,
         * realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla
         */
        
        String nombres[] = new String[8];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < nombres.length; i ++){
            System.out.println("Ingrese el nombre que quiera guardar en el indice " + i);
            nombres[i] = teclado.next();
        }
        
        
        for (int i = 0; i < nombres.length; i++){
            System.out.println("Estes es el nombre guardado en la posición " + (i + 1) + ": " + nombres[i]);
        }
        
        
    }
    
}
