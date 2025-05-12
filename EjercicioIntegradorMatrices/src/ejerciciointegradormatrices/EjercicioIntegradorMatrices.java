package ejerciciointegradormatrices;

import java.util.Scanner;

public class EjercicioIntegradorMatrices {

    public static void main(String[] args) {
        
        /**
         * En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundaria
         * Cada fila corresponde a las notas de cada alumno.
         * 
         * Se necesita un programa que permita a un profesor cargar las 3 primeras
         * posiciones de casa fila las notas del alimno y que en un vector diferente
         * se calculen los promedios
         */
        
        double notas[][] = new double[4][3];
        double promedios[] = new double[4];
        Scanner teclado = new Scanner(System.in);
        
        // Carga de las notas en la matriz
        for (int f = 0; f < notas.length; f++){
            System.out.println("Ingrese las 3 notas del alumno: " + (f+1));
            for(int c = 0; c < notas[0].length; c++){
                notas[f][c] = teclado.nextDouble();
            }
        }
        
        // Calcular los promedios
        // Este vactor debe tener la misma cantitad de posiciones que alumnos y coincidir en sus indices
        double total, promedio;
        for (int f = 0; f < notas.length; f++){
            total = 0;
            for(int c = 0; c < notas[0].length; c++){
                total = total + notas[f][c];
            }
            /**
             *  se puede usar de esta forma, declarando la Var promedio y usarla 
             * para guarda rel calcuclo y luedo guardar en el vector
             */
            //promedio = total / notas[0].length;
            //promedios[f] = promedio;
            
            // Pero es mas limpo usarlo de esta forma:
            promedios[f] = total / notas[0].length;
        }
        
        // mostrar notas y promedio:
        System.out.println("---------------PROMEDIOS---------------");
        for (int f = 0; f < notas.length; f++){
            System.out.println("Las notas del alumno N° " + (f+1) + " son:");
            for(int c = 0; c < notas[0].length; c++){
                System.out.println(notas[f][c]);
            }
            System.out.println("El promedio fue de: " + promedios[f]);
            System.out.println("---------------------------------------");
        }
        
        
    }
    
}
