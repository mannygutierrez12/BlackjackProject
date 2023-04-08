package com.skilldistillery.blackjack.entities;

import java.util.List;

public abstract class Hand {
	
	private List<Card> cards;
	
	public Hand() {};
	
	public abstract void hand();
	
	public abstract void addCard(Card card);
	
	public abstract void clear();
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return "Hand [cards=" + cards + "]";
	}

	
	
	
	

}


