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
 * Program: Luddite Text Translator
 * Input: - Ask user for messages 
 * Processing: - Translate the message in a way the user can understand it
 * Output: - Print the translated messages
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
public class Unittestprogram {

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
        //Inittializing vairbales
        String word = " ";
        //Ask user for input
        c.println("Enter messages here: ");
        //Get input unitl they want to quit
        while (!word.equals("quit")) {
            word = c.readLine();
            //When the user enters "CU"
            if (word.equals("CU")) {
                c.println("see you");
            }
            //When the user enters ":-)"
            else if (word.equals(":-)")) {
                c.println("I'm happy");
            }
            //When the user enters ":-("
            else if (word.equals(":-(")) {
                c.println("I'm unhappy");
            }
            //When the user enters ";-)"
            else if (word.equals(";-)")) {
                c.println("wink");
            }
            //When the user enters ":-P"
            else if (word.equals(":-P")) {
                c.println("stick out my tongue");
            }
            //When the user enters "(~.~)"
            else if (word.equals("(~.~)")) {
                c.println("sleepy");
            }
            //When the user enters "TA"
            else if (word.equals("TA")) {
                c.println("totally awesome");
            }
            //When the user enters "CCC"
            else if (word.equals("CCC")) {
                c.println("Canadian Computing Competition");
            }
            //When the user enters "CUZ"
            else if (word.equals("CUZ")) {
                c.println("because");
            }
            //When the user enters "TY"
            else if (word.equals("TY")) {
                c.println("thank-you");
            }
            //When the user enters "YW"
            else if (word.equals("YW")) {
                c.println("you're welcome");
            }
            //When the user enters "TTLY"
            else if (word.equals("TTLY")) {
                c.println("talk to you later");
            }
            //When the user enters "quit"
            else if (word.equals("quit")) {
                Random farewell = new Random();
                //Initializing variables
                int times = 0; 
                int num = 0;
                //Make 2 outputs when user quits
                for (times=0;times<2;times++) {
                num = farewell.nextInt(9);
                //When num is equal to 0
                if (num == 0) {
                    c.println("cya");
                }
                //When num is equal to 1
                else if (num == 1) {
                    c.println("l8r sk8r");
                }
                //When num is equal to 2
                else if (num == 2) {
                    c.println("kthxbye");
                }
                //When num is equal to 3
                else if (num == 3) {
                    c.println("Hasta la vista");
                }
                //When num is equal to 4
                else if (num == 4) {
                    c.println("Be easy!");
                }
                //When num is equal to 5
                else if (num == 5) {
                    c.println("deuce out the roof");
                }
                //When num is equal to 6
                else if (num == 6) {
                    c.println("kthxbai");
                }
                //When num is equal to 7
                else if (num == 7) {
                    c.println("syonara");
                }
                //When num is equal to 8
                else {
                    c.println("l8r alligator");
                }
            }
            }
            //When the user enters any other message
            else{
                c.println(word);
            }         
    }
    }
}
