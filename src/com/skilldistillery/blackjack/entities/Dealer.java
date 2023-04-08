package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Dealer {

	private Deck deck;
	private int numCardsInDeck;
	private int userSumOfCards;

	public Dealer() {
		deck = new Deck();
		numCardsInDeck = deck.checkDeckSize();
		userSumOfCards = 0;
	}

	public void run() {
		Scanner kb = new Scanner(System.in);

		boolean keepPlaying = true;

		while (keepPlaying) {

			System.out.println("Welcome to the Black Jack Table!!!");
			System.out.println("Would you like to play now? Type Yes or No");
			String userAnswer = kb.nextLine();

			if ("YESYesyesYy".contains(userAnswer)) {

				System.out.println("Let's the game begin!");
				firstRound();

				System.out.println("Please type 1 to hit or any other button to stand");
				String userInput = kb.nextLine();

				if (userInput.equals("1")) {
					boolean continuePlaying = true;
					while(continuePlaying) {
						nextRound();
						
						System.out.println("Please type 1 to hit or any other button to stand");
						String whileLoopInput = kb.nextLine();
						if (whileLoopInput.equals("1")) {
							nextRound();
						}
						else {
							System.out.println("Your total is " + userSumOfCards);
							continuePlaying = false;
						}
					}
				} else {
					System.out.println("Your total is " + userSumOfCards);
					keepPlaying = false;
				}

			} else if ("NONonoNnwefdf".contains(userAnswer)) {
				System.out.println("See you next time");
				keepPlaying = false;
				break;

			} else {
				System.out.println("That is not a valid input.");
			}

		}

	}

	private void firstRound() {
		deck.suffle();
		int firstRoundOfCards = 2;
		if (firstRoundOfCards <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < firstRoundOfCards; cardNumDealt++) {
				Card dealtCard = deck.dealCard();
				userSumOfCards += dealtCard.getValue();
				System.out.println("You now have " + dealtCard);
			}
			System.out.println("Your total is " + userSumOfCards);
		}
	}

	private void nextRound() {
		int secondRoundOfCards = 1;
		if (secondRoundOfCards <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < secondRoundOfCards; cardNumDealt++) {
				Card dealtCard = deck.dealCard();
				userSumOfCards += dealtCard.getValue();
				System.out.println("You now have " + dealtCard);
			}
			System.out.println("Your total is " + userSumOfCards);
		}

	}
}
