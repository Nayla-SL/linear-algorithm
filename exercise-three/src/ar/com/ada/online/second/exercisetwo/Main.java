package ar.com.ada.online.second.exercisetwo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int alturaRectangulo;
        int baseRectangulo;
        int areaRectangulo;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la altura del rectángulo: ");
        alturaRectangulo = keyboard.nextInt();
        System.out.print("Ingrese la base del rectángulo: ");
        baseRectangulo = keyboard.nextInt();

        areaRectangulo = alturaRectangulo + baseRectangulo;

        System.out.print("El área del rectángulo es: " + areaRectangulo);



    }
}
