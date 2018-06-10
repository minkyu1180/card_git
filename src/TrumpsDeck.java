import java.util.*;

public class TrumpsDeck {
	ArrayList<TrumpCard> Deck;
	//private Suit_Spade spades=new Suit_Spade();
	//private Suit_Heart hearts=new Suit_Heart();
	//private Suit_Diamond diamonds=new Suit_Diamond();
	//private Suit_Club clubs=new Suit_Club();
	TrumpsDeck() {
		Deck = new ArrayList<TrumpCard>();
		for (int i = 2; i < 10; i++) {
			Deck.add(new TrumpCard("Heart", i));
			Deck.add(new TrumpCard("Club", i));
			Deck.add(new TrumpCard("Diamond", i));
			Deck.add(new TrumpCard("Spade", i));
		}
	}
	TrumpCard Draw() {
		TrumpCard DrawCard = new TrumpCard();
		DrawCard = Deck.remove(0);
		return DrawCard;
	}
	void UnDraw(TrumpCard UnDrawCard) {
		Deck.add(0,UnDrawCard);
	}
	
	void UnDraw(TrumpCard UnDrawCard, int index) {
		Deck.add(index, UnDrawCard);
	}
	
	void UnDrawBottom(TrumpCard UnDrawCard) {
		Deck.add(Deck.size(), UnDrawCard);
	}
	
	void shuffle() {
		Collections.shuffle(Deck);
	}
	
}
