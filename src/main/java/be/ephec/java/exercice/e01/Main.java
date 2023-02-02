package be.ephec.java.exercice.e01;
import be.ephec.java.exercice.e01.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Quel est votre prénom ? ");
        p.firstName = in.nextLine();

        System.out.print ("Quel est votre nom ? ");
        p.lastName = in.nextLine();

        System.out.print("Quel age avez-vous ?");
        p.age = in.nextInt();

        p.display();



    }
}