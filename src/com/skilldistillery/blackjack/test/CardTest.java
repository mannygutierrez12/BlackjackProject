package com.skilldistillery.blackjack.test;

import com.skilldistillery.blackjack.entities.Rank;
import com.skilldistillery.blackjack.entities.Suit;
public class CardTest {
    public static void main(String[] args) {
        // Test Suit enum
        System.out.println(Suit.HEARTS); // Output: Hearts

        // Test Rank enum
        System.out.println(Rank.ACE.getValue()); // Output: 11
    }
}
