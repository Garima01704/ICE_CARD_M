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
 *Student number:- 991807497
 */

public class CardTrick {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
System.out.print("Enter card value (1 to 13): ");
int userValue = input.nextInt();

System.out.print("Enter card suit (Hearts, Diamonds, Spades, Clubs): ");
String userSuit = input.next();

boolean found = false;
for (Card card : magicHand) {
    if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
        found = true;
        break;
    }
}

if (found) {
    System.out.println("Card found! You win!");
} else {
    System.out.println("Sorry, your card was not in the magic hand.");
}

    }
}


