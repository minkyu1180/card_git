import java.util.*;

public class Game {
	public static ArrayList<String> send(ArrayList<String> code) {
		return null;
	}
	public static ArrayList<String> receive(ArrayList<String> code) {
		return null;
	}
	private static int _score;
	public static int getScore() {
		return _score;
	}
	public static void setScore(int increment) {
		_score+=increment;
		getScore();
	}
	Game() {
		_score=0;
	}
}
