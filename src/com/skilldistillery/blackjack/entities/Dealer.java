package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dealer {

	private Deck deck;
	private UsersHand usersHand;
	private DealersHand dealersHand;
	private Card dealtCard;
	private int numCardsInDeck;
	private int userSumOfCards;
	private int dealerSumOfCards;

	public Dealer() {
		deck = new Deck();
		deck.shuffle();
		usersHand = new UsersHand();
		dealersHand = new DealersHand();
		numCardsInDeck = deck.checkDeckSize();
		userSumOfCards = 0;
		dealerSumOfCards = 0;
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
				userFirstRound();
				System.out.println();
				dealerFirstRound();

				System.out.println("Please type 1 to hit or any other button to stand");
				String userInput = kb.nextLine();

				if (userInput.equals("1")) {

					boolean continuePlaying = true;
					while (continuePlaying) {
						
						if(userSumOfCards > 21) {
							comparisonScore();
							break;
						}
						
						
						userNextRound();

						System.out.println("Please type 1 to hit or any other button to stand");
						String whileLoopInput = kb.nextLine();
						if (whileLoopInput.equals("1")) {
							userNextRound();
						} else {
							System.out.println("Your total is " + userSumOfCards);
							dealerNextRound();
							comparisonScore();
							continuePlaying = false;
							keepPlaying = false;
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

	private void userFirstRound() {

		int firstRoundFirstCard = 1;
		int firstRoundSecondCard = 1;

		Card firstDealtCard = deck.dealCard();

		Card secondDealtCard = deck.dealCard();

		if (firstRoundFirstCard <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < firstRoundFirstCard; cardNumDealt++) {

				userSumOfCards += firstDealtCard.getValue();
				usersHand.addCard(firstDealtCard);

			}

		}

		if (firstRoundSecondCard <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < firstRoundSecondCard; cardNumDealt++) {
				userSumOfCards += secondDealtCard.getValue();
				usersHand.addCard(secondDealtCard);

			}

			System.out.println("You now have " + firstDealtCard);
			System.out.println("You now have " + secondDealtCard);
			System.out.println("Your total is " + userSumOfCards);
			System.out.println("The deck size is " + deck.checkDeckSize());

		}

	}

	private void dealerFirstRound() {

		int firstRoundFirstCard = 1;
		int firstRoundSecondCard = 1;

		Card firstDealtCard = deck.dealCard();
		Card secondDealtCard = deck.dealCard();

		if (firstRoundFirstCard <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < firstRoundFirstCard; cardNumDealt++) {

				dealerSumOfCards += firstDealtCard.getValue();
				dealersHand.addCard(firstDealtCard);

			}

		}

		if (firstRoundSecondCard <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < firstRoundSecondCard; cardNumDealt++) {
				dealerSumOfCards += secondDealtCard.getValue();
				dealersHand.addCard(secondDealtCard);

			}

			System.out.println("The dealer has " + secondDealtCard);
			System.out.println("The deck size is " + deck.checkDeckSize());

		}
	}

	private void userNextRound() {
		int secondRoundOfCards = 1;
		Card nextDealtCard = deck.dealCard();
		if (secondRoundOfCards <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < secondRoundOfCards; cardNumDealt++) {
				userSumOfCards += nextDealtCard .getValue();
			}
			
			System.out.println("You now have " + nextDealtCard);
			System.out.println("Your total is " + userSumOfCards);
			
			
			
			

		}

	}

	private void dealerNextRound() {

		if (dealerSumOfCards < 17) {

			boolean lessThan17 = true;

			while (lessThan17) {
				
				int dealerRoundOfCards = 1;
				if (dealerRoundOfCards <= numCardsInDeck) {
					
					for (int cardNumDealt = 0; cardNumDealt < dealerRoundOfCards; cardNumDealt++) {
						Card dealtCard = deck.dealCard();
						dealerSumOfCards += dealtCard.getValue();
						dealersHand.addCard(dealtCard);
						System.out.println("The dealer's total score is " + dealerSumOfCards);
						System.out.println("The dealer's new card is " + dealtCard);

					}
					

				}
				
				if (dealerSumOfCards >= 17) {
					lessThan17 = false;
				}

			}

		} else {
			comparisonScore();

		}

	}

	private void comparisonScore() {

		if (dealerSumOfCards == 21 && userSumOfCards == 21) {
			System.out.println("It is a Push");

		}

		else if (userSumOfCards == 21) {
			System.out.println("That's a BlackJack");
			System.out.println("You are the Winner");
		}

		else if (dealerSumOfCards == 21) {
			System.out.println("The dealer has a BlackJack");
			System.out.println("The Dealer wins");
		}

		else if (userSumOfCards > 21) {
			System.out.println("Bust");
			System.out.println("The Dealer wins");
		}

		else if (dealerSumOfCards > 21) {
			System.out.println("Dealer Bust");
			System.out.println("You win");
		}

		else if (userSumOfCards == dealerSumOfCards) {
			System.out.println("It is a draw");
		}

		else if (userSumOfCards > dealerSumOfCards) {
			System.out.println("You win");
		}

		else {
			System.out.println("The Dealer wins");
		}

	}
}
