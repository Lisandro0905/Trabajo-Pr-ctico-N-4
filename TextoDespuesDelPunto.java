import java.util.Scanner;

public class TextoDespuesDelPunto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena que contenga un punto: ");
        String texto = scanner.nextLine();

        int punto = texto.indexOf('.'); 

        String despuesPunto = texto.substring(punto + 1);

        System.out.println("Texto después del punto: " + despuesPunto);

        scanner.close();
    }
}
