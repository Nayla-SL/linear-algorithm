package ar.com.ada.online.second.exercise6p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Se requiere determinar la hipotenusa de un triángulo rectángulo. ¿Cómo sería el
        //diagrama de flujo y el pseudocódigo que representen el algoritmo para obtenerla?
        //

        double hypotenuse;
        double opposite;
        double adjacent;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor del Cateto Mayor: ");
        opposite = keyboard.nextDouble();

        System.out.print("Ingrese el valor del Cateto Menor: ");
        adjacent = keyboard.nextDouble();

        hypotenuse = Math.sqrt (Math.pow(opposite, 2) + Math.pow(adjacent, 2));

        System.out.print("El valor de la hipotenusa es: " + String.format("%.2f", hypotenuse));




    }
}
