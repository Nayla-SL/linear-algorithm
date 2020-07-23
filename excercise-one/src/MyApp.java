import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        // ingreso las variables
        int firstNumber;
        int secondNumber;
        int result;

        // habilito el ingreso de datos por el teclado
        Scanner keyboard = new Scanner(System.in);

        //pido y leo los datos del usuario
        System.out.print("Ingrese el primer número: ");
        firstNumber = keyboard.nextInt();
        System.out.print("Ingrese el segundo número: ");
        secondNumber = keyboard.nextInt();

        //realizo la suma y la guardo
        result = firstNumber + secondNumber;

        //muestro el resultado
        System.out.println("El resultado es: " + result);
    }
}
