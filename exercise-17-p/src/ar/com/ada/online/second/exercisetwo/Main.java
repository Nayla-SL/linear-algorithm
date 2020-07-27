package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int notaUno;
        int notaDos;
        int notaTres;
        double promedio;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la primer nota: ");
        notaUno = keyboard.nextInt();
        System.out.print("Ingrese la segunda nota: ");
        notaDos = keyboard.nextInt();
        System.out.print("Ingrese la tercer nota: ");
        notaTres = keyboard.nextInt();

        promedio = (notaUno * 0.25 + notaDos * 0.25 + notaTres * 0.5);

        System.out.print("El promedio ponderado de las tres notas es: " + promedio);

    }
}
