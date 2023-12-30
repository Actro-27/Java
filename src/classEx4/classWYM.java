package classEx4;
/*
 * Name : Min Thu Htet
 * ID : 6612054
 * Sec : 541
 */


import java.util.Scanner;

public class classWYM {

    public static void main(String[] args) {
        char tttboard[][] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};

        char result = whoWin(tttboard);
        if (result == 'X') {
            System.out.println("+++++++++++++++++");
            System.out.println("The Winner is X.");
            System.out.println("+++++++++++++++++");
        } else if (result == 'O'){
            System.out.println("+++++++++++++++++");
            System.out.println("The Winner is O");
            System.out.println("+++++++++++++++++");
        }	else {
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("The result is Draw, no one has won");
            System.out.println("+++++++++++++++++++++++++++++++++++");
        }
    }

    public static char whoWin(char[][] tttboard) {
        char board[] = {' ','O','X'};

        try (Scanner myScan = new Scanner(System.in)) {
            int j = 0;

            while (true) {
                for (int i = 0, e = 0; i < 3; i ++) {
                    if (i == 2 && e!= 2) {
                        System.out.println(" "+ tttboard[e][i]+ " ");
                        System.out.println("---+---+---");
                        e += 1;
                        i = 0;
                    } else if (e == 2 && i == 2){
                        System.out.println(" "+ tttboard[e][i]+ " ");
                        break;
                    }
                    System.out.print(" "+tttboard[e][i]+" ");
                    System.out.print("|");
                }

                if (j == 4) {
                    System.out.print("For the player 'O', Enter column: ");
                    int column = myScan.nextInt();
                    System.out.print("For the player 'O', Enter row: ");
                    int row = myScan.nextInt();
                    tttboard[row][column] = 'O';
                    if ((tttboard[0][0] == tttboard[1][1] && tttboard[1][1] == tttboard[2][2] && tttboard[0][0] == tttboard[2][2] && tttboard[0][0] == board[1]) || (tttboard[2][0] == tttboard[1][1] && tttboard[1][1] == tttboard[0][2] && tttboard[0][2] == tttboard[2][0] && tttboard[2][0] == board[1])|| (tttboard[0][0] == tttboard[0][1] && tttboard[0][1] == tttboard[0][2] && tttboard[0][0] == tttboard[0][2] && tttboard[0][0] == board[1]) || (tttboard[1][0] == tttboard[1][1] && tttboard[1][1] == tttboard[1][2] && tttboard[1][0] == tttboard[1][2] && tttboard[1][0] == board[1]) || (tttboard[2][0] == tttboard[2][1] && tttboard[2][1] == tttboard[2][2] && tttboard[2][0] == tttboard[2][2] && tttboard[2][0] == board[1]) || (tttboard[0][0] == tttboard[1][0] && tttboard[1][0] == tttboard[2][0] && tttboard[0][0] == tttboard[2][0] && tttboard[0][0] == board[1]) || (tttboard[0][1] == tttboard[1][1] && tttboard[1][1] == tttboard[2][1] && tttboard[0][1] == tttboard[2][1] && tttboard[0][1] == board[1]) || (tttboard[0][2] == tttboard[1][2] && tttboard[1][2] == tttboard[2][2] && tttboard[0][2] == tttboard[2][2] && tttboard[0][2] == board[1])) {
                        return 'O';
                    } else if ((tttboard[0][0] == tttboard[1][1] && tttboard[1][1] == tttboard[2][2] && tttboard[0][0] == tttboard[2][2] && tttboard[0][0] == board[2]) || (tttboard[2][0] == tttboard[1][1] && tttboard[1][1] == tttboard[0][2] && tttboard[0][2] == tttboard[2][0] && tttboard[2][0] == board[2])|| (tttboard[0][0] == tttboard[0][1] && tttboard[0][1] == tttboard[0][2] && tttboard[0][0] == tttboard[0][2] && tttboard[0][0] == board[2]) || (tttboard[1][0] == tttboard[1][1] && tttboard[1][1] == tttboard[1][2] && tttboard[1][0] == tttboard[1][2] && tttboard[1][0] == board[2]) || (tttboard[2][0] == tttboard[2][1] && tttboard[2][1] == tttboard[2][2] && tttboard[2][0] == tttboard[2][2] && tttboard[2][0] == board[2]) || (tttboard[0][0] == tttboard[1][0] && tttboard[1][0] == tttboard[2][0] && tttboard[0][0] == tttboard[2][0] && tttboard[0][0] == board[2]) || (tttboard[0][1] == tttboard[1][1] && tttboard[1][1] == tttboard[2][1] && tttboard[0][1] == tttboard[2][1] && tttboard[0][1] == board[2]) || (tttboard[0][2] == tttboard[1][2] && tttboard[1][2] == tttboard[2][2] && tttboard[0][2] == tttboard[2][2] && tttboard[0][2] == board[2]) ) {
                        return 'X';
                    } else {
                        return 'D';
                    }
                }

                if (j == 4) {
                    break;
                }

                System.out.print("For the player 'O', Enter column: ");
                int column = myScan.nextInt();
                System.out.print("For the player 'O', Enter row: ");
                int row = myScan.nextInt();

                System.out.print("For the player 'X', Enter column: ");
                int column1 = myScan.nextInt();
                System.out.print("For the player 'X', Enter row: ");
                int row1 = myScan.nextInt();

                if (tttboard[row][column] != board[0] || tttboard[row1][column1] != board[0]) {
                    System.out.println("Please Enter new column/row place because someone has entered the existed one");
                    System.out.print("For the player 'O', Enter column: ");
                    int column2 = myScan.nextInt();
                    System.out.print("For the player 'O', Enter row: ");
                    int row2 = myScan.nextInt();
                    tttboard[row2][column2] = 'O';

                    System.out.print("For the player 'X', Enter column: ");
                    int column3 = myScan.nextInt();
                    System.out.print("For the player 'X', Enter row: ");
                    int row3 = myScan.nextInt();
                    tttboard[row3][column3] = 'X';

                } else {

                    tttboard[row][column] = 'O';

                    tttboard[row1][column1] = 'X';

                }


                if ((tttboard[0][0] == tttboard[1][1] && tttboard[1][1] == tttboard[2][2] && tttboard[0][0] == tttboard[2][2] && tttboard[0][0] == board[1]) || (tttboard[2][0] == tttboard[1][1] && tttboard[1][1] == tttboard[0][2] && tttboard[0][2] == tttboard[2][0] && tttboard[2][0] == board[1])|| (tttboard[0][0] == tttboard[0][1] && tttboard[0][1] == tttboard[0][2] && tttboard[0][0] == tttboard[0][2] && tttboard[0][0] == board[1]) || (tttboard[1][0] == tttboard[1][1] && tttboard[1][1] == tttboard[1][2] && tttboard[1][0] == tttboard[1][2] && tttboard[1][0] == board[1]) || (tttboard[2][0] == tttboard[2][1] && tttboard[2][1] == tttboard[2][2] && tttboard[2][0] == tttboard[2][2] && tttboard[2][0] == board[1]) || (tttboard[0][0] == tttboard[1][0] && tttboard[1][0] == tttboard[2][0] && tttboard[0][0] == tttboard[2][0] && tttboard[0][0] == board[1]) || (tttboard[0][1] == tttboard[1][1] && tttboard[1][1] == tttboard[2][1] && tttboard[0][1] == tttboard[2][1] && tttboard[0][1] == board[1]) || (tttboard[0][2] == tttboard[1][2] && tttboard[1][2] == tttboard[2][2] && tttboard[0][2] == tttboard[2][2] && tttboard[0][2] == board[1])) {
                    return 'O';
                } else if ((tttboard[0][0] == tttboard[1][1] && tttboard[1][1] == tttboard[2][2] && tttboard[0][0] == tttboard[2][2] && tttboard[0][0] == board[2]) || (tttboard[2][0] == tttboard[1][1] && tttboard[1][1] == tttboard[0][2] && tttboard[0][2] == tttboard[2][0] && tttboard[2][0] == board[2])|| (tttboard[0][0] == tttboard[0][1] && tttboard[0][1] == tttboard[0][2] && tttboard[0][0] == tttboard[0][2] && tttboard[0][0] == board[2]) || (tttboard[1][0] == tttboard[1][1] && tttboard[1][1] == tttboard[1][2] && tttboard[1][0] == tttboard[1][2] && tttboard[1][0] == board[2]) || (tttboard[2][0] == tttboard[2][1] && tttboard[2][1] == tttboard[2][2] && tttboard[2][0] == tttboard[2][2] && tttboard[2][0] == board[2]) || (tttboard[0][0] == tttboard[1][0] && tttboard[1][0] == tttboard[2][0] && tttboard[0][0] == tttboard[2][0] && tttboard[0][0] == board[2]) || (tttboard[0][1] == tttboard[1][1] && tttboard[1][1] == tttboard[2][1] && tttboard[0][1] == tttboard[2][1] && tttboard[0][1] == board[2]) || (tttboard[0][2] == tttboard[1][2] && tttboard[1][2] == tttboard[2][2] && tttboard[0][2] == tttboard[2][2] && tttboard[0][2] == board[2]) ) {
                    return 'X';
                }

                j ++;
            }

            myScan.close();

            return 'D';
        }

    }

}
