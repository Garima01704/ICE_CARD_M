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
        Card[] magicHand = new Card[7];
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            c.setSuit(suits[rand.nextInt(4)]); 
            magicHand[i] = c;
        }

        
        Card luckyCard = new Card();
        luckyCard.setValue(7); 
        luckyCard.setSuit("Hearts"); 

        
        System.out.println("Magic Hand:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }

        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() &&
                card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        
        System.out.println("\nLucky Card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        if (found) {
            System.out.println("Congratulations! The lucky card is in the magic hand. You win!");
        } else {
            System.out.println("Sorry! The lucky card was not found in the magic hand.");
        }
    }
}


