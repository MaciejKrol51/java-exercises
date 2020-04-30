package sample;


public class Player {

	private String name; 
	private char token;
	
	public Player() {
		this.name = null;
		this.token = 0;
	}
	
	public Player(String name, char token) {
		this.name = name;
		this.token = token;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char gettoken() {
		return this.token;
	}
	
	public boolean mark(Game g, char row, int col) {
		String A = "ABCDEFGHI";
		int rowNum = A.indexOf(row);
		
		if (g.getBoard()[rowNum][col-1] == 0) {
			g.getBoard()[rowNum][col-1] = token;
			return true;
		} else {
			return false;
		}
	}
}
