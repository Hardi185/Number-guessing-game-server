package com.game.number_guessing.Model;

public class GameState {
    private int targetNumber;
    private int attempts;
    private int score;
    private boolean gameOver;
    private String message;

    public GameState(String message, int score) {
        this.message = message;
        this.score = score;
    }

    // Getter and Setter for targetNumber
    public int getTargetNumber() {
        return targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    // Getter and Setter for attempts
    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    // Getter and Setter for score
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    // Getter and Setter for gameOver
    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    // Getter and Setter for message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

