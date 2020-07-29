package ar.com.ada.online.second.exercise1p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para obtener
        //el área de un triángulo.

        double base;
        double height;
        double totalArea;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        base = keyboard.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        height = keyboard.nextDouble();

        totalArea = (base * height)/2;

        System.out.print("El area del triangulo es: " + String.format("%.2f", totalArea));


    }
}
