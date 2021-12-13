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
        boolean[] joel = new boolean[6];
        int mode;
        int pregunta = 0;
        mode = sc.nextInt();
        while (pregunta != 8){
            if (mode==1){
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
            }

            pregunta = sc.nextInt();

            switch (pregunta) {

                case 1:
                    double n, pd;
                    String m, s;
                    if (mode==1){
                        System.out.print("Introdueix un valor real entre 0 i 10: ");
                    }

                    n = sc.nextDouble();
                    pd = n % 1;
                    if (pd > 0.5) {
                        m = "Soc un Alien de Pau";
                        s= "Pau";
                        n = Math.ceil(n);
                    } else if (pd < 0.5){
                        m = "Soc un Alien, et matare";
                        s = "assassí";
                    }
                    else{
                        m = "Soc un Alien, no m’has vist";
                        s = "sucubo";
                    }

                    System.out.println(n + " " + m);
                    tipus = s;
                    System.out.println("\n");
                    joel[0] = true;
                    break;

                case 2:
                    if (joel[0]){
                        if (mode==1){
                            System.out.print("Introdueix un valor real entre 0 i 1: ");
                        }

                        float ntransport = sc.nextFloat();
                        String transport = "";
                        if (ntransport <= 0.1) transport = "Navegant";
                        else if (ntransport > 0.1 && ntransport <= 0.2) transport = "Flotant";
                        else if (ntransport > 0.2 && ntransport <= 0.3) transport = "Propulsat";
                        else if (ntransport > 0.3 && ntransport <= 0.4) transport = "Patinant";
                        else if (ntransport > 0.4 && ntransport <= 0.5) transport = "Caminant";
                        else if (ntransport > 0.5 && ntransport <= 0.6) transport = "Coetejant";
                        else if (ntransport > 0.6 && ntransport <= 0.7) transport = "Planejant";
                        else if (ntransport > 0.7 && ntransport <= 0.8) transport = "Corrent";
                        else if (ntransport > 0.8 && ntransport <= 0.9) transport = "Saltant";
                        else if (ntransport > 0.9 && ntransport <= 1) transport = "Levitant";
                        System.out.println(transport);
                        vehicle = transport;
                        System.out.println("\n");
                        joel[0]=false;
                        joel[1] = true;
                        break;
                    } else{
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }


                case 3:
                    if (joel[1]){
                        if (mode==1){
                            System.out.print("Introdueix un número màxim: ");
                        }

                        double max = sc.nextDouble(), nfav;
//                      nfav = Math.round((max/2)*10.0)/10.0;
                        nfav = max / 2;

                        for (double i = 0.0; i <= nfav + 0.1; i += 0.1) {
                            System.out.printf("%.1f ", i);
                        }
                        System.out.printf("...He triat el " +  nfav + "!");
                        System.out.println("\n");
                        fav = nfav;
                        joel[1]=false;
                        joel[2] = true;
                        break;
                    }else{
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }


                case 4:
                    if (joel[2]){
                        if (mode==1){
                            System.out.println("Sabries llistar tots els números que amb decimal després de la coma igual a #,5 després \n" +
                                    "de la operació (a+b)/2, entre el valor float de a i b, on el valor de a creixerà fins b, b \n" +
                                    "decreixerà fins a ? ");
                        }

                        float a = sc.nextFloat();
                        float b = sc.nextFloat();
                        while (a<=b) {
                            float tempb = b;

                            while (a<=tempb){
                                float op = (a+tempb)/2;
                                if (op%1==0.5){
                                    System.out.print(op + "\t");
                                }
                                tempb-=1;
                            }
                            a+=1;
                            System.out.println("\n");
                        }

                        System.out.println("\n");
                        joel[2]=false;
                        joel[3] = true;
                        break;
                    }else{
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;

                    }


                case 5:
                    if (joel[3]){
                        if (mode==0){
                            joel[4] = true;
                            break;
                        }
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
                        joel[3]=false;
                        joel[4] = true;
                        break;
                    }else{
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;

                    }


                case 6:
                    if (mode==1 && joel[4]){
                        if (mode==1){
                            System.out.println("Posam un nom moloon");
                        }

                        sc.nextLine();
                        String aliennom = sc.nextLine();
                        sc.nextLine();
                        System.out.println("Gracies, m'agrada molt el nom de "+aliennom);
                        nom = aliennom;
                        joel[4]=false;
                        joel[5] = true;
                        break;
                    }else{
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;

                    }


                case 7:
                    if (joel[5]){
                        System.out.println("Em dic "+ nom +" i sóc un alien "+ tipus + ". Em solc transportar " +
                                vehicle +
                                ". El meu numero favorit es el "+ fav + ".");

                        if (jugat){
                            if (guanyat){
                                System.out.println("Jugar se'm dona bé però he de reconèixer que has guanyat de forma triunfal, ets molt bo!");
                            } else{
                                System.out.println("Jugar se'm dona bé, però la veritat es que ets dolentíssim, mai en la meva vida havia jugat contra algú tan dolent");
                            }
                        }
                        System.out.println("\n");
                        joel[5]=false;
                        break;
                    }else{
                        System.out.println("Has de seguir les opcions en ordre i sense repetir. Torna-ho a intentar!!");
                        break;
                    }
                case 8:
                    return false;

            }

            try {

                Thread.sleep(2 * 1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }

        return true;
    }

}

