package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.List;

public class UsersHand extends Hand {

	private List<Card> myCards = new ArrayList<>();

	public UsersHand() {
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

		int userSumOfCards = 0;
		for (Card card : myCards) {
			userSumOfCards += card.getValue();
		}
		return userSumOfCards;
	}

}
