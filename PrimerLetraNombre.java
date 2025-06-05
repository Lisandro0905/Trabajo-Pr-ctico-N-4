import java.util.Scanner;

public class PrimerLetraNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba un nombre: ");
        String nombre = scanner.nextLine();

        char caracter = nombre.charAt(0);
        System.out.println("Primer letra del nombre: " + caracter);  

        scanner.close();
    }
}
