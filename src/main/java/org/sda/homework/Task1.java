package org.sda.homework;

import java.util.Scanner;

/**
 * Odwróć liczbę za pomocą pętli while.
 * Program poprosi użytkownika o wprowadzenie numeru, a następnie odwróci liczbę za
 * pomocą pętli while.
 */
public class Task1 {
    public static void main(String[] args)
    {
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        while( num != 0 )
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num/10;
        }
        System.out.println("Reverse of input number is: " + reversenum);
    }

}
