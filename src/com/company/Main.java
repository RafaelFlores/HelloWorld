package com.company;

public class Main {

    public static void main(String[] args) {

        //Assure that Command Line arguments have the appropriate size
        if (args.length != 1){
            System.out.println("usage: java HelloWorld \"Name\"");
            System.exit(0);
        }
        //Read Name From Arguments
        String name = args[0];

        //Display Hello, + Name!
        System.out.println("Hello, " + name + "!");


    }
}
