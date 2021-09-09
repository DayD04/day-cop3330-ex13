package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is the principal amount? " );
        int principal = input.nextInt();
        System.out.print( "What is the rate? " );
        double percentInterest = input.nextDouble();
        double interest = percentInterest / 100.0;
        System.out.print( "What is the number of years? " );
        int years = input.nextInt();
        System.out.print( "What is the number of times interest is compounded per year? " );
        int compound = input.nextInt();

        double part1 = 1 + (interest / compound);
        double part2 = compound * years;
        double solution = Math.pow(part1, part2);
        solution = solution * principal;
        solution = Math.round(solution * 100.0) / 100.0;
        System.out.print("$" + principal + " invested at " + percentInterest + "% for " + years);
        System.out.println(" years compounded " + compound + " times per year is $" + solution + ".");
    }
}
