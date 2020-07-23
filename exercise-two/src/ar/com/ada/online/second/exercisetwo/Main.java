package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int sumaNotas;
        int promedioNotas;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese la primer nota del alumno");
        nota1 = keyboard.nextInt();
        System.out.println("Ingrese la segunda nota del alumno");
        nota2 = keyboard.nextInt();
        System.out.println("Ingrese la tercer nota del alumno");
        nota3 = keyboard.nextInt();
        System.out.println("Ingrese la cuarta nota del alumno");
        nota4 = keyboard.nextInt();

        sumaNotas = nota1 + nota2 + nota3 + nota4;
        promedioNotas = sumaNotas/4;

        System.out.println("El promedio del alumno es: " + promedioNotas);



    }
}
