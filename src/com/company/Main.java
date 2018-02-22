package com.company;

import java.nio.CharBuffer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfFirst = 0, sumOfSecond = 0;
        int[] arrOne = new int[6];
        try {
            for (int i = 0; i < arrOne.length; i++) {
                arrOne[i] = Integer.parseInt(scanner.nextLine());

            }
            for (int i = 0; i < 3; i++) {
                sumOfFirst += arrOne[i];
            }
            for (int i = 3; i < 6; i++) {
                sumOfSecond += arrOne[i];
            }
            if (sumOfFirst == sumOfSecond) {
                System.out.println("Congratulations, you won!");
            } else {
                System.out.println("Sorry, you will win next time");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println();
        System.out.println("qwerty");

    }
}
