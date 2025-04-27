package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        /**
         * Re alizar un programa que lleve a cabo la cuenta regresiva para el
         * año nuevo la cuenta debe comenzar en 10 y terminar en 1
         */

        int cont = 10;
        while (cont > 0) {
            System.out.println("T- con while: " + cont);
            cont -= 1;
        }
        System.out.println("Feliz año nuevo!!");

        for (int i = 10; i > 0; i--) {
            System.out.println("T- con for: " + i);
        }
        System.out.println("Feliz año nuevo!!");
    }

}
