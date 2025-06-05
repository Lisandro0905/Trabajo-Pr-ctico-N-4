import java.util.Scanner;

public class VerificarCorreo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un correo electrónico: ");
        String correo = scanner.nextLine();

        boolean longitud = correo.length() <= 22;
        boolean contieneArroba = correo.contains("@");
        boolean terminaEnCom = correo.contains(".com");

        if (longitud && contieneArroba && terminaEnCom) {
            System.out.println("El correo es válido (" + correo + ")");
        } else {
            System.out.println("El correo no es válido.");
        }

        scanner.close();
    }
}
