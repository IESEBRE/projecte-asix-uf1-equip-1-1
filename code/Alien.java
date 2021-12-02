package com.iesebre;





import java.util.*;

public class Alien{

    public static boolean talking() {
        Scanner sc = new Scanner(System.in);
        String nom = "";
        String tipus = "";
        String vehicle = "";
        double fav = 0;
        boolean guanyat = false;
        boolean jugat = false;

        int pregunta = 0;
        while (pregunta != 8){
            System.out.println("Quina pregunta li vols fer a l'extraterrestre?");
            System.out.println("1. Quin tipus d'extraterrestre ets?");
            System.out.println("2. Com et desplaces?");
            System.out.println("3. Quin es el teu número favorit entre 0,0 i ... ?");
            System.out.println("4. Frikada");
            System.out.println("5. Juguem als barquets?");
            System.out.println("6. Posa-li un nom");
            System.out.println("7. Recorda'm la nostra conversa");
            System.out.println("8. Sortir");
            System.out.print("Opció: ");
            pregunta = sc.nextInt();

            switch (pregunta) {

                case 1:
                    double n, pd;
                    String m;
                    System.out.print("Introdueix un valor real entre 0 i 10: ");
                    n = sc.nextDouble();
                    pd = n % 1;
                    if (pd > 0.5) {
                        m = "Pau";
                        n = Math.ceil(n);
                    } else if (pd < 0.5) m = "Assassí";
                    else m = "Sucubus";

                    System.out.println(n + " " + m);
                    tipus = m;
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.print("Introdueix un valor real entre 0 i 1: ");
                    float ntransport = sc.nextFloat();
                    String transport = "";
                    if (ntransport <= 0.1) transport = "Patinet Quàntic";
                    else if (ntransport > 0.1 && ntransport <= 0.2) transport = "Jetpack de Matèria Oscura";
                    else if (ntransport > 0.2 && ntransport <= 0.3) transport = "Motocicleta Hextech";
                    else if (ntransport > 0.3 && ntransport <= 0.4) transport = "Porta intradimensional";
                    else if (ntransport > 0.4 && ntransport <= 0.5) transport = "Forat de Cuc";
                    else if (ntransport > 0.5 && ntransport <= 0.6) transport = "El cotxe de mamare";
                    else if (ntransport > 0.6 && ntransport <= 0.7) transport = "Teletransportació";
                    else if (ntransport > 0.7 && ntransport <= 0.8) transport = "Furgoneta";
                    else if (ntransport > 0.8 && ntransport <= 0.9) transport = "OVNI";
                    else if (ntransport > 0.9 && ntransport <= 1) transport = "Vaig caminant i saltant entre les estrelles";
                    System.out.println(transport);
                    vehicle = transport;
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.print("Introdueix un número màxim: ");
                    double max = sc.nextDouble(), nfav;
//                nfav = Math.round((max/2)*10.0)/10.0;
                    nfav = max / 2;
                    System.out.printf("%.1f%n", nfav);
                    for (double i = 0.0; i <= nfav; i += 0.1) {
                        System.out.printf("%.1f ", i);
                    }
                    System.out.println("\n");
                    fav = nfav;
                    break;

                case 4:
                    System.out.println("Sabries llistar tots els números que amb decimal després de la coma igual a #,5 després \n" +
                            "de la operació (a+b)/2, entre el valor float de a i b, on el valor de a creixerà fins b, b \n" +
                            "decreixerà fins a ? ");
                    float a = sc.nextFloat();
                    float b = sc.nextFloat();

                    while (a<b){
                        float op = a+b/2;
                        //System.out.println(op);
                        float operacion = Math.round(op*10F)/10F;
                        //System.out.println(operacion);
                        double decimalOperacion = operacion % 1;
                       if (decimalOperacion == 5){
                            System.out.print(operacion + "    ");

                        }
                        a+= 0.1;
                    }
                    System.out.println("\n");

                    break;

                case 5:
                    float llimit = 0F, rlimit = 4F;
                    float etrcoo = llimit + new Random().nextFloat() * (rlimit - llimit);
                    //System.out.println(etrcoo);
                    etrcoo = Math.round(etrcoo * 10F) / 10F;
                    System.out.println(etrcoo);
                    int intent = 10;
                    while (intent > 0) {
                        System.out.printf("Digita una coordenada per a pegar un cañonaso: ");
                        float pcoo = sc.nextFloat();
                        if (pcoo == etrcoo) {
                            System.out.println("Tocat");
                            guanyat = true;
                            break;
                        } else {
                            if (Math.abs(etrcoo - pcoo) <= 0.3) {
                                System.out.println("Estàs a prop!");

                            } else if (Math.abs(etrcoo - pcoo) > 0.3 && Math.abs(etrcoo - pcoo) <= 1F) {
                                System.out.println("Estàs a lluny!");

                            } else if (Math.abs(etrcoo - pcoo) > 1F) {
                                System.out.println("Estàs mooolt lluny!");
                            }
                        }
                        intent--;
                        System.out.println("Vides restants: " + intent);
                    }
                    if (intent == 0) {
                        System.out.println("Has perdut!");


                    }
                    jugat = true;
                    System.out.println("\n");
                    break;

                case 6:
                    System.out.println("Posam un nom moloon");
                    sc.nextLine();
                    String aliennom = sc.nextLine();
                    System.out.println("Gràcies m'agrada aquest nom :))");
                    nom = aliennom;
                    break;

                case 7:
                    System.out.println("Hola em dic "+ nom +" i sóc un Alien "+ tipus + ". Em solc desplaçar mitjançant " +
                            "" +
                            ""+ vehicle + ". El meu numero favorit es el: "+ fav);

                    if (jugat){
                        if (guanyat){
                            System.out.println("Jugar se'm dona bé però he de reconèixer que has guanyat de forma triunfal, ets molt bo!");
                        } else{
                            System.out.println("Jugar se'm dona bé, però la veritat es que ets dolentíssim, mai en la meva vida havia jugat contra algú tan dolent");
                        }
                    }
                    System.out.println("\n");
            }

            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(2 * 1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }

        return true;
    }

}

