
public class TrumpCard implements Comparable <TrumpCard> {
	String suit;
	int value;
	public boolean visible = false;
	TrumpCard() {
		suit = "No Suit";
		value = 0;
	}
	TrumpCard(String s, int v) {
		suit = s;
		value = v;
	}
	int getValue() {
		return value;
	}
	String getSuit() {
		return suit;
	}
	@Override
	public int compareTo(TrumpCard o) {
		if (this.getValue() == o.getValue()) return 0;
		else if (this.getValue() > o.getValue()) return 1;
		else return -1;
	}
	

}
