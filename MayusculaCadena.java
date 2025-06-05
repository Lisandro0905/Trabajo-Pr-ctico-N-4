import java.util.Scanner;

public class MayusculaCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba una palabra en minúsculas: ");
        String texto = scanner.nextLine();

        String mayuscula = texto.toUpperCase();

        System.out.println("En mayúsculas: " + mayuscula);

        scanner.close();
    }
}
