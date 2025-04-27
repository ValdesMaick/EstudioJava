package ejercico1;

public class Ejercico1 {

    public static void main(String[] args) {
        /**
         * REalizar un programa que muestre en pantalla los numeros del 1 al 35 (uno bajo el otro).
         * Utilizar para esto alguna estructura repetitiva
         */
        
        // con estructura "for"
        for (int i=0; i < 35; i++) {
            System.out.println("N° in for: " + (i + 1));
        }
        
        
        // Con estructura "while"
        
        int cont = 0;
        while (cont < 35) {
            System.out.println("N° in while: " + (cont + 1));
            cont ++;
        }
        
        
    }
    
}
