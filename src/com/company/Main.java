package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String author;
        String quote;


        System.out.println("What is the quote?");
        quote = scan.nextLine();

        System.out.println("Who said it?");
        author = scan.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");




    }
}
