package com.skilldistillery.blackjack.entities;


import java.util.Scanner;

public class HiLo {
	
	public void startGame() {
    	Scanner kb = new Scanner(System.in);
        ConsoleConfig app = new ConsoleConfig();
        HiLo localapp = new HiLo();
        
        System.out.println(" ________________________________________________");
		System.out.println("|       Welcome to the High Low Table!!!         |");
		System.out.println("|             Let's the game begin!              |");
		System.out.println("|________________________________________________|");
		System.out.println();
 
        localapp.hiLo(kb);
        System.out.println(); 
        
        boolean playAgain = true;
        while(playAgain) {
        	
        	System.out.println(" ___________________________________________________");
			System.out.println("|   Would you like to play again? Type Yes or No    |");
			System.out.println("|___________________________________________________|");
			String userInput = kb.nextLine();
            
            if ("YESYesyesYy".contains(userInput)) {
            	localapp.hiLo(kb);
            }
          
            else if ("NONonoNnwefdf".contains(userInput)) {
            	app.mainMenu();
                playAgain = false; 
                ConsoleConfig localApp = new ConsoleConfig();
                localApp.mainMenu();
				break;
                
            }
            
            else {
            	System.out.println("That is not a valid input");
            	continue;
            }
        }
        
        //kb.close();
    }
    
    public void hiLo(Scanner kb) {
        int min = 1;
        int max = 52;
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
     
        
        int userInput;
        boolean isTheSameNumber = true;
        
        while(isTheSameNumber) {
            System.out.println("Please pick a number from 1 to 52: ");
            userInput = Integer.parseInt(kb.nextLine());
            
            if(userInput == randomNumber) {
                System.out.println("Congratulations!!! You won");
                isTheSameNumber = false;
            } else if(userInput > randomNumber) {
                if(userInput-randomNumber == 1) {
                    System.out.println("Super hot!!!");
                } else if(userInput-randomNumber <= 3) {
                    System.out.println("It is warmer");
                } else if(userInput-randomNumber > 3) {
                    System.out.println("It is cold");
                }
            } else if(userInput < randomNumber) {
                if(randomNumber-userInput == 1) {
                    System.out.println("Super hot!!!");
                } else if(randomNumber - userInput <= 3) {
                    System.out.println("It is warmer");
                } else if(randomNumber - userInput  > 3) {
                    System.out.println("It is cold");
                }
            }
        }
        
    }
	
}