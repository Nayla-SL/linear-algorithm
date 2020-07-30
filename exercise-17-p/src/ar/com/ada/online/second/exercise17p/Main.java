package ar.com.ada.online.second.exercise17p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para
        //determinar el promedio que obtendrá un alumno considerando que realiza tres
        //exámenes, de los cuales el primero y el segundo tienen una ponderación de 25%,
        //mientras que el tercero de 50%


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
