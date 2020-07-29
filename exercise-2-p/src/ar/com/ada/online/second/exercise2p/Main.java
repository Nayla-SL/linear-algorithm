package ar.com.ada.online.second.exercise2p;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Una empresa importadora desea determinar cuántos dólares puede adquirir con equis
        //cantidad de dinero mexicano. Realice un diagrama de flujo y pseudocódigo que
        //representen el algoritmo para tal fin

        double dollarValue;
        double mexicanAmount;
        double dollarAmount;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de pesos Méxicanos que desea cambiar: ");
        mexicanAmount = keyboard.nextDouble();

        dollarValue = 21.97;

        dollarAmount = mexicanAmount / dollarValue;

        System.out.print("Usted puede comprar U$S" + String.format("%.2f", dollarAmount));


    }
}
