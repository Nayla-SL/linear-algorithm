package ar.com.ada.online.second.exercise7p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // La compañía de autobuses “La curva loca” requiere determinar el costo que tendrá el
        //boleto de un viaje sencillo, esto basado en los kilómetros por recorrer y en el costo por
        // kilómetro. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
        //para tal fin.

        double distanceKm;
        double pricePerKm;
        double tripPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de kilómetros que va a recorrer: ");
        distanceKm = keyboard.nextDouble();

        System.out.print("Ingrese el precio por kilómetro $");
        pricePerKm = keyboard.nextDouble();

        tripPrice = pricePerKm * distanceKm;

        System.out.print("El precio del viaje será $" + String.format("%.2f", tripPrice));



    }
}
