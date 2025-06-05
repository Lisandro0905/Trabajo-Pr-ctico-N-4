import java.util.Scanner;

public class VerificarCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra que empiece en mayúscula y supere los 8 caracteres: ");
        String cadena = scanner.nextLine();

        boolean longitud = cadena.length() > 8;
        boolean primeraMayuscula = Character.isUpperCase(cadena.charAt(0));
       
        if (longitud && primeraMayuscula) {
            System.out.println("Cadena correcta (" + cadena + ")");
        } else {
            System.out.println("Cadena incorrecta. Vuelva a ingresar.");
        }

        scanner.close();
    }
}
