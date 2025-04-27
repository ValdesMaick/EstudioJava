package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        // Un programa que dependido del promedio de un alummno nos diga si aprobo o no una materia 
        
        
        // Declaracion de variables
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        
        // Pedirle al usuario que ingrese el promedio por teclado
        System.out.println("Ingrese el promedio de alumno:");
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio >= 6) ? "Aprobado" : "Desaprobado";
        
        System.out.println("La condicion final del alumno es: " + condicionFinal);
        
    }
    
}
