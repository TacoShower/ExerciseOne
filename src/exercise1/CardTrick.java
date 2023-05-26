package exercise1;

import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Constantinos Soutos
 * @author Constantinos Soutos May 26, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setValue((int)(Math.random() * 13) + 1);
            hand[i].setSuit(Card.SUITS[(int)(Math.random() * 3) + 1]);
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int value = input.nextInt();
        System.out.print("Enter card suit (1=H 2=D 3=S 4=C: ");
        int suit = input.nextInt();
        
        for (Card c : hand) {
            if (c.getValue() == value && c.getSuit().equals(Card.SUITS[suit-1])) printInfo();
        }
        
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Constantinos Soutos May 26, 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Constantinos, but you can call me Costa");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- A career in software development");
        System.out.println("-- Graduate with an overall average above 90%");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Video games");
        System.out.println("-- Youtube");
        System.out.println("-- Coding");

        System.out.println();
        
    
    }

}
