package ejemplomatrices;

import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {

        // Importante tener en cuenta que si una matriz tiene la misma cantidad de filas y columnas se llamara una: MATRIZ CUADRADA
        // Para este ejemplo crearemso una matriz cuadrada de 3x3
        int matriz[][] = new int[3][3];
        Scanner teclado = new Scanner(System.in);

        /**
         * Para recorrer matrices tenemos que usar un for dentro de un for El
         * for principal recorrera las filas Y el for dentro del for recorrera
         * cada columna
         */
        // Recorrido para cargar los valores en la matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el valor para, fila " + f + " columna " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }

        // Recorrido para mostrar los valores de la matriz
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Este es el valor: '" + matriz[f][c] + "', para fila " + f + " columna " + c);
                
            }

        }

    }

}
