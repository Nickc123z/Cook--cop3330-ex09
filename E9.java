/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Scanner;

public class E9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double sqFPG = 350;


        System.out.print("Enter length: ");
        double length = scan.nextDouble();
        System.out.print("Enter width: ");
        double width = scan.nextDouble();

        double Sq = length*width;
        int paint = (int)Math.ceil(Sq/sqFPG);

        System.out.println("You will need to purchase "+paint+" of paint to cover "+Sq+" square feet");
    }
}

