/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtoprogram;

/**
 * Author: Saiyon Jeyakumar
 * Class: ICS3U
 *
 * Input: - Ask user for a word
 * Processing: - Determine whether if it could be on the sign
 * Output: - Print either yes or no 
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
public class FunFridayChallenge3 {

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
        c.println("Enter Word Here: ");
        String word = c.readLine().toUpperCase();
        //Initializing variables
        int i = 0;
        int j = 0;
        //Determing whether the word can be used on the sign
        for (i = 0;i <= 4; i++) {
            //When a letter from the word can be used on the sign
            if (word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'S' || word.charAt(i) == 'H' || word.charAt(i) == 'Z' || word.charAt(i) == 'X' || word.charAt(i) == 'N') {
                j++;
            }
            //When a letter from the word can not be used on the sign
            else {
                j--;
            }
        }
        //When the word can be used on the sign
        if (j == 5) {
            c.println("YES");
        }
        //When the word can not be used on the sign
        else {
            c.println("NO");
        }
}
}