import java.util.*;

public class Person {
    void Person(){}
    boolean talking () {
        System.out.println("Hola , que tal!");
    return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pregunta=0;
        while (pregunta!=8) {
            System.out.println("Qüestionari:");
            System.out.println("1. Quin tipus de persona ets?");
            System.out.println("2. Quin esport t'agrada?");
            System.out.println("3. Quin és el teu número favorit entre 0 i ...?");
            System.out.println("4. Sabries llista tots els nombres parells resultants de la multiplicació entre valor enter a i b, on el valor de a creixerà fins b?");
            System.out.println("5. Juguem a pedra paper i tisora?");
            System.out.println("6. Posa-li un nom!");
            System.out.println("7. Pots recordar-me la nostra conversa?");
            System.out.println("8. Sortir");
            pregunta = sc.nextInt();

            //variable numero exercici 1
            int numero;
            //variable esport exercici 2
            int num;
            //variables num exercici 3
            int num1 = 0;
            int num2;
            //variable nom exercici 6
            String nom = "";


            switch (pregunta) {
                case 1:
                    System.out.println("Escriu un número (0..100):");
                    Scanner sc1 = new Scanner(System.in);
                    numero = sc1.nextInt();
                    if (numero % 2 == 0 && numero % 3 == 0) {
                        System.out.println("No binari");
                    } else if (numero % 3 == 0) {
                        System.out.println("Dona");
                    } else if (numero % 2 == 0) {
                        System.out.println("Home");
                        break;

                    }
                case 2:
                    System.out.println("Escriu un número (1..10):");
                    Scanner sc2 = new Scanner(System.in);
                    num = sc2.nextInt();
                    if (num == 1)
                        System.out.println("Fútbol");
                    else if (num == 2)
                        System.out.println("Bàsquet");
                    else if (num == 3)
                        System.out.println("Tennis");
                    else if (num == 4)
                        System.out.println("Handbol");
                    else if (num == 5)
                        System.out.println("Ciclisme");
                    else if (num == 6)
                        System.out.println("Atletisme");
                    else if (num == 7)
                        System.out.println("Golf");
                    else if (num == 8)
                        System.out.println("Judo");
                    else if (num == 9)
                        System.out.println("Natació");
                    else if (num == 10)
                        System.out.println("Rugbi");
                    break;
                case 3:
                    System.out.println("Dis-li un número màxim");
                    Scanner sc3 = new Scanner(System.in);
                    num2 = sc3.nextInt();
                    num2 = (num2 - (num2 - num1) / 2);
                    while (num2 > num1) {
                        System.out.print("" + num1 + " ");
                        num1++;
                    }
                    System.out.println("...He triat el " + num2 + "!");
                    break;
                case 4:
                    System.out.println("Quins dos nombres hem de multiplicar?");
                    Scanner sc4 = new Scanner(System.in);
                    int a;
                    int b;
                    a = sc4.nextInt();
                    b = sc4.nextInt();
                    for (int i = a; i <= b; i++) {
                        System.out.println();
                        for (int j = b; j >= 1; j--) {
                            System.out.print(i * j + "  ");
                        }
                    }
                    System.out.println();
                    break;
                case 5:


                    break;

                case 6:
                    System.out.println("Escull un nom:");
                    Scanner sc6 = new Scanner(System.in);
                    nom = sc6.nextLine();
                    System.out.println("Gràcies, m'agrada molt el nom de " + nom);
                    break;

                case 7:

                    System.out.println("Hem dic" + nom + "i he nascut. El meu esport favorit és"+". El meu número favorit és el"+
                    "Juga se'm dona bé però he de reconèixer que has guanyat de forma triunfal ets molt bo!");

                case 8:
                    System.out.println("Adéu!");
                    break;

            }
        }
    }
}
