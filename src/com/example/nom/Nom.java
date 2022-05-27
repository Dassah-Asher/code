package com.example.nom;
import java.util.Scanner;


public class Nom {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name");

        String userName = myObj.nextLine();
        System.out.println("Your name is " + userName);
    }
}
