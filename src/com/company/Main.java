package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
System.out.println(standardform(GetInput("Enter a number: ")));
    }

    public static String standardform(int integer) {
        int n = 0;
        while (integer >= 10) {
            integer = integer / 10;
            n++;
        }
        while (integer < 1) {
            integer = integer * 10;
            n--;
        }
        return integer + "x10^" + n;
    }
    public static int GetInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}
