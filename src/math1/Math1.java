/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Math1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float interes, capitalInteres;
        short monto, tiempo;

        System.out.print("Digite el monto: ");
        monto = entrada.nextShort();
        System.out.print("Digite el interes: ");
        interes = entrada.nextFloat();
        System.out.print("Digite el tiempo de pago en meses: ");
        tiempo = entrada.nextShort();

        interes /= 100;
        capitalInteres = monto + (monto * interes);

    }

}
