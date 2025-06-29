# TicTacToe_dp
# ❌⭕ Tic-Tac-Toe Game using Builder & Strategy Design Patterns

This project implements a modular **Tic-Tac-Toe game** using object-oriented principles and two major software design patterns:

- 🧱 **Builder Pattern** – for constructing customizable game boards.
- ♟️ **Strategy Pattern** – for defining flexible and interchangeable player strategies (Human, RandomBot, Minimax AI).

> 🧠 The design emphasizes scalability, testability, and the separation of game construction logic from player decision-making logic.

---

## 📌 Features

- 🔁 Supports replayable 3x3 Tic-Tac-Toe games
- 👤 Human vs Human, Human vs Bot, Bot vs Bot modes
- 🧱 Game board built using **Builder Pattern**
- ♟️ Player strategies implemented using **Strategy Pattern**
- 🧠 Extendable AI (e.g., Minimax, random bot)
- 🧪 Easily testable and readable OOP structure

---

## 🎯 Design Patterns Overview

### 🧱 Builder Pattern (for Game Construction)
Used to:
- Customize and initialize the game environment
- Decouple the game creation from its internal representation

### ♟️ Strategy Pattern (for Player Behavior)
Used to:
- Allow multiple player types (Human, Bot, AI)
- Inject player behavior dynamically at runtime

---

## 🗂️ Project Structure

tictactoe-design-patterns/
├── builder/
│ ├── GameBuilder.py # Abstract builder class
│ └── TicTacToeBuilder.py # Concrete builder for TicTacToe board
├── strategy/
│ ├── PlayerStrategy.py # Abstract base class for strategies
│ ├── HumanPlayer.py # Human input strategy
│ ├── RandomBot.py # Bot that makes random valid moves
│ └── MinimaxBot.py # AI strategy (optional)
├── GameDirector.py # Director that orchestrates builder
├── Game.py # Main game logic
├── main.py # Entry point for playing
└── README.md # You’re here
