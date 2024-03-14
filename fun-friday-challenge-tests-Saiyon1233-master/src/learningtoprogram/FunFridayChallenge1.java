/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
 * Author: Saiyon Jeyakumar Class: ICS3U
 *
 * Program: Assignment X Question Y 
 * Input: - Number of phone minutes
 *        - Number of texts made
 * Processing: - Find total bill of Plan A
 *             - Find total bill of Plan B
 * Output: - Total bill of Plan A
 *         - Total bill of Plan B
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
public class FunFridayChallenge1 {

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
        //Initialize variables
        double monthlyaccessfeeA = 6.99;
        double monthlyaccessfeeB = 6.99;
        double monthlyplanfeeA = 24.99;
        double monthlyplanfeeB = 31.99;
        //Ask user for input
        c.println("Enter Number of Phone Minutes Here");
        double phoneminutes = c.readDouble();
        c.println("Enter Number of Texts Made Here");
        double textsmade = c.readDouble();
        //Find total bill for Plan A
        double remainingminutesA = phoneminutes - 30;
        if (phoneminutes < 30) {
            remainingminutesA = 0;
        }
        double phoneminutebillA = remainingminutesA * 0.25;
        double remainingtextsmadeA = textsmade - 20;
        if (textsmade < 20) {
            remainingtextsmadeA = 0;
        }
        double textmadebillA = remainingtextsmadeA * 0.15;
        double totalbillA = monthlyaccessfeeA + monthlyplanfeeA + phoneminutebillA + textmadebillA;
        //Find total bill for Plan B
        double remainingminutesB = phoneminutes - 40;
         if (phoneminutes < 40) {
            remainingminutesB = 0;
        }
        double phoneminutebillB = remainingminutesB * 0.20;
        double remainingtextsmadeB = textsmade - 20;
        if (textsmade < 20) {
            remainingtextsmadeA = 0;
        }
        double textmadebillB = remainingtextsmadeA * 0.10;
        double totalbillB = monthlyaccessfeeB + monthlyplanfeeB + phoneminutebillB + textmadebillB;
        //Print total bill for both Plans
        c.println("The total bill for Plan A is: $" + totalbillA);
        c.println("The total bill for Plan B is: $" + totalbillB);
    }
}
