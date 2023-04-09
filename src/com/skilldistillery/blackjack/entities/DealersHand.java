package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class DealersHand extends Hand {

	private List<Card> myCards = new ArrayList<>();
	
	public DealersHand() {
		super();
	}

	@Override
	public void hand() {
	    String dealerCards = "";
	    for (Card card : myCards) {
	        dealerCards += card + ", ";
	    }
	    System.out.println("The dealer has " + dealerCards);
	}
	@Override
	public void addCard(Card card) {
		myCards.add(card);
	}

	@Override
	public void clear() {
		myCards.clear();
	}

	@Override
	public int getHandValue() {
		int dealerSumOfCards = 0;
		for (Card card : myCards) {
			dealerSumOfCards += card.getValue();
		}
		return dealerSumOfCards;
	}
}
