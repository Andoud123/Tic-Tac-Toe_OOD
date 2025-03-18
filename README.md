# Tic-Tac-Toe Game

## Introduction
This is a simple console-based Tic-Tac-Toe game implemented in Java. The game supports two modes:
- **Player vs Player**
- **Player vs Computer** (Random move-based AI)

The game continues until one player reaches **3 wins**, and after each match, players can choose to return to the main menu or exit the game.

## Features
- Play **Player vs Player** or **Player vs Computer**
- Tracks score and declares a winner at 3 wins
- Allows users to restart or exit after a match
- Grid-based board system with easy-to-use inputs

## How to Play
1. Run the program.
2. Choose a mode:
   - `1` for **Player vs Player**
   - `2` for **Player vs Computer**
3. Enter player names.
4. Players take turns entering moves in **A1, B2, etc.** format.
5. The first player to win **3 rounds** is declared the overall winner.
6. After the match, choose to **return to the menu** or **exit**.

## Classes Overview
### 1. **XOTester (Main Class)**
   - Manages game flow and player selection.
   - Loops until a player reaches 3 wins.
   - Displays menu options for replaying or exiting.

### 2. **Player (Abstract Class)**
   - Base class for `Human` and `Computer`.
   - Stores player name.
   - Has an abstract `getMove()` method.

### 3. **Human (Subclass of Player)**
   - Takes user input for moves.

### 4. **Computer (Subclass of Player)**
   - Makes **random moves** on the board.

### 5. **Grid (Game Board)**
   - Stores the 3x3 game board.
   - Checks for win conditions and draws.
   - Displays the board.

### 6. **Square (Optional Class for Board Cells)**
   - Stores individual cell data (coordinates, symbol).
   - Checks if a cell is occupied.

## Installation & Running the Game
1. Clone this repository or download the files.
2. Ensure you have **Java installed** (JDK 8 or later).
3. Open a terminal/command prompt.
4. Compile the game using:
   ```sh
   javac XOTester.java
   ```
5. Run the game:
   ```sh
   java XOTester
   ```

## Future Improvements
- Implement a **Smart AI** using the **Minimax algorithm**.
- Add a graphical interface for better user experience.
- Improve input validation and error handling.


