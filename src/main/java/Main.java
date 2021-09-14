/*
* UCF COP 3330 Fall 2021 Assignment 6 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Calendar;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("What is your age?");
        Scanner calculator = new Scanner(System.in);
        String input = calculator.nextLine();
        int x = Integer.parseInt(input);
        System.out.println("At what age would you like to retire?");
        String future = calculator.nextLine();
        int y = Integer.parseInt(future);

        int z=y-x;

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("You have %d years left until you can retire.%n", z);
        System.out.printf("It's %d, so you can retire in %d", year, year+z);
    }
}