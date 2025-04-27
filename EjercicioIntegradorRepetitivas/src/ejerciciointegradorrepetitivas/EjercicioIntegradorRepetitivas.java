package ejerciciointegradorrepetitivas;

import java.util.Scanner;

public class EjercicioIntegradorRepetitivas {

    public static void main(String[] args) {

        /**
         * Varios clientes: El programa debo solicitar por teclado los
         * siguientes datos: La placa del vehiculo El tipo de estacionamiento
         */
        String placa = "";
        int tipoServicio, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
        double total, totalDia = 0;
        Scanner teclado = new Scanner(System.in);

        /**
         * El programa debe calcular el ,osmto apagar para cada cliente en
         * funcion del tipo de estacionamiento seleciconado. la carga de datos
         * dee continuar hasta que el usuario ingrese la plabra "FIN" en lugar
         * de una placa
         */
        while (!placa.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese la placa de su vehiculo:");
            placa = teclado.nextLine();

            if (!placa.equalsIgnoreCase("fin")) {
                System.out.println("Ingrese el tipo de servicio:");
                System.out.println("1- por horas");
                System.out.println("2- Media jornada (5 Horas)");
                System.out.println("3- Jornada completa (Hasta 10 horas)");
                teclado = new Scanner(System.in);
                tipoServicio = teclado.nextInt();

                if (tipoServicio <= 0 || tipoServicio > 3) {
                    System.out.println("No ingreso un tipo de servicio correcto");
                } else {
                    /**
                     * Los tipos de estacionamiento disponible son 3: - Por hora
                     * (cuyo valor es 3USD por hora) - Media hornada (Cuyo valor
                     * es 15USD y posee 5% descuento) - Hornada completa (cuyo
                     * valor fijo es de 30USD y posee 10% descuento)
                     */

                    if (tipoServicio == 1) {
                        System.out.println("Ingrese la cantidad de horas que desea seleccionar:");
                        teclado = new Scanner(System.in);
                        cantHoras = teclado.nextInt();
                        total = cantHoras * 3;

                        System.out.println("El total de su parqueo es de: $" + total + "USD");
                        cont1 += 1;
                        totalDia = totalDia + total;
                    } else {
                        if (tipoServicio == 2) {
                            System.out.println("El servicio de media hornada es de 5 horas, tienes 5% de descuento.");
                            total = 15 - (15 * 0.05);

                            System.out.println("El total de su parqueo es de: $" + total + "USD");
                            cont2 += 1;
                            totalDia = totalDia + total;
                        } else {
                            System.out.println("El servicio de jornada completa es de 5 horas, tienes 10% de descuento.");
                            total = 30 - (30 * 0.10);

                            System.out.println("El total de su parqueo es de: $" + total + "USD");
                            cont3 += 1;
                            totalDia = totalDia + total;
                        }
                    }
                System.out.println("*********** ¡¡MUCHAS GRACIAS POR SU COMPRA!! ***********\n");
                }
                teclado = new Scanner(System.in);
            }
        }
        System.out.println("==============================================================");
        System.out.println("Totales monetarios del dia:");
        System.out.println("Cantidad servicio por hora: " + cont1);
        System.out.println("Cantidad servicio media jornada: " + cont2);
        System.out.println("Cantidad servicio jornada completa: " + cont3);
        System.out.println("El monto tal recaudado del dia es de: $" + totalDia + "USD");
    }

}
