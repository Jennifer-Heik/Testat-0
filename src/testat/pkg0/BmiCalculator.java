/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testat.pkg0;

import java.util.Scanner;



/**
 *
 * @author Jen
 */
public class BmiCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weight;
        double size;
        double bmi;
        String userInputForWeight = "?";
        String userInputForSize = "?";

        System.out.println("Hello World! This is the BMI calculator of Jen");
        

        //if there are arguments, show them on the screen
        if (args.length > 0) {
            userInputForWeight = args[0];
            System.out.println("First argument is: " + userInputForWeight + "kg");
        }
        if (args.length > 1) {
            userInputForSize = args[1];
            System.out.println("Second argument is: " + userInputForSize + "m");
        }

        // we try to get reasonable weight
        System.out.println("First the weight: ");
        weight = getInput(userInputForWeight);
        System.out.println(weight);

        // we try to get size
        System.out.println("Now the size: ");
        size = getInput(userInputForSize);
        System.out.println(size);

     

        // now input data is valid
        bmi = weight / (size * size);

        // present result to user
        System.out.println("Your BMI value is: " + bmi);
    } //end of main

    public static double getInput(String inputData) {
        double theResult = 0.0;
        Scanner keyboard = new Scanner(System.in); //new scanner scanning system input

        while (theResult <= 0.0) {
            try {
                theResult = Double.parseDouble(inputData);

            } catch (NumberFormatException anyname) {
                theResult = 0.0;
            }
            if (theResult <= 0) {//invalid input
                System.out.println("Sorry! Invalid weight input! Pleae reenter:");
                inputData = keyboard.nextLine();
            }
        } //end of loop
        // now theResult is okay, bigger than 0
        return theResult;
}
    
}
