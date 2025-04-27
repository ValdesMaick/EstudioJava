package operadores;

import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) {
        
        // Con Scaner (que es una clase) puedo leer por teclado
        /**
         * lo que traduce es:
         * Crear una Var llamada "teclado"
         * Que permita ingresar datos al sistema "System.in"
         */
        Scanner teclado = new Scanner(System.in);
        
        // Se pueden declarar variables que sean del mosmo tipo en una sola linea
        double num1, num2, suma;
        
        // System.out.println ó (sout) nos permite mostrar algo por consola
        //System.out.println("Ingrese el numero que quieres operar");
        
        /**
         * Para usar la clase Scanner lo que tenemos que hacer es:
         * En la Var declarada antes "num1" llamar teclado (como nombramos la clase scanner)
         * al usar el punto despues del nombre podemos ver los metodos que podemos usar
         * Como nuestra Var es de tipo int usaremos el metodo "nexInt"
         */
        System.out.println("Ingrese el numero que quieres operar");
        num1 = teclado.nextDouble();
        System.out.println("Ingrese el numero que quieres operar");
        num2 = teclado.nextDouble();
        
        suma = num1 / num2;
        
        System.out.println("El resultado es: " + suma);
    }
    
}
