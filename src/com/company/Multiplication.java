package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(9)+1;
        int b = r.nextInt(9)+1;
        int suma = a*b;
        System.out.println(a+" x "+b+" = ");
        int wynik = scanner.nextInt();
        System.out.println(a+" x "+b+" = "+wynik);
        if (wynik == suma) {
            System.out.println("Zgadłaś, brawo!");
        } else {
            System.out.println("Gapa z Ciebie! Prawidłowy wynik to"+" "+suma);
        }



    }
}
