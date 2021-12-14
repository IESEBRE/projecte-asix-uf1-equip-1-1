package com.iesebre;

import com.iesebre.Alien;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        boolean finish = false;
        do {
            Scanner scanner = new Scanner(System.in);
            // Escollir amb qui volem conversar 
            System.out.println("Amb qui vols conversar?");
            System.out.println("  - Persona");
            System.out.println("  - Animal");
            System.out.println("  - Extraterrestre");
            System.out.print("Opció: ");
            switch (scanner.nextInt()) {
                case 1:
//                    Person person = new Person();
//                    finish = person.talking();
                    break;
                case 2:
//                    Animal animal = new Animal();
//                    finish = animal.talking();
                    break;
                case 3:

                    Alien extraterrestre = new Alien();
                    finish = extraterrestre.talking();
                    break;
            }
        } while (!finish);
    }
} 