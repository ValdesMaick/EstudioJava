package ejemplovectores;

import java.util.Scanner;

public class EjemploVectores {

    public static void main(String[] args) {
        
        
        /**
         * Los vectores son unidimencionales ó arrays de una dimencion
         * Es importante saber que en estos se deben guardad datos el mismo tipo 
        */
 
        int numeros [] = new int [8];
            numeros [0] = 15;
            numeros [1] = 35;
            numeros [2] = 22;
            numeros [3] = 14;
            numeros [4] = 41;
            numeros [5] = 61;
            numeros [6] = 91;
            numeros [7] = 23;
        
        
        // Asi podemos mostrar por consola algun indice del array
        System.out.println("Forma de mostrar una posicion en especifico");
        System.out.println("Este es el numero de la posicion 3: " + numeros[2]);
        System.out.println("");
        
        
        System.out.println("Forma para mostrar las posiciones recorriendo el array con for");
        System.out.println("");
        for(int i=0; i<numeros.length; i++){
            System.out.println("Estoy en el indice " + i + " con la posicion N°:" + (i + 1) + " y el valor:" + numeros[i]);
        }
        
        
        
        System.out.println("********************************************************************************");
        
        
        int numeritos[] = new int [8];
        Scanner teclado = new Scanner(System.in);
        
        
        for(int i=0; i<numeritos.length; i++){
            System.out.println("Ingrese el valor para el indice " + i + ":");
            numeritos[i] = teclado.nextInt();
        }
        
        System.out.println("Los valores ingresados fueron:");
        
        for(int i=0; i<numeritos.length; i++){
            System.out.println("Indice " + i + " valor:" + numeros[i]);
        }
        
    }
    
}
