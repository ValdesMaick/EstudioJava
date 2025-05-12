package ejercicio2vectores;

import java.util.Scanner;

public class Ejercicio2Vectores {

    public static void main(String[] args) {

        /*
        Realizar un programa que permita la carga de 10 números en un vector.
        Una vez cargados se necesita que el programa determine
        ual es el mayor y cual es el menor de ellos
         */
        int numeros[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero que quiere almacenar el la posición: " + i);
            numeros[i] = teclado.nextInt();

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

    }

}
