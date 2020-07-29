package ar.com.ada.online.second.exercise8p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Se requiere determinar el tiempo que tarda una persona en llegar de una ciudad a otra
        //en bicicleta, considerando que lleva una velocidad constante. Realice un diagrama de
        //flujo y pseudocódigo que representen el algoritmo para tal fin.

        double distance;
        double velocity;
        double time;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la distancia en kilómetros a recorrer :");
        distance = keyboard.nextDouble();

        System.out.print("Ingrese la velocidad en km/hora ");
        velocity = keyboard.nextDouble();

        time = distance / velocity;

        System.out.print("La ciclista tardará " + time + " hs en recorrer " + distance + " km.");





    }
}
