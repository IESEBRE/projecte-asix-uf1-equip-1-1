import java.util.Random;
import java.util.Scanner;

public class Animal {
  public static boolean talking() {

        System.out.println("Quin tipus d'animal ets?");
        System.out.println("Introduiex un caràcter");

        String animal;

       Scanner entrada = new Scanner(System.in);
        animal = entrada.next();

        switch (animal) {
            case "G":
                System.out.println("Gos");
                break;
            case "M":
                System.out.println("Mono");
                break;
            case "S":
                System.out.println("Serp");
                break;
            default:
                System.out.println("No existeix");
        }

        System.out.println("A que t'agrada jugar?");

        String joc;

        joc = entrada.next();

        switch (joc) {
            case "A":
                System.out.println("A futbol");
                break;
            case "B":
                System.out.println("A basquet");
                break;
            case "C":
                System.out.println("A beisbol");
                break;
            case "D":
                System.out.println("A tennis");
                break;
            case "E":
                System.out.println("A padel");
                break;
            case "F":
                System.out.println("A ping-pong");
                break;
            case "G":
                System.out.println("A handbol");
                break;
            case "H":
                System.out.println("A videojocs");
                break;
            case "I":
                System.out.println("A cartes");
                break;
            case "J":
                System.out.println("Al poker");
                break;
        }

        System.out.println("Quin és el teu caràcter favorit?");

        char caracter = 'A';
        char caracter2;
        caracter2 = entrada.next().charAt(0);
        caracter2 = (char) (caracter2 - (caracter2 - caracter) / 2);
        while (caracter2 > caracter) {
            System.out.printf("%c ", caracter);

            caracter++;

        }
        System.out.println("...He triat el " + caracter2 + "!");

        System.out.println();

        System.out.println("Introdueix dos caràcters");

        char primercaracter;
        char segoncaracter;

        primercaracter = entrada.next().charAt(0);
        segoncaracter = entrada.next().charAt(0);

        System.out.println(primercaracter);

        System.out.println("Juguem a fer onomatopeies?");

        Random random = new Random();
        String setOfCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char randomChar = setOfCharacters.charAt(random.nextInt(setOfCharacters.length()));

        char a;
        int contador = 1;
        int contaronomatopeies = 0;

        while (true) {
            randomChar = setOfCharacters.charAt(random.nextInt(setOfCharacters.length()));
            if (contador == 0 || contador % 2 != 0) {
                System.out.print("Tu: ");
                a = entrada.next().toLowerCase().charAt(0);
                contador++;
            } else {
                System.out.println("Ell: " + randomChar);
                contador++;
            }


            if (contador == 31) break;

        }

    return true;
    }
}
