/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * CardTrick class models a hand of cards.
 * 
 * Garima Verma
 * 991807497
 */
public class CardTrick {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] hand = new int[7];
        Random random = new Random();

        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            hand[i] = random.nextInt(13) + 1; // Card values from 1 to 13
            System.out.println(suits[random.nextInt(4)] + " " + hand[i]);
        }

        // User input for card selection
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card value (1-13): ");
        int userCardValue = scanner.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int userCardSuit = scanner.nextInt();

        // Check if the user's card is in the hand
        boolean found = false;
        for (int card : hand) {
            if (card == userCardValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        scanner.close();
    }
}


