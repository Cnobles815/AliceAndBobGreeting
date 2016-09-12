package nobles.christopher.AliceAndBobGreeting;

import java.util.Scanner;

/**
 * Created by christophernobles on 9/10/16.
 */
public class Display {


    //Prompt the user for input
    //Take user input
    //Display answer
    public String getUserInput() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name (it better be Alice or Bob fool).");
        return userInput.next();

    }

    public void showResult (String output) {
        System.out.println(" " + output);

    }



}

