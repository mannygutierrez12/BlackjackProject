package com.skilldistillery.blackjack.test;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.Card;
import com.skilldistillery.blackjack.entities.Deck;

public class DealerTest {

	public static void main(String[] args) {

		DealerTest dealer = new DealerTest();
		dealer.run();
		
		
	}
	
	public void run() {
		Deck deck = new Deck();
		deck.suffle();
		int numCardsinDeck = deck.checkDeckSize();
		System.out.println("Current num cards " + deck.checkDeckSize());
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many cards do you want");
		int numCardsIWant = scanner.nextInt();
		scanner.nextLine();
		
		
		int sumOfCards = 0;
		if (numCardsIWant <= numCardsinDeck) {
			for(int cardNumDealt = 0; cardNumDealt < numCardsIWant; cardNumDealt++) {
				Card dealtCard = deck.dealCard();
				sumOfCards += dealtCard.getValue();
			
				System.out.println("You now have " + dealtCard + " " + deck.checkDeckSize());
			}
		}
		
		
		
		
		System.out.println(sumOfCards);
		
		
		
		
		
		
	}

}
