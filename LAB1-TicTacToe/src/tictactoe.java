//TicTacToe 
//this class  contains the grid, the current player. It also contains methods to switch the current player, set a cell, get a cell, check if a cell is empty, and check if a player has won.
public class tictactoe {
    //instance variables
    public char currentPlayer; // 'X' or 'O'
    public boolean isXsTurn = true;
    public char[][] grid;
//methods

//switchTurn
//this method switches the current player
    public void switchTurn() {
        if (isXsTurn) {
            this.currentPlayer = 'O';
        } else {
            this.currentPlayer = 'X';
        }
        isXsTurn = !isXsTurn; 

    
    } 
    //constructor
    //this constructor initializes the grid and the current player
    
    tictactoe(){
        currentPlayer = 'X'; // Start with 'X'
        grid = new char[3][3];

    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s, %s, %s\n%s, %s, %s\n%s, %s, %s",
        grid[0][0] != '\u0000' ? grid[0][0] : "-",
        grid[0][1] != '\u0000' ? grid[0][1] : "-",
        grid[0][2] != '\u0000' ? grid[0][2] : "-",
        grid[1][0] != '\u0000' ? grid[1][0] : "-",
        grid[1][1] != '\u0000' ? grid[1][1] : "-",
        grid[1][2] != '\u0000' ? grid[1][2] : "-",
        grid[2][0] != '\u0000' ? grid[2][0] : "-",
        grid[2][1] != '\u0000' ? grid[2][1] : "-",
        grid[2][2] != '\u0000' ? grid[2][2] : "-");
        }
    public void set(int x, int y, char s){
        grid[x][y] = s;
    }
    public char get(int x, int y){
        return grid[x][y];
    }
    public boolean checkSpace(int x, int y){
        if(grid[x][y] == '\u0000'){
            return true;
        }
        return false;
    }
    public char checkWin(){
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != ' ') {
                return (grid[i][0]);
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j] && grid[0][j] != ' ') {
                return (grid[0][j]);
            }
        }

        // Check diagonals
        if ((grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != ' ') ||
            (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != ' ')) {
            return (grid[1][1]);
        }
        // Check for draw
        boolean draw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    draw = false;
                }
            }
        }
        if (draw) {
            return 'D';
        }

        // No winner found
        return ' ';
    }
    
}