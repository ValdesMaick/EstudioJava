package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        /**
         * Realizar un programa que muestre por pantalla los numeros
         * del 200 al 250 saltando de 2 en 2.
         * la secuencia deberia se: 200.. 202.. 204.. etc.
         */
        
        // Con la estructura for
        for (int i = 200; i <= 250; i += 2){
            System.out.println("N° en for: " + i);
        }
        
        // Con estrcutura while
        
        int cont = 200;
        while (cont <= 250){
            System.out.println("N° en while: " + cont);
            cont += 2;
        }
    }
    
}
