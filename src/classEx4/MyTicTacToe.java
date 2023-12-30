/*
* Name: Min Thu Htet
* ID: 6611950
* Sec: 544
 */
package classEx4;

import java.util.Scanner;

public class MyTicTacToe {
    public static void main(String[] args) {
        char[][] tttBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X';

        while (whoWin(tttBoard) == 'N') {
            // Display the current state of the board
            displayBoard(tttBoard);

            // Get the current player's move
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Check if the move is valid
            if (isValidMove(tttBoard, row, col)) {
                // Make the move
                tttBoard[row][col] = currentPlayer;

                // Switch to the other player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        // Display the final state of the board
        displayBoard(tttBoard);

        // Determine the winner
        char winner = whoWin(tttBoard);

        if (winner != 'N') {
            System.out.println("Player " + winner + " wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();


    }
    private static void displayBoard(char[][] tttBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tttBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(char[][] tttBoard, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && tttBoard[row][col] == ' ';
    }

    public static char whoWin(char[][] tttBoard) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (tttBoard[i][0] == tttBoard[i][1] && tttBoard[i][1] == tttBoard[i][2] && tttBoard[i][0] != ' ') {
                return tttBoard[i][0]; // Row win
            }
            if (tttBoard[0][i] == tttBoard[1][i] && tttBoard[1][i] == tttBoard[2][i] && tttBoard[0][i] != ' ') {
                return tttBoard[0][i]; // Column win
            }
        }

        // Check diagonals
        if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][2] && tttBoard[0][0] != ' ') {
            return tttBoard[0][0]; // Diagonal win (top-left to bottom-right)
        }
        if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][0] && tttBoard[0][2] != ' ') {
            return tttBoard[0][2]; // Diagonal win (top-right to bottom-left)
        }

        return 'N'; // No winner yet
    }
    private static void showBoard(char[][] tttBoard) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tttBoard[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }



}
