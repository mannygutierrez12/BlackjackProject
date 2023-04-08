package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class Dealer {

	private Deck deck;
	private UsersHand usersHand;
	private int numCardsInDeck;
	private int userSumOfCards;

	public Dealer() {
		deck = new Deck();
		usersHand = new UsersHand();
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
		int firstRoundFirstCard = 1;
		int firstRoundSecondCard = 1;
		System.out.println("The deck total cards**************** " + numCardsInDeck);
		Card firstDealtCard = deck.dealCard();
		System.out.println("The deck total cards**************** " + numCardsInDeck);
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
			
			System.out.println("The user value " + usersHand.getHandValue());
			System.out.println("**********************");
			usersHand.hand();
			System.out.println("**********************");
			System.out.println("The deck total cards " + numCardsInDeck);
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
