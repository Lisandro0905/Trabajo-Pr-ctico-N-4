import java.util.Scanner;

public class ContadorPalabras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String texto = scanner.nextLine();

        String[] palabras = texto.trim().split(" ");

        int cantidadPalabras = palabras.length;

        System.out.println("Cantidad de palabras: " + cantidadPalabras);

        scanner.close();
    }
}
