import java.util.Scanner;

public class ComparacionCadenas {

    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);

    System.out.print ("Escriba una palabra: ");
    String cadena1 = scanner.nextLine();

    System.out.print ("Escriba otra palabra (igual o distinta): ");
    String cadena2 = scanner.nextLine();

boolean iguales = cadena1.equals(cadena2);


System.out.println("Las palabras son iguales?: " + iguales);  
    }
}