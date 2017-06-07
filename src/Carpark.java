/**
 * COMP 2100/2500/6442 Exam 2016 
 * Question 2
 * Sample Code
 *
 */

import java.util.Scanner;

class Carpark {

    public static void main(String[] args){

        int smallSpots = 0, compactSpots = 0, largeSpots = 0;
        
        /* Parse Commandline Arguments to accept parking spot availability details */
        if (args.length == 3) {
            try {
                smallSpots = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[0] + " must be an integer.");
                System.exit(1);
            }

            try {
                compactSpots = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[1] + " must be an integer.");
                System.exit(1);
            }

            try {
                largeSpots = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                System.err.println("Argument " + args[2] + " must be an integer.");
                System.exit(1);
            }
        }else{
            System.out.println("Usage: java Carpark <smallSpots> <compactSpots> <largeSpots>");
            System.exit(1);
        }
        
        /* Acccept input until the user enters "Bye" */
        String exitKeyword = new String("Bye");
        String vehicleName;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("> What vehicle would you like to park? ");
            vehicleName = input.nextLine();
            if (vehicleName.equals("Car")){
                if(compactSpots != 0){
                    compactSpots--;
                    System.out.println("> Welcome, please continue to park in the compactSpot.");
                }else if(largeSpots != 0){
                    largeSpots--;
                    System.out.println("> Welcome, please continue to park in the largeSpot.");
                }else{
                    System.out.println("> Sorry,there are no spots available for your vehicle.");
                }
            }else if (vehicleName.equals("MotorCycle")){
                if (smallSpots != 0){
                    smallSpots--;
                    System.out.println("> Welcome, please continue to park in the smallSpot.");
                } else {
                    System.out.println("> Sorry,there are no spots available for your vehicle.");
                }
            }else if (vehicleName.equals("Minivan")){
                if(largeSpots != 0){
                    largeSpots--;
                    System.out.println("> Welcome, please continue to park in the largeSpot.");
                }else{
                    System.out.println("> Sorry,there are no spots available for your vehicle.");
                }
            }
        }while(!vehicleName.equals(exitKeyword));

    }
}
