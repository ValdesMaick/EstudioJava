package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        /*
        Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que escriba "salir"
         */
        
        
        /*
        ESTA ES MI SOLUCION, QUE FUNCIONA PERO SE PUEDE HACER MAS CORTA
        */
        
        /*
        String palabras;
        boolean validarPalabra = false;
        Scanner teclado = new Scanner(System.in);

        while (validarPalabra == false) {
            System.out.println("Escribe la pasabra a imprimir:");
            System.out.println("Escribe 'Salir' para temrinar");
            
            // al usar el ".nest()" si escribimos una frase mostrara palabra por palabra
            //palabras = teclado.next();
            
            //Como alternativa podemos usar ".nexLine()" para que muestre la frase completa
            palabras = teclado.nextLine();

            if (palabras.equalsIgnoreCase("salir")) {
                System.out.println("Haz escrito la pasabra 'Salir'");
                validarPalabra = true;
            } else {
                System.out.println("La palabra que escribiste es: " + palabras);
            }

        }*/
        
        
        /*
        ESTA ES UNA SOLUCUON MAS CORTA NEGANDO LA PASLABRA SALIR EN LA CONDICION DEL WHILE
        */
        
        String palabra;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe la pasabra a imprimir:");
        System.out.println("Escribe 'Salir' para temrinar");
        palabra = teclado.nextLine();
        
        while (!palabra.equalsIgnoreCase("salir")){
            System.out.println("La palabra que escribiste es: " + palabra);
            
            System.out.println("Escribe la pasabra a imprimir:");
            System.out.println("Escribe 'Salir' para temrinar");
            palabra = teclado.nextLine();
        }
        
        

    }

}
