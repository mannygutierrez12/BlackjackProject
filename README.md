<h1>The Blackjack Project</h1>

<h2>Overview:</h2>

<p>This is our fourth project for this cohort, in which we aim to create an application that simulates the game of Blackjack. The objective of the game is for multiple players to bet against the house on who can get closer to 21 or achieve a score of 21 in their first try. In our project, we will create an application with two players, including the dealer.</p>

<p>I created an application that mimics the workflow of a game console, just like the “GameBoy”. I included the project we created during the first week, Hi-Low, and modified the project to prompt the user if they want to play again. For obvious reasons, I included the task for the week, which was to create a functional blackjack program using object-oriented features.</p>

<p>At the beginning of the program, the application behaves like a console and prompts the user if they want to turn on the application. After the user says “Yes,” the user has five options:</p>

<ol>
	<li>Play Blackjack</li>
	<li>Play Hi-Low</li>
	<li>See the rules of Blackjack</li>
	<li>See the rules of High-Low</li>
	<li>Turn off the console</li>
</ol>

<p>I must emphasize that the high-low program is included just as a way to make the application more interactive with the users, but it is not created using the object-oriented principles like Blackjack. That was my main objective at the beginning of the application, to create two applications using object-oriented programming. But the blackjack project took longer than I expected it to be.</p>

<p>The way this program is designed with these options in mind is to be totally doable in the near future, not only with the Hi-Low game but any other games that use a deck of cards.</p>


<h2>Tech</h2>

<h3>Our application will be developed using the following:</h3>

<ol>
<li>Java</li>
<li>Object-Oriented Programming</li>
<li>Git</li>
<li>Stack Overflow as a resource</li>
<li>The Washington Post Games Section for comparison purposes</li>
<li>We copied and pasted the rules from Blackjack Apprenticeship, while providing proper credit for the reference.</li>
<li>We copied and pasted the rules from Our Pastimes, while providing proper credit for the reference.</li>
</ol>

<h2>How to Improve this Program</h2>

<p>There are lots of ways to improve the functionality of this program. The first one would be to make the Aces convertible between one and 11. One of the first bugs that I encountered was losing after getting 2 aces in the rounds, when in real life, the sum of these two cards would be either 2 or 12 depending on the player's wishes. Another great functionality that can potentially improve the quality of the program would be to create a small database that is able to store the player with the highest scores. I personally think that a cloud database would be good, but a way to export a list to a local text file would be more than enough at the moment. I am sure it that the execution of this idea would be the opposite of the Jet project, where we import from a text file, but currently, that is outside my capabilities, and I have decided to focus on the main task for this week.</p>

<h2>Lessons Learned</h2>

<p>This project has been one of our most challenging to date. We have incorporated lessons learned from the first week to the current stage, making it a mix of all our learning experiences. One of the biggest challenges we faced was incorporating multiple while loops without creating an infinite loop and using while loops from other classes.</p>
<p>At the beginning of the project, I felt pretty confident that I would be able to create this application within a few hours. And believe me, I was not wrong. Within a few hours, I had a functional application that compared items from a list using a method and would pick a winner based on certain parameters. The problem? It was not an object-oriented application. It was just a simple application that picked random numbers from a list called deck. Getting this application to behave using an object-oriented syntax became the real elephant in the room.</p>

<p>The first big challenge that I encountered was when the game prompted the user to play again, a new game would start without a problem, but both the User and Dealer's Scores began counting using the last score. For instance, if the last score for the user was 20, and the new hand was 18, the new score would be 38, causing the user to lose immediately when the compareScore method was called. I then started using the deck size method and realized that new games started with fewer cards than the previous ones, and so forth. This was really frustrating, but I was able to solve the problem not by myself. When I went to the hand class, I realized that there was a method that I had never used, but the instructors included it as part of the exercise, and it was the clear method. After a quick Google search, I found a website that described the clear method as a way to "discard" all elements in an array list. Basically, I was forgetting that when the dealer gave a card to a player, that card now belonged to the player's hand and would remain so until the player "returned the card" back to the deck.</p>

<p>I felt confident that this would solve the problem, but I could not be more wrong. When the program asked me once again if I wanted to continue playing, I could see a deck with 52 cards, but I still had the previous game score. So what was the real issue? I could immediately see that neither the player nor the dealer had any cards in their hands, but I still was getting the last score. After multiple hours of debugging, I found out that the variables that I declared to hold the scores of the player were local variables, and they would remain so until I initiated them again. So basically what was happening was that the local variables were not resetting automatically because we were still within the loop they were initialized. I fixed the issue by initializing the variable once again to zero when the new loop prompted the user if he or she wants to play again. Was all the problems solved? Not really.</p>

<p>After hours of writing code and more hours of debugging, I found out that the cards I was getting in the new game were either the same from the last game or the computer was giving cards from ascending orders. So what was the problem now? After more hours of debugging, I realized that when a new deck was not created, and when I created the new deck, I had to “re-shuffle” the deck once again to get them randomized. I can say that without a doubt, this was a really challenging project. The mechanics behind a blackjack game are really easy to mimic using the Java language, the main issue is to make the program behave in an object-oriented manner.</p>

<h2> References </h2>

<p>Blackjack Apprenticeship. (n.d.). <em>How to Play Blackjack.</em> Retrieved April 9, 2023, from <a href="https://www.blackjackapprenticeship.com/how-to-play-blackjack/" target="_blank">https://www.blackjackapprenticeship.com/how-to-play-blackjack/</a></p>

<p>Our Pastimes. (n.d.). <em>Hi-Lo Card Game Rules.</em> Retrieved April 9, 2023, from <a href="https://ourpastimes.com/hilo-card-game-rules-6705590.html" target="_blank">https://ourpastimes.com/hilo-card-game-rules-6705590.html</a></p>
