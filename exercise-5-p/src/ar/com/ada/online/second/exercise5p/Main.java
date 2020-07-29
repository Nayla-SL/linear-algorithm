package ar.com.ada.online.second.exercise5p;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
        //Considere que se cobra por m2 y realice un diagrama de flujo y pseudocódigo que
        //representen el algoritmo que le permita ir generando presupuestos para cada cliente.

        int canvasSize;
        double pricePerMeter;
        double paintPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese los m2 que medirá la pintura: ");
        canvasSize = keyboard.nextInt();

        System.out.print("Ingrese el precio por m2: ");
        pricePerMeter = keyboard.nextDouble();

        paintPrice = canvasSize * pricePerMeter;

        System.out.print("El precio de la pintura será $" + String.format("%.2f", paintPrice));


    }
}
