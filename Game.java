package sample;

import java.util.Arrays;

public class Game 
{

	private char[][] board;
	private int size; 

	public Game() {
		this.board = null;
		this.size = 0;
	}

	public Game(int size) {
		this.board = new char[size][size];
		this.size = size;
	}

	public char[][] getBoard() {
		return board;
	}

	public int getSize() {
		return size;
	}

	public boolean isFull() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j<size; j++) {
				if (board[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean didWin(char sign) {
		int rowCounter = 0, colCounter = 0, diagonalCounter1 = 0, diagonalCounter2 = 0;
		// go through rows for winning
		for(int i = 0; i<size; i++)
		{
			for(int j = 0; j<size; j++)
			{
				if (board[i][j] == sign) // counting signs in a row
				{
					rowCounter++;
				}
				if (board[j][i] == sign) // counting signs in a column
				{
					colCounter++;
				}
				if (i==j && board[j][i] == sign) // counting signs in a diagonal
				{
					diagonalCounter1++;
				}
				if (board[size-1-j][j] == sign && i == 0) // counting signs in a diagonal
				{
					diagonalCounter2++;
				}
			}
			if (rowCounter == size || colCounter == size || diagonalCounter1 == size || diagonalCounter2 == size) // found a winner
			{
				return true;
			} else 
			{
				rowCounter = colCounter = 0;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String output = "";
		for (int i = 0; i<=size; i++)
		{
			if (i != 0)
			{
				output+=(char)('A'+i-1);
			}
			for (int j = 0; j<size; j++)
			{
				if (i == 0)
				{
					output+=("  "+(j+1)+"");
				}else
				{
					char c = board[i-1][j];
					if (c != 0)
					{
						output+=("["+board[i-1][j]+"]");
					}else
					{
						output+=("[ ]");
					}
				}
			}
			output+=("\n");
		}
		return output;
	}

}
