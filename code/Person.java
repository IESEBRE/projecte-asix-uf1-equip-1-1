import java.util.*;

public class Person {

    public static boolean talking() {

        Scanner sc = new Scanner(System.in);

        //variable numero exercici 1
        int numero;
        //variable esport exercici 2
        int num;
        String esport = " ";
        //variables num exercici 3
        int num1 = 0;
        int num2;
        //String exercici 6
        String nom = " ";
        int mode;
        mode = sc.nextInt();
        boolean[] joel = new boolean[6];
        int pregunta = 0;
        while (pregunta != 8) {
            if (mode == 1) {
                System.out.println("Qüestionari:");
                System.out.println("1. Quin tipus de persona ets?");
                System.out.println("2. Quin esport t'agrada?");
                System.out.println("3. Quin és el teu número favorit entre 0 i ...?");
                System.out.println("4. Sabries llista tots els nombres parells resultants de la multiplicació entre valor enter a i b, on el valor de a creixerà fins b?");
                System.out.println("5. Juguem a pedra paper i tisora?");
                System.out.println("6. Posa-li un nom!");
                System.out.println("7. Pots recordar-me la nostra conversa?");
                System.out.println("8. Sortir");
            }
            pregunta = sc.nextInt();

            switch (pregunta) {
                case 1:
                    if (mode == 1) {
                        System.out.println("Escriu un número (0..100):");
                    }
                    Scanner sc1 = new Scanner(System.in);
                    numero = sc1.nextInt();
                    if (numero % 2 == 0 && numero % 3 == 0) {
                        System.out.println("No binari");
                    } else if (numero % 3 == 0) {
                        System.out.println("Dona");
                    } else if (numero % 2 == 0) {
                        System.out.println("Home");
                    }
                    joel[0] = true;
                    break;
                case 2:
                    if (joel[0]) {
                        if (mode == 1) {
                            System.out.println("Escriu un número (1..10):");
                        }
                        Scanner sc2 = new Scanner(System.in);
                        num = sc2.nextInt();
                        switch (num) {
                            case 1:
                                System.out.println("Hoquei");
                                esport = ("hoquei");
                                break;
                            case 2:
                                System.out.println("Basquet");
                                esport = ("basquet");
                                break;
                            case 3:
                                System.out.println("Handbol");
                                esport = ("handbol");
                                break;
                            case 4:
                                System.out.println("Patinatge");
                                esport = ("patinatge");
                                break;
                            case 5:
                                System.out.println("Rugbi");
                                esport = ("rugbi");
                                break;
                            case 6:
                                System.out.println("Ritmica");
                                esport = ("ritmica");
                                break;
                            case 7:
                                System.out.println("Natacio");
                                esport = ("natacio");
                                break;
                            case 8:
                                System.out.println("Judo");
                                esport = ("judo");
                                break;
                            case 9:
                                System.out.println("Atletisme");
                                esport = ("atletisme");
                                break;
                            case 10:
                                System.out.println("Ciclisme");
                                esport = ("ciclisme");
                                break;
                        }
                        joel[0] = false;
                        joel[1] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;

                    }
                case 3:
                    if (joel[1]) {
                        if (mode == 1) {
                            System.out.println("Dis-li un número màxim");
                        }
                        Scanner sc3 = new Scanner(System.in);
                        num2 = sc3.nextInt();
                        num2 = (num2 - (num2 - num1 + 1) / 2);
                        while (num2 > num1) {
                            System.out.print("" + num1 + " ");
                            num1++;
                        }
                        System.out.println("...He triat el " + num2 + "!");
                        joel[1] = false;
                        joel[2] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 4:
                    if (joel[2]) {
                        if (mode == 1) {
                            System.out.println("Quins dos nombres hem de multiplicar?");
                        }
                        Scanner sc4 = new Scanner(System.in);
                        int a;
                        int b;
                        a = sc4.nextInt();
                        b = sc4.nextInt();
                        if (a >= b)
                            break;
                        for (int i = a; i <= b; i++) {
                            System.out.println();
                            for (int j = b; j >= a; j--) {
                                System.out.print(i * j + "  ");
                            }
                        }
                        System.out.println();
                        joel[2] = false;
                        joel[3] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;

                    }
                case 5:
                    if (joel[3]) {
                        if (mode == 0) {
                            System.out.println("Tria!   1. Pedra");
                            System.out.println("        2. Paper");
                            System.out.println("        3. Tisora");
                        }
                        Scanner entrada = new Scanner(System.in);
                        List<String> joc = Arrays.asList("Pedra", "Paper", "Tisora");
                        Random rand = new Random();
                        int usuari, videsJugador = 5, videsOrd = 5;
                        String eleUsu;
                        boolean jugant = true;
                        while (jugant) {
                            usuari = entrada.nextInt();
                            var ordinador = Math.random();
                            String tord, eleRand;
                            if (ordinador < 0.34) {
                                eleRand = "Pedra";
                            } else if (ordinador <= 0.67) {
                                eleRand = "Paper";
                            } else {
                                eleRand = "Tisora";
                            }

                            eleUsu = joc.get(usuari - 1);

                            if (eleUsu == eleRand) {
                                System.out.print(eleRand + " - Empat ");
                                System.out.println("(" + videsJugador + " - " + videsOrd + ")");
                            } else {
                                if (eleUsu == "Pedra") {
                                    if (eleRand == "Tisora") {
                                        System.out.print("Tisora - Has guanyat ");
                                        videsOrd -= 1;
                                        System.out.println("(" + videsJugador + " - " + videsOrd + ")");
                                    } else {
                                        System.out.println("Paper - Has perdut ");
                                        videsJugador -= 1;
                                        System.out.println("(" + videsJugador + " - " + videsOrd + ")");
                                    }
                                }
                                if (eleUsu == "Paper") {
                                    if (eleRand == "Pedra") {
                                        System.out.print("Pedra - Has guanyat ");
                                        videsOrd -= 1;
                                        System.out.println("(" + videsJugador + " - " + videsOrd + ")");
                                    } else {
                                        System.out.println("Tisora - Has perdut ");
                                        videsJugador -= 1;
                                        System.out.println("(" + videsJugador + " - " + videsOrd + ")");
                                    }
                                }
                                if (eleUsu == "Tisora") {
                                    if (eleRand == "Paper") {
                                        System.out.print("Paper - Has guanyat ");
                                        videsOrd -= 1;
                                        System.out.println("(" + videsJugador + " - " + videsOrd + ")");
                                    } else {
                                        System.out.print("Pedra - Has perdut ");
                                        videsJugador -= 1;
                                        System.out.println("(" + videsJugador + " - " + videsOrd + ")");
                                    }
                                }
                            }
                            if (videsJugador == 0) {
                                System.out.println("Jugar se'm dona molt bé, has perdut!");
                                jugant = false;
                            } else if (videsOrd == 0) {
                                System.out.println("Jugar se'm dona bé però he de reconèixer que has guanyat de forma triunfal, ets molt bo!");
                                jugant = false;
                            }

                        }
                        joel[3] = false;
                        joel[4] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;

                    }

                case 6:
                    if (joel[4]) {
                        if (mode == 1) {
                            System.out.println("Escull un nom:");
                        }
                        Scanner sc6 = new Scanner(System.in);
                        nom = sc6.nextLine();
                        System.out.println("Gracies, m'agrada molt el nom de " + nom);
                        joel[4] = false;
                        joel[5] = true;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }

                case 7:
                    if (joel[5]) {
                        if (mode == 1) {
                            System.out.println("Hem dic " + nom + " i he nascut. El meu esport favorit és el " + esport + ". El meu número favorit es el");
                        }

                        joel[5] = false;
                        break;
                    } else {
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 8:
                    return false;

            }
        }
        return true;
    }
}
