package eecs1022.lab4application;

import java.util.Scanner;

public class Americanadian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many strings?");
        int howMany = input.nextInt();
        input.nextLine();

        System.out.println("Enter an American word to translate to Canadian: ");
        String word = input.nextLine();
        int wordLength = word.length();

        if(wordLength > 4)
        {
            String newString = word.replaceAll("or", "our");
            System.out.println(newString);

            boolean userWantsToExit = false;
            String[] strings = new String[howMany];

            for(int i = 0; i < howMany && !userWantsToExit ; i ++) {
                String s = input.nextLine();
                userWantsToExit = s.equals("exit");
                if( !userWantsToExit ) {
                    System.out.println("Exiting!");
                }
            }
        }
        else
        {
            System.out.println("Word is to short. Please try again.");
        }
    }
}


// remove duplicates in consecutive and return new array aabbc, return c. Order matters.
// Equivalent to : Longest run question.
// Get max  of 4 -- > using loops.

// Get encoding??
