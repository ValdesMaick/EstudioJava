package ejerciciomerceria;

import java.util.Scanner;

public class EjercicioMerceria {

    public static void main(String[] args) {

        // MErceria que vende por mayor
        /**
         * Menos de 5 paquetes NO SE VENDE Entre 5 y 15 ele envio vale 10 USD
         * Mas de 15 paquetes el envio sale gratis
         */
        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalConDesc;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cutantos paquetes quieres comprar? "
                + "Ingrese la cantidad de paquetes:");
        cantidadPaquetes = teclado.nextInt();

        /**
         * Para poder reutilizar la variable de teclado, lo que podemos hacer
         * es: Reiniciar la variable teclado, dejarla en 0, por eso se llama
         * nuevamente asi: teclado = new Scanner(System.in);
         */
        if (cantidadPaquetes < 5) {
            if (cantidadPaquetes <= 0) {
                System.out.println("No se permiten ventas negativas.");
            } else {
                System.out.println("La cantidad de paquetes es inferior a la minima requerida.");
            }
        } else {
            teclado = new Scanner(System.in);
            System.out.println("ingrese el monto total de la compra:");
            montoTotal = teclado.nextDouble();

            if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {
                System.out.println("El envio de tu compra tendra un coste de envio de 10 USD");
                montoTotal = montoTotal + 10;
            } else {
                System.out.println("El envio de tu compra sera gratuito!!");
            }

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menos a 100 por lo que no tiene promocion. "
                        + "Necesitas " + diferencia + " USD para tener una promo");
            } else {
                if (montoTotal >= 100 && montoTotal <= 300) {

                    // por que se usa el 0.05, es por que se divide el valor del descuento en 100 (5/100)
                    descuento = montoTotal * 0.05;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Su compra tiene un descueto total del 5% que equivale a: " + descuento
                            + " El monto total con descuento es de: " + totalConDesc + "USD");
                } else {
                    if (montoTotal > 300) {

                        // por que se usa el 0.05, es por que se divide el valor del descuento en 100 (5/100)
                        descuento = montoTotal * 0.10;
                        totalConDesc = montoTotal - descuento;
                        System.out.println("Su compra tiene un descueto total del 10% que equivale a: " + descuento
                                + " El monto total con descuento es de:" + totalConDesc + "USD");
                    }
                }

            }

        }

    }
}