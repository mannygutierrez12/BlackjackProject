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
						nextRound();

						System.out.println("Please type 1 to hit or any other button to stand");
						String whileLoopInput = kb.nextLine();
						if (whileLoopInput.equals("1")) {
							nextRound();
						} else {
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
			System.out.println("The dealer total is " + dealerSumOfCards);
			System.out.println("The deck size is " + deck.checkDeckSize());

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

//class Deck {
//	
//	
//	
//	private List<Card> myCards = new ArrayList<Card>();
//	
//	public Deck() {
//		
//		Rank[] ranks = Rank.values();
//	    Suit[] suits = Suit.values();
//	    
//	    
//	    for (Suit suit : suits) {
//	        for (Rank rank : ranks) {
//	        	Card card = new Card(suit, rank);
//	            myCards.add(card);
//	        }
//	    }
//	}
//	
//	
//	public int checkDeckSize() {
//		return myCards.size();
//	}
//	
//	  public void shuffle() {
//		Collections.shuffle(myCards);
//	}
//	
//	public Card dealCard() {
//		Card dealCard = myCards.remove(0);
//		return dealCard;
//	}
//	
//	
//	
//
//}