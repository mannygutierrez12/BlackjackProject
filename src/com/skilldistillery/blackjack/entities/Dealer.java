package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Dealer {

	public Dealer() {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		Deck deck = new Deck();
		deck.suffle();
		int numCardsinDeck = deck.checkDeckSize();
		// System.out.println("Current num cards " + deck.checkDeckSize());

		boolean keepPlaying = true;

		while (keepPlaying) {

			System.out.println("Welcome to the Black Jack Table!!!");
			System.out.println("Would you like to play now? Type Yes or No");
			String userAnswer = kb.nextLine();

			if ("YESYesyesYy".contains(userAnswer)) {
				System.out.println("Welcome to the table. Let's the game begin!");

				int firstRoundOfCards = 2;
				int userSumOfCards = 0;
				if (firstRoundOfCards <= numCardsinDeck) {
					for (int cardNumDealt = 0; cardNumDealt < firstRoundOfCards; cardNumDealt++) {
						Card dealtCard = deck.dealCard();
						userSumOfCards += dealtCard.getValue();

						System.out.println("You now have " + dealtCard);
						// System.out.println(deck.checkDeckSize());
					}

				}
				System.out.println("Your total is " + userSumOfCards);
				System.out.println("Type 1 to hit or any other button to stand");
				String userInput = kb.nextLine();

				if (userInput.equals("1")) {
					int secondRoundOfCards = 1;
					for (int cardNumDealt = 0; cardNumDealt < secondRoundOfCards; cardNumDealt++) {
						Card dealtCard = deck.dealCard();
						userSumOfCards += dealtCard.getValue();

						System.out.println("You now have " + dealtCard);
					}
					System.out.println("Your total is " + userSumOfCards);
				}

				
				
				else {
					System.out.println("Your total is " + userSumOfCards);
				}
				
			}

			else if ("NONonoNnwefdf".contains(userAnswer)) {
				System.out.println("See you next time");
				keepPlaying = false;
				break;

			} else {
				System.out.println("That is not a valid input.");
			}

		}

	}
}
