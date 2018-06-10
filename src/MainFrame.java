import javax.management.DescriptorKey;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

class maindeck extends JButton{
	String shape;
	int value;
	boolean revealed;
	maindeck(){
		revealed = false;
		value = 0;
		shape = "NONE";
	}
}

class fieldCard{
	ArrayList<TrumpCard> hand;
	fieldCard(){
		hand = new ArrayList<TrumpCard>();
	}
	void erase(int index) {
		hand.remove(index);
	}
	void add(TrumpCard DrawedCard) {
		hand.add(DrawedCard);
	}
	boolean register(ArrayList<TrumpCard> candidate, int myScore) {
		Score_candi rawCandi = new Score_candi();
		rawCandi = (Score_candi) candidate;
		int ScoredScore = 0;
		ScoredScore = scoreType.validate(rawCandi); // 점수 검증
		if (ScoredScore != -1) {
			myScore += ScoredScore;
			return true;
		}
		return false;
	}
}



class prediction{
	private int attribute; // 0 -- shape, 1 -- value
	private int shape; // 0 -- spade, 1 -- dia, 2 -- heart, 3 -- club 스다하클
	private int value; // 2 ~ 10
	prediction(int attribute,int shape,int value){
		this.attribute = attribute;
		this.shape = shape;
		this.value = value;
	}
	int getAttribute(){
		return attribute;
	}
	int getShape() {
		return shape;
	}
	int getValue() {
		return value;
	}
}

public class MainFrame {
	JFrame mainframe;

	int myScore;
	int opScore;
	TrumpsDeck gameTrump;
	fieldCard myFieldCard;
	fieldCard opFiledCard;
	
	MainFrame(){
		myScore = 0;
		opScore  = 0;
		gameTrump = new TrumpsDeck();
		myFieldCard = new fieldCard();
		opFiledCard = new fieldCard();
	}
	
	
	// predict Phase
	void predictPhase(int turnplayer) {
		//prdictframe으로 prediction을 받음. 
		prediction predic = new prediction(1,2,3);
	}
	// draw Phase
	void drawPhase(int turnplayer) {
		
	}
	// effect Phase
	void effectPhase(int turnplayer) {
		
	}
	void scorePhase(int turnplayer) {
		
	}
	// score Phase
	
}
