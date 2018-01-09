package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     /*   You and your partner are going to create a simple application that tells the user to enter their password!
  Create a brand new application in IntelliJ. Ensure that it is a command line application when you are setting it up.
  Store the correct password in a String field called 'password'. Then prompt the user, using the Scanner class,
  asking them to enter a password. Then compare what the user entered against was the stored password is.
 If they equal, let them know in a System out message that they have "Gained access".
 If the password is incorrect, let them know that.  */


     // String field called password - set to an intitial value
        String storedPassword = "Doggy123";

        // prompt user with scanner to enter password
        System.out.println("Please enter your password.");

        // collect user input into variable
        // create a scanner object with method to request input
        Scanner getPassword = new Scanner(System.in);
        // create a String object and set it to what is enterd by user
        // method nextLine waits on screen for a user to enter something
        String inputPassword = getPassword.nextLine();

        //  compare input password to intial value
        // if they match - message to user Gained Access
        if(inputPassword.equals(storedPassword)) {
            System.out.println("Gained Access");
        }
        else {

            // Else - message to user that password is incorrect
            System.out.println("You entered an invalid password");
        }
    }

}
