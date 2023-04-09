<h1>The Blackjack Project</h1>
<h2>Overview</h2>
<p>This is our fourth project for this cohort, in which we aim to create an application that simulates the game of Blackjack. The objective of the game is for multiple players to bet against the house on who can get closer to 21 or achieve a score of 21 in their first try. In our project, we will create an application with two players, including the dealer.</p>
<h3>Rules of the Game</h3>
<p>In the first round, each player and the house are dealt two cards each. Each player can decide to "Stand," meaning they do not want more cards, or "Hit" as many times as they want. All the players' cards are visible at all times, and in the first round, only the second card of the house is visible. If a player surpasses the score of 21, they are automatically disqualified. If a player gets an ace and a ten, it results in an automatic win, unless the house also draws an ace and a ten, resulting in a draw between the player and the house. Once all players have stood, hit, or disqualified, the house is required to continue drawing until its score is equal to or greater than 17. In this game, all players can win, draw, or lose, and if all players lose, the house automatically wins without drawing any cards. If a player or the house scores 21 with an ace and a ten, it is considered a "Blackjack," and this person is the winner, even if all scores are the same.</p>
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
<p>This project has been one of our most challenging to date. We have incorporated lessons learned from the first week to the current stage, making it a mix of all our learning experiences. One of the biggest challenges we faced was incorporating while loops without creating an infinite loop. Another challenge that I encountered was when the game prompted the user to play again, a new game would start without a problem, but both the User and Dealer's Scores began counting using the last score. For instance, if the last score for the user was 20, and the new hand was 18, the new score would be 38, causing the user to lose immediately when the compareScore method was called. I then started using the deck size method and realized that new games started with fewer cards than the previous ones, and so forth. This was really frustrating, but I was able to solve the problem not by myself. When I went to the hand class, I realized that there was a method that I had never used, but the instructors included it as part of the exercise, and it was the clear method. After a quick Google search, I found a website that describes the clear method as a way to "discard" all elements in an array list. Basically, I was forgetting that when the dealer gave a card to a player, that card now belonged to the player's hand and would remain so until the player "returned the card" back to the deck.</p>

<h2> References </h2>

<p>Blackjack Apprenticeship. (n.d.). <em>How to Play Blackjack.</em> Retrieved April 9, 2023, from <a href="https://www.blackjackapprenticeship.com/how-to-play-blackjack/" target="_blank">https://www.blackjackapprenticeship.com/how-to-play-blackjack/</a></p>

<p>Our Pastimes. (n.d.). <em>Hi-Lo Card Game Rules.</em> Retrieved April 9, 2023, from <a href="https://ourpastimes.com/hilo-card-game-rules-6705590.html" target="_blank">https://ourpastimes.com/hilo-card-game-rules-6705590.html</a></p>
