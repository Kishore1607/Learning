package ArraySums;
import java.util.*;
public class Flip {
    private static int[] rowOffsets = {0, 0, 1, -1};
    private static int[] colOffsets = {1, -1, 0, 0};
    public static void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int numRows = board.length;
        int numCols = board[0].length;
        // Step 1: Traverse the boundaries and mark 'O's and their connected 'O's as '*'
        for (int i = 0; i < numRows; i++) {
            if (board[i][0] == 'O') {
                markConnectedRegions(board, i, 0);
            }
            if (board[i][numCols - 1] == 'O') {
                markConnectedRegions(board, i, numCols - 1);
            }
        }
        for (int j = 0; j < numCols; j++) {
            if (board[0][j] == 'O') {
                markConnectedRegions(board, 0, j);
            }
            if (board[numRows - 1][j] == 'O') {
                markConnectedRegions(board, numRows - 1, j);
            }
        }
        // Step 2: Flip the remaining 'O's to 'X' and the marked '*' back to 'O'
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '*') {
                    board[i][j] = 'O';
                }
            }
        }
    }
    private static void markConnectedRegions(char[][] board, int row, int col) {
        int numRows = board.length;
        int numCols = board[0].length;
        if (row < 0 || row >= numRows || col < 0 || col >= numCols || board[row][col] != 'O') {
            return;
        }
        // Mark the current 'O' as '*'
        board[row][col] = '*';
        // Traverse the neighboring cells
        for (int i = 0; i < 4; i++) {
            int newRow = row + rowOffsets[i];
            int newCol = col + colOffsets[i];
            markConnectedRegions(board, newRow, newCol);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read input
        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();
        char[][] board = new char[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }
        // Solve the problem
        solve(board);
        // Print the modified board
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}