import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};
        int victoriasJugador = 0;
        int victoriasComputadora = 0;

        System.out.println("¡Bienvenido a Piedra, Papel o Tijera!");

        while (victoriasJugador < 2 && victoriasComputadora < 2) {
            System.out.print("Elige (piedra, papel o tijera): ");
            String eleccionJugador = scanner.nextLine().trim().toLowerCase();

            if (!eleccionJugador.equals("piedra") && 
                !eleccionJugador.equals("papel") && 
                !eleccionJugador.equals("tijera")) {
                System.out.println("Opción inválida. Intenta de nuevo.");
                continue;
            }

            String eleccionComputadora = opciones[random.nextInt(opciones.length)];
            System.out.println("La computadora eligió: " + eleccionComputadora);

            if (eleccionJugador.equals(eleccionComputadora)) {
                System.out.println("¡Empate!");
            } else if ((eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                       (eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra")) ||
                       (eleccionJugador.equals("tijera") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste esta ronda!");
                victoriasJugador++;
            } else {
                System.out.println("La computadora gana esta ronda.");
                victoriasComputadora++;
            }

            System.out.println("Marcador - Tú: " + victoriasJugador + " | Computadora: " + victoriasComputadora);
            System.out.println();
        }

        if (victoriasJugador == 2) {
            System.out.println("¡Felicidades! Ganaste el juego.");
        } else {
            System.out.println("La computadora ganó el juego. ¡Suerte para la próxima!");
        }

        scanner.close();
    }
}
