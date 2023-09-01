package org.mardssss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check if your age is within the limits to get the job");
        checkAge();
    }
    public static void checkAge(){
        System.out.println("What´s your age?");
        Scanner number = new Scanner(System.in);
        int minAge= 18;
        int maxAge=65;
        int age = number.nextInt();
        if (age < minAge || age > maxAge) {
            System.out.println("Sorry! but you aren`t in the range, you need minimum 18 and maximum 65 to work.");
        }
        else  {
            System.out.println("Congratulations you are hired!");
        }
        checkAge();
    }
}