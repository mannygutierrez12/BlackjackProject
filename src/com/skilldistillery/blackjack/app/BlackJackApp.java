package com.skilldistillery.blackjack.app;

import java.util.Scanner;

import com.skilldistillery.blackjack.entities.ConsoleConfig;
import com.skilldistillery.blackjack.entities.Dealer;

public class BlackJackApp {

	public static void main(String[] args) {
		ConsoleConfig app = new ConsoleConfig();
		Scanner kb = new Scanner(System.in);

		boolean turnOn = true;
		while (turnOn) {
			System.out.println(" ___________________________________________________________");
			System.out.println("|    Would you like to turn on the console? Type Yes or No  |");
			System.out.println("|___________________________________________________________|");
			System.out.println();
			System.out.println();
			String userInput = kb.nextLine();

			if ("YESYesyesYy".contains(userInput)) {
				app.mainMenu();
			}

			else if ("NONonoNnwefdf".contains(userInput)) {
				System.out.println("See you next time!");
				turnOn = false;

			} else {
				System.out.println("That is not a valid input.");
				continue;
			}
		}

	}
}
