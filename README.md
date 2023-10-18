# Crossy Roads
Hello! This is our group project for Android Studios Crossy Roads. 
Description
Welcome to the Crossy Roads Android mobile game project! This game is a road-crossing adventure where you play as a character trying to reach the goal on the other side of the map. You'll have to navigate through roads filled with vehicles and rivers with floating logs. Be careful, though! Touching cars or water tiles will cost you a life, and once you run out of lives, it's game over.

## Sprint Progress

### Sprint 1: Start Screen
Start Game: Begin your adventure.
Quit Game: Exit the game.
Initial Configuration Screen:
  * Player Name: Enter your name (must not be whitespace-only, empty, or null).
  * Difficulty: Choose the game's difficulty.
  * Character Selection: Pick a character sprite.
  * Continue: Transition to the game screen.
 
Game Screen:
  * Display starting lives.
  * Show player name.
  * Display player character sprite based on the selected character.

### Sprint 2
 Player Movement: Move up, down, left, and right (within screen boundaries, consider using a grid or tile system).
 Tile Generation: Generate safe tiles, road tiles, and river tiles across the width of the screen. Vary the widths of roads and rivers.
 Goal Tile: Display the goal tile (functionality to be added in a future sprint).

### Sprint 3
 Vehicle Implementation: Create three types of vehicles with distinct gameplay behaviors (e.g., different sizes and speeds).
 Scoring: Award points for moving towards the goal (no points for sideways or backward movement).

### Sprint 4
Water Tiles: Touching a water tile costs a life.
Collisions and Lives: Collision with a car deducts a life. Go to the game over screen when lives are exhausted.
Game Over Screen: Options to restart the game or quit. Display the player's final score.
### Sprint 5
Score Enhancement: Continue awarding points for moving towards the goal (no points for sideways or backward movement).
Goal Functionality: Implement functionality for the goal tile.
Log Implementation: Create two types of logs with distinct gameplay behaviors. A player on a log should move at the same direction and speed as the log.
Win Screen: Options to restart the game or quit. Display the player's final score.

### Installation
To play Crossy Roads on your Android device:

Clone this repository.
  * Open the project in Android Studio.
  * Connect your Android device or use an emulator.
  * Build and run the game.
 
Controls
  * Use on-screen controls to move the character up, down, left, and right.
  * Tap "Start" to begin the game.
  * Swipe "Quit" to exit the game.
 
Credits
This game was developed as a semester project by Grace Wang, Eric Chen, Hilary Chen, Justin Yang, and Katy Gu for CS 2340 at Georgia Tech :D
