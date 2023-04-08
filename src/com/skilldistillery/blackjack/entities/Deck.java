package com.skilldistillery.blackjack.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	
	
	private List<Card> myCards = new ArrayList<Card>();
	
	public Deck() {
		
		Rank[] ranks = Rank.values();
	    Suit[] suits = Suit.values();
	    
	    
	    for (Suit suit : suits) {
	        for (Rank rank : ranks) {
	        	Card card = new Card(suit, rank);
	            myCards.add(card);
	        }
	    }
	}
	
	
	public int checkDeckSize() {
		return myCards.size();
	}
	
	  public void shuffle() {
		Collections.shuffle(myCards);
	}
	
	public Card dealCard() {
		Card dealCard = myCards.remove(0);
		return dealCard;
	}
	
	
	

}
