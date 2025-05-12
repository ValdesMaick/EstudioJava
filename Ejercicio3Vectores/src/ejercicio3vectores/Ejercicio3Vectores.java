package ejercicio3vectores;

import java.util.Scanner;

public class Ejercicio3Vectores {

    public static void main(String[] args) {
        /**
         * Realizar un programa que permita cargar 15 numeros en un vector. Una
         * vez cargados, se necesita que el programa cuente e informe por
         * pantalla Cuanstas veces se cargo el numero 3
         */

        int numeros[] = new int[15];
        Scanner teclado = new Scanner(System.in);
        int cantNro = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero que quier almecenar en la posicion " + (i + 1) + " : ");
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 3) {
                cantNro++;
            }
        }
        System.out.println("Se guardaron en total " + cantNro + " N° '3'");

    }
}
