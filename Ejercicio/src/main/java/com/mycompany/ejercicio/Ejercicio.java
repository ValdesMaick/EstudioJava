/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio;

/**
 *
 * @author Miche
 */
public class Ejercicio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }
}
