// This is the main class that runs the game. It takes input from the user and displays the game board. It also checks for a win condition and prints the winner.

import java.util.*;


public class Play {
    public static void main(String[] args) throws Exception {
        //Crerating a scanner object
        Scanner sc = new Scanner(System.in);

        //Creating a tictactoe object
        tictactoe game = new tictactoe();
        System.out.println("Hello, World! this is tictactoe !!!!!");

        //Game loop
        while(true){
            //Printing the game board
            System.out.print(game);

        
            System.out.println("\nIt's " + game.currentPlayer + "'s turn. Where would you like to go? eg: x y");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (game.checkSpace(x-1, y-1)){
                game.set(x-1, y-1, game.currentPlayer);
            }
            else{
                System.out.println("Invalid move. Try again.");
                continue;
            }
            game.switchTurn();
            clearTerminal();
            if (game.checkWin() == 'X') {
                System.out.println("X wins!");
                break;
            }
            
            else if (game.checkWin() == 'O') {
                System.out.println("O wins!");
                break;
            }
            else if (game.checkWin() == 'D') {
                System.out.println("It's a draw!");
                break;
            }
        }
        sc.close();
    }
//This method clears the terminal
    private static void clearTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}