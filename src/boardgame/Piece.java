package boardgame;

public class Piece {
	
	protected Position postion;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		postion = null;
	}

	// O método getBoard() será acessado por classes do mesmo pacote ou subclasses
	protected Board getBoard() {
		return board;
	}	
	
}
