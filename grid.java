
/**
 * Write a description of class grid here.
 *
 * @author (Luke Logan)
 * @version (1.12)
 */
import java.util.Scanner; 
public class grid
{
static void clearscreen(){
    System.out.print('\u000C');
}

static String[][] createboard() {
    String [][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
    for (int t = 0; t < 5; t++) {
        for (int e = 0; e < 5; e++){
            board [t][e] = "0";
        }
    }
        
    return board;
}

static void insertboard(String[][] board){
    for (int t = 0; t < 5; t++){
        for (int e = 0; e < 5; e++){
            System.out.print("    "+board[t][e]+ "    ");
        }
        System.out.println();
    }
}

static String[][] customboard(String[][] board){
    int num = 5;
    int tcount = 0;
    int ecount = 0;
    Scanner bet = new Scanner(System.in);
    for (int t = 0; t < num; t++){
        for (int e = 0; e < num; e++){
            tcount = t + 1;
            ecount = e + 1;
            System.out.println("Give a value for number in position " +tcount+ "' " +ecount+ ":   ");
            board[t][e] = bet.next();

        }
    }
    return board;
}

static String[][] alterboard(String[][] board, int x, int y){
    Scanner bet = new Scanner(System.in);
    System.out.println("Please insert a value for the string in the position " + x + "' " + y + ":   ");
    board[x][y] = bet.next();
    return board;
}

public static void main(String[] args) {
    boolean playagain = true;
    boolean fillananswer = true;
    int x, y;
    int num = 5;
    String [][] board = {{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"},{"0","0","0","0","0"}};
    int elementnumber;
    Scanner myscanner = new Scanner(System.in);
    
    do {
        clearscreen();
        
        System.out.println("There is a board to edit.");
  
        board = createboard();
  
        insertboard(board);
  
        board = customboard(board);
  
        insertboard(board);
        
        System.out.print("You must chang one ponit on the board. Please give the x-coordinate:   ");
        x = myscanner.nextInt();
        System.out.print("Now please enter the Y-coordinate:    ");
        y = myscanner.nextInt();
  
        alterboard( board, x, y);
  
        insertboard(board);
        
        System.out.println("Would you like to play again? Type true or false.");
        playagain = myscanner.nextBoolean();
    } while (playagain);
    
}
}
