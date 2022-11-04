package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    private int points = 0;
    private int computerPoints = 0;

    public void addPlayerPoints() {
        points++;
    }

    public void addComputerPoints() {
        computerPoints++;
    }

    public int computerMove() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public void zeroingPoints() {
        points = 0;
        computerPoints = 0;
    }

    public int playerMove(int move) {
        return move;
    }

    public int beats(int move, int computerMove) {
        int result = 0;
        if (playerMove(move) == computerMove) {
            result = 0;
        } else if (playerMove(move) == 1 && computerMove == 3 ||
                playerMove(move) == 1 && computerMove == 4 ||
                playerMove(move) == 2 && computerMove == 1 ||
                playerMove(move) == 2 && computerMove == 5 ||
                playerMove(move) == 3 && computerMove == 2 ||
                playerMove(move) == 3 && computerMove == 4 ||
                playerMove(move) == 4 && computerMove == 5 ||
                playerMove(move) == 4 && computerMove == 2 ||
                playerMove(move) == 5 && computerMove == 1 ||
                playerMove(move) == 5 && computerMove == 3) {
            result = 2;
        } else {
            result = 1;
        }
        return result;
    }

    public void calculatingPoints() {
        if (points > computerPoints) {
            System.out.println("You won! Your score: " + points
                    + ", \nopponents score: " + computerPoints);
        } else if (points == computerPoints) {
            System.out.println("We have a draw!");
        } else {
            System.out.println("You lost...your score: " + points + ", \nopponent's score: "
                    + computerPoints);
        }
    }

    public void showMoves(int move) {
        if (move == 1) {
            System.out.println("Rock");
        } else if (move == 2) {
            System.out.println("Paper");
        } else if (move == 3) {
            System.out.println("Scissors");
        } else if (move == 4) {
            System.out.println("Lizard");
        } else if (move == 5) {
            System.out.println("Spock");
        }
    }

    public void gameStart() {
        boolean end = false;
        while (!end) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Your name: ");
            String name = scanner.next();
            System.out.println("Welcome " + name + " ! How many rounds do You want to play?");
            int rounds = scanner.nextInt();
            int counter = 0;
            System.out.println("Select difficulty level [easy/hard]");
            String level = scanner.next();
            while (counter < rounds) {
                System.out.println("Buttons configuration:\n1 - Rock, 2 - Paper, 3 - Scissors, 4 - Lizard, 5 - Spock\n\"x\" to quit or \"n\" to restart");
                String decision = scanner.next();
                if (decision.equals("x")) {
                    System.out.println("Are you sure you want to quit?[y/n]");
                    String quit = scanner.next();
                    if (quit.equals("y")) {
                        end = true;
                        break;
                    } else if (quit.equals("n")) {
                        System.out.println("Let's try again...");
                    } else {
                        System.out.println("You've entered wrong value!");
                    }
                }
                if (decision.equals("n")) {
                    System.out.println("Are you sure you want to restart? [y/n]");
                    String restart = scanner.next();
                    if (restart.equals("y")) {
                        System.out.println("Let's try again...");
                        zeroingPoints();
                        continue;
                    }
                }
                if (level.equals("easy")) {
                    int move = Integer.parseInt(decision);
                    int secondMove = computerMove();
                    showMoves(move);
                    showMoves(secondMove);
                    int result = beats(move, secondMove);
                    if (result == 2) {
                        addPlayerPoints();
                    } else if (result == 1) {
                        addComputerPoints();
                    } else {
                        System.out.println("We have a draw!");
                    }
                    System.out.println("Player points: " + points + "\nComputer points: " + computerPoints);
                    counter++;
                } else if (level.equals("hard")) {
                    int move = Integer.parseInt(decision);
                    int secondMove = computerMove();
                    int result = beats(move, secondMove);
                    if (result == 2) {
                        int thirdMove = computerMove();
                        int secondResult = beats(move, thirdMove);
                        if (secondResult == 2) {
                            showMoves(move);
                            showMoves(thirdMove);
                            addPlayerPoints();
                        } else if (secondResult == 1) {
                            showMoves(move);
                            showMoves(thirdMove);
                            addComputerPoints();
                        } else {
                            showMoves(move);
                            showMoves(thirdMove);
                            System.out.println("We have a draw!");
                            continue;
                        }
                    } else if (result == 1) {
                        showMoves(move);
                        showMoves(secondMove);
                        addComputerPoints();
                    } else {
                        showMoves(move);
                        showMoves(secondMove);
                    }
                    System.out.println("Player points: " + points + "\nComputer points: " + computerPoints);
                    counter++;
                }
            }
            calculatingPoints();
            System.out.println("Quit: \"x\", restart: \"n\" ");
            String quit = scanner.next();
            if (quit.equals("x")) {
                end = true;
            }
            zeroingPoints();
        }
    }
}
