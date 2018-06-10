import java.util.ArrayList;

public class Score_candi extends ArrayList<TrumpCard> {
	int size;
	Score_candi(ArrayList<TrumpCard> instance){
		this.size = instance.size();
	}
	boolean isShapeSame() {
		if (size == 0) return false;
		String shape = this.get(0).getSuit();
		for (int i = 0; i < size; i++) {
			if (shape != this.get(i).getSuit() ) return false;
		}
		return true;
	}
	
	boolean isValueSame() {
		if (size == 0) return false;
		int value = this.get(0).getValue();
		for (int i = 0; i < size; i++) {
			if (value != this.get(i).getValue() ) return false;
		}
		return true;
	}
	
	boolean isValueStraight() {
		if (size != 5)return false;
		int value = this.get(0).getValue();
		for (int i = 1; i < size; i++) {
			if (++value != this.get(i).getValue() ) return false;
		}
		return true;
	}
}
