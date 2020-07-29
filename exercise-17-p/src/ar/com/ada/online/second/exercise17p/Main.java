package ar.com.ada.online.second.exercise17p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int noteOne;
        int noteTwo;
        int noteThree;
        double weightedAverage;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la primer nota: ");
        noteOne = keyboard.nextInt();
        System.out.print("Ingrese la segunda nota: ");
        noteTwo = keyboard.nextInt();
        System.out.print("Ingrese la tercer nota: ");
        noteThree = keyboard.nextInt();

        weightedAverage = (noteOne * 0.25 + noteTwo * 0.25 + noteThree * 0.5);

        System.out.print("El promedio ponderado de las tres notas es: " + weightedAverage);

    }
}
