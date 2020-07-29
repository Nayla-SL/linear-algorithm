package ar.com.ada.online.second.exercise3p;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// empresa que contrata personal requiere determinar la edad de las personas que
        //solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año en
        //que nacieron. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo
        //para solucionar este problema.

        int birthYear;
        int actualYear;
        int age;

        actualYear = Calendar.getInstance().get(Calendar.YEAR);

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el año de nacimiento de la aplicante: ");
        birthYear = keyboard.nextInt();

        age = actualYear - birthYear;

        System.out.print("La edad de la aplicante es " + age);
    }
}
