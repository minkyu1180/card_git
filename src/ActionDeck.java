/*import java.util.*;
import actionList.*;

import actionList.Action;
import actionList.Destroy;
import actionList.Dust;

public class ActionDeck {
	ArrayList<Action> Deck;
	private int _decksize = 30;
	ActionDeck() {
		Deck = new ArrayList<Action>();
	//	Action _emptycard=new Action();
//		for(int i=0; i<_decksize; i++)
//			_deck.add(_emptycard);
		
	}
	public void Shuffle() {
		;
	}
	public static void main(String[] args) {
		Token t=new Token();
		t.flip();
		System.out.println(t.usable());
		ArrayList<Action> deck=new ArrayList<Action>();
//		deck.add(new Dust());
		System.out.println(deck.get(0)._cardname);
//		deck.get(0).action(new Set(),null);
//		deck.add(new Destroy());
		Set a=new Set();
		System.out.println(a._token.get());
//		deck.get(1).action(a, null);
		System.out.println(a._token.get());
		/*TrumpsDeck d=new TrumpsDeck();
		for(int i=0; i<52; i++) {
			System.out.println(d.Deck.get(i).suit+d.Deck.get(i).value);
		}
	}
}*/