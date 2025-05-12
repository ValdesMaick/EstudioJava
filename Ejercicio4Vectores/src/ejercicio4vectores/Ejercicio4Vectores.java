package ejercicio4vectores;

import java.util.Scanner;

public class Ejercicio4Vectores {

    public static void main(String[] args) {
        /**
         * Un empleado desea almacenar en un vector sus 12 sueldos del año.
         * A partir de estp, necesitamos un programa que determine y muestre por pantalla
         * la suma total de sus 12 sueldos y el promedio de sus sueldo en el año.
         */
        
        double sueldos[] = new double[12];
        Scanner teclado = new Scanner(System.in);
        double total = 0, promedio;
        
        
        for (int i = 0; i < sueldos.length; i++){
            System.out.println("Ingrese el valor del sueldo para el mes N°: " + (i + 1));
            sueldos[i] = teclado.nextDouble();
        }
        
        for (int i = 0; i < sueldos.length; i++){
            total = total + sueldos[i];
        }
        
        // se puede hacer de esta forma, pero debemos tener en cuenta que si a futuro el vector,
        // tendra mas posiciones ya no seria funcional.
        //promedio = total / 12;
        
        promedio = total / sueldos.length;
        
        System.out.println("El total de los sueldos en los 12 meses es de: " + total);
        System.out.println("El promedio de los sueldos en los 12 meses es de: " + promedio);
    }
    
}