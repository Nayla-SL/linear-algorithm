package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int radioCirculo;
        double pi;
        double areaCirculo;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        radioCirculo = keyboard.nextInt();

        pi = 3.1416;

        areaCirculo = pi * (radioCirculo * radioCirculo);

        System.out.println("El area del circulo es: " + areaCirculo);

    }
}
