package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class addition {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(99)+1;
        int b = r.nextInt(99)+1;
        int suma = a+b;
        System.out.println(a+" + "+b+" = ");
        int wynik = scanner.nextInt();
        System.out.println(a+" + "+b+" = "+wynik);
        if (wynik == suma) {
            System.out.println("Zgadłaś, brawo!");
        } else {
            System.out.println("Gapa z Ciebie! Prawidłowy wynik to"+" "+suma);
        }



    }
}
