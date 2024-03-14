/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  Saiyon Jeyakumar
 * Class:   ICS3U
 * Program: Assignment X Question Y
 * Input: - Four positive integers indicating the depth of the fish
 * Processing: - Determine whether there is a fish or not
 *             - If there is a fish, determine how the depth is changing
 * Output - Print responses based on the four depth reading of the fish
 *
 */
//Import Statements Listed Alphabetically
import java.io.*;           //used for any type of input or output
import java.util.*;         //useful utilities like Scanner
import hsa.Console;
import hsa.*;

/**
 *
 * @author Admin
 */
public class FunFridayChallenge2 {

    /**
     * * MAIN METHOD
     *
     **
     * @param args
     */
    public static void main(String[] args) {

        //FIRST WRITE YOUR PSEUDOCODE USING COMMENTS, THEN FILL IN WITH CODE
        System.out.println("Starting...");
        Console c = new Console();
        //Ask user for input
        c.println("Enter first number here: ");
        int num = c.readInt();
        c.println("Enter second number here: ");
        int num2 = c.readInt();
        c.println("Enter third number here: ");
        int num3 = c.readInt();
        c.println("Enter fourth number here: ");
        int num4 = c.readInt();
        //When the numbers form an increasing sequence
        if (num < num2 && num2 < num3 && num3 < num4) {
            c.println("Fish Diving");
        }
        //When the numbers form a decreasing sequence
        else if (num4 < num3 && num3 < num2 && num2 < num) {
            c.println("Fish Rising");
        }
        //When the numbers are the same
        else if (num == num2 && num2 == num3 && num3 == num4) {
            c.println("Constant Depth");
        }
        //When the numbers are in random order
        else
            c.println("No Fish");
    }
}
