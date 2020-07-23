package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int alturaLarga;
        int baseTerreno;
        int alturaCorta;
        int areaRectangulo;
        int areaTriangulo;
        int areaTerreno;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la medida de la altura más larga del terreno: ");
        alturaLarga = keyboard.nextInt();

        System.out.println("Ingrese la medida de la altura más corta del terreno: ");
        alturaCorta = keyboard.nextInt();

        System.out.println("Ingrese la medida de la base del terreno: ");
        baseTerreno = keyboard.nextInt();

        areaRectangulo = alturaCorta * baseTerreno;

        areaTriangulo = (baseTerreno * (alturaLarga - alturaCorta) ) /2;

        areaTerreno = areaRectangulo + areaTriangulo;

        System.out.println("El area total del terreno es: " + areaTerreno);

    }
}
