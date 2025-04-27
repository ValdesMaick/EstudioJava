package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*
        Realizar un programa que dado por teclado un limite numerico (Por ejemplo 100) Muestre en pantalla todos los numeros hasta ese limite (Desde 1)
         */

        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.println("Ingrese el limite de la ejecucion: ");

            if (teclado.hasNextInt()) {
                numero = teclado.nextInt();
                entradaValida = true;
            } else {
                System.out.println("No se permiten caracteres diferentes a numeros '1,2,3,4,5,6,7,8,9,0'");
                teclado.next();
            }
            for (int i = 0; i < numero; i++) {
                System.out.println("Estas en el numero: " + (i + 1));
            }
        }
    }
}
