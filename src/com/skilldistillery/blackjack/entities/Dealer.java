package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dealer {

	private Deck deck;
	private UsersHand usersHand;
	private DealersHand dealersHand;
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
			System.out.println(" ________________________________________________");
			System.out.println("|       Welcome to the Black Jack Table!!!       |");
			System.out.println("|             Let's the game begin!              |");
			System.out.println("|________________________________________________|");
			System.out.println();

			userFirstRound();
			System.out.println();
			dealerFirstRound();

			if (userSumOfCards == 21) {
				comparisonScore();

			} else {
				boolean continuePlaying = true;

				while (continuePlaying) {
					System.out.println("___________________________________________________");
					System.out.println();
					System.out.println("Please type 1 to hit or any other button to stand");
					String userInput = kb.nextLine();

					if (userInput.equals("1")) {
						userNextRound();

						if (userSumOfCards > 21) {
							comparisonScore();
							continuePlaying = false;
						} else if (userSumOfCards == 21) {

							comparisonScore();
							continuePlaying = false;
						}
					} else {
						System.out.println("Your total is " + userSumOfCards);
						dealerNextRound();
						continuePlaying = false;
					}
				}
			}

			boolean playAgain = true;
			while (playAgain) {
				System.out.println(" ___________________________________________________");
				System.out.println("|   Would you like to play again? Type Yes or No    |");
				System.out.println("|___________________________________________________|");
				System.out.println();
				System.out.println();
				String userInput = kb.nextLine();

				if ("YESYesyesYy".contains(userInput)) {
					deck = new Deck();
					deck.shuffle();
					dealersHand.clear();
					usersHand.clear();
					userSumOfCards = 0;
					dealerSumOfCards = 0;
					break;

				}

				else if ("NONonoNnwefdf".contains(userInput)) {
					keepPlaying = false;
					ConsoleConfig app = new ConsoleConfig();
					app.mainMenu();
					break;

				} else {
					System.out.println("That is not a valid input.");
					continue;
				}

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

			System.out.print("You now have " + firstDealtCard);
			System.out.println(" and " + secondDealtCard);
			System.out.println("Your total is " + userSumOfCards);

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

		}
	}

	private void userNextRound() {
		int secondRoundOfCards = 1;
		Card nextDealtCard = deck.dealCard();
		if (secondRoundOfCards <= numCardsInDeck) {
			for (int cardNumDealt = 0; cardNumDealt < secondRoundOfCards; cardNumDealt++) {
				userSumOfCards += nextDealtCard.getValue();
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
						System.out.println("The dealer's new card is " + dealtCard);

					}

				}

				if (dealerSumOfCards >= 17) {
					comparisonScore();
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
			dealersHand.hand();
			System.out.println("The dealer total score is " + dealersHand.getHandValue());
		}

		else if (userSumOfCards > 21) {
			System.out.println("Bust");
			System.out.println("The Dealer wins");
			dealersHand.hand();
			System.out.println("The dealer total score is " + dealersHand.getHandValue());
		}

		else if (dealerSumOfCards > 21) {
			System.out.println("Dealer Bust");
			System.out.println("You win");
			dealersHand.hand();
			System.out.println("The dealer total score is " + dealersHand.getHandValue());
		}

		else if (userSumOfCards == dealerSumOfCards) {
			System.out.println("It is a draw");
			dealersHand.hand();
			System.out.println("The dealer total score is " + dealersHand.getHandValue());
		}

		else if (userSumOfCards > dealerSumOfCards) {
			System.out.println("You win");
			dealersHand.hand();
			System.out.println("The dealer total score is " + dealersHand.getHandValue());
		}

		else {
			System.out.println("The Dealer wins");
			dealersHand.hand();
			System.out.println("The dealer total score is " + dealersHand.getHandValue());
		}

	}
}
