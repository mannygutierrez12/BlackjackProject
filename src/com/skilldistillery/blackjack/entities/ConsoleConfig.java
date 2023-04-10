package com.skilldistillery.blackjack.entities;

import java.util.Scanner;

public class ConsoleConfig {

	Scanner kb = new Scanner(System.in);

	public ConsoleConfig() {

	}

	public void turnOn() {
		System.out.println("The console is starting up.");
		System.out.println("Thank you for your patience.");
	}

	public void turnOff() {
		System.out.println("The console is shutting down.");
		System.out.println("See you next time!");
		System.out.println("Zzzzzzzzzz...");
	}

	public void mainMenu() {
		ConsoleConfig localApp = new ConsoleConfig();

		boolean finishedProgram = true;
		while (finishedProgram) {

			System.out.println(" ___________________________________________________");
			System.out.println("|             Welcome to Casino Royale              |");
			System.out.println("|___________________________________________________|");
			System.out.println("|   Plese choose a number from the following menu   |");
			System.out.println("|___________________________________________________|");
			System.out.println("|                                                   |");
			System.out.println("|            1-) Play Black Jack                    |");
			System.out.println("|            2-) Play High-Low                      |");
			System.out.println("|            3-) See rules of Black Jack            |");
			System.out.println("|            4-) See rules of High-Low              |");
			System.out.println("|            5-) turn off the program               |");
			System.out.println("|___________________________________________________|");

			System.out.println();

			System.out.println("Please type your answer below: ");
			String userInput = kb.nextLine();

			if (userInput.equals("1")) {
				Dealer app = new Dealer();
				app.run();
			}

			else if (userInput.equals("2")) {
				HiLo app = new HiLo();
				app.startGame();
			}

			else if (userInput.equals("3")) {
				localApp.rulesOfBlackJack();
			}

			else if (userInput.equals("4")) {
				localApp.rulesOfHiLow();
			}

			else if (userInput.equals("5")) {
				finishedProgram = false;
				localApp.turnOff();
				break;

			}

			else {
				System.out.println("That is not a valid input. Please try again.");
				continue;
			}
		}
		System.out.println("See you next time");

	}

	private void rulesOfBlackJack() {
		System.out.println("");
		System.out.println("Objective of Blackjack: Beat The Dealer");
		System.out.println("");
		System.out.println("How do you beat the dealer?");
		System.out.println("");
		System.out.println("1-) By drawing a hand value that is higher than the dealer’s hand value");
		System.out.println("2-) By the dealer drawing a hand value that goes over 21.");
		System.out.println("3-) By drawing a hand value of 21 on your first two cards, when the dealer does not.");
		System.out.println("");
		System.out.println("How do you lose to the dealer?");
		System.out.println("");
		System.out.println("1-) Your hand value exceeds 21.");
		System.out.println("2-) The dealer's hand has a greater value than yours at the end of the round.");
		System.out.println();
		System.out.println("References provided from:");
		System.out.println("www.blackjackapprenticeship.com");

		boolean stayHere = true;
		while (stayHere) {
			System.out.println(" ___________________________________________________________");
			System.out.println("|Would you like to go back to the main menu? Type Yes or No |");
			System.out.println("|___________________________________________________________|");
			System.out.println();
			System.out.println();
			String userInput = kb.nextLine();

			if ("YESYesyesYy".contains(userInput)) {
				stayHere = false;
				ConsoleConfig app = new ConsoleConfig();
				app.mainMenu();
				break;

			}

			else if ("NONonoNnwefdf".contains(userInput)) {
				continue;

			} else {
				System.out.println("That is not a valid input.");
				continue;
			}

		}

	}

	private void rulesOfHiLow() {
		System.out.println("");
		System.out.println("Hi-Lo, or High-Low, is a fairly simple card game. ");
		System.out.println("It uses a standard deck of 52 cards, and players guess");
		System.out.println("whether a certain card is higher or lower than one showing on the table");
		System.out.println();
		System.out.println("Number of Players");
		System.out.println();
		System.out.println("Technically, the game can have any number of players");
		System.out.println("but at any given time, there are only two players actually playing");
		System.out.println("The dealer, who is in control of the deck, and the player, who is responsible");
		System.out.println("for guessing the values of cards, are the only participants.");
		System.out.println();
		System.out.println("References provided from:");
		System.out.println("www.ourpastimes.com");

		boolean stayHere = true;
		while (stayHere) {
			System.out.println(" ___________________________________________________________");
			System.out.println("|Would you like to go back to the main menu? Type Yes or No |");
			System.out.println("|___________________________________________________________|");
			System.out.println();
			System.out.println();
			String userInput = kb.nextLine();

			if ("YESYesyesYy".contains(userInput)) {
				stayHere = false;
				ConsoleConfig app = new ConsoleConfig();
				app.mainMenu();
				break;

			}

			else if ("NONonoNnwefdf".contains(userInput)) {
				continue;

			} else {
				System.out.println("That is not a valid input.");
				continue;
			}

		}

	}

}
