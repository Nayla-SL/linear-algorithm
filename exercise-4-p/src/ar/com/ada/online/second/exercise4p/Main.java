package ar.com.ada.online.second.exercise4p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Un estacionamiento requiere determinar el cobro que debe aplicar a las personas que lo
        //utilizan. Considere que el cobro es con base en las horas que lo disponen y que las
        //fracciones de hora se toman como completas y realice un diagrama de flujo y
        //pseudocódigo que representen el algoritmo que permita determinar el cobro.

        double hourPrice;
        int amountHours;
        double totalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas: ");
        amountHours = keyboard.nextInt();

        System.out.print("Ingrese el precio por hora: ");
        hourPrice = keyboard.nextDouble();

        totalPrice = hourPrice * amountHours;

        System.out.print("El monto a pagar es $" + String.format("%.2f", totalPrice));
    }
}
