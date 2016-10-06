package ClueGame;

public class BoardCell {
	private int row;
	private int col;
	private String initial;
	
	public BoardCell(int row, int col){
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public boolean isWalkway() {
		return false;
	}
	public boolean isRoom() {
		return false;
	}
	public boolean isDoorway() {
		return false;
	}

	public Object getDoorDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setInitial(String i) {
		initial = i;
	}
	
	public String getInitial() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
