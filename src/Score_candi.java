import java.util.ArrayList;

public class Score_candi extends ArrayList<TrumpCard> {
	boolean isShapeSame() {
		if (this.size() == 0) return false;
		String shape = this.get(0).getSuit();
		for (int i = 0; i < this.size(); i++) {
			if (shape != this.get(i).getSuit() ) return false;
		}
		return true;
	}
	
	boolean isValueSame() {
		if (this.size() == 0) return false;
		int value = this.get(0).getValue();
		for (int i = 0; i < this.size(); i++) {
			if (value != this.get(i).getValue() ) return false;
		}
		return true;
	}
	
	boolean isValueStraight() {
		if (this.size() != 5)return false;
		int value = this.get(0).getValue();
		for (int i = 1; i < this.size(); i++) {
			if (++value != this.get(i).getValue() ) return false;
		}
		return true;
	}
}
