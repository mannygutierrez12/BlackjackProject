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
		for (Card card : myCards) {
			System.out.println(card);
		}
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
