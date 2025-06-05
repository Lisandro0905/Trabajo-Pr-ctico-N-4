import java.util.Scanner;

public class RecortEspaciosCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Escriba una palabra: ");
        String texto = scanner.nextLine();

        String textoRecortado = texto.trim();
        System.out.println("[" + textoRecortado + "]");

        scanner.close();
    }
}
  