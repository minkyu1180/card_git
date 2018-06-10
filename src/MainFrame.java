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
	boolean register(ArrayList<TrumpCard> candidate) {
		Score_candi rawCandi = new Score_candi(candidate);
		scoreType.validate(rawCandi) // 점수 검증
		
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
	JPanel opScore;
	JPanel opField;
	JPanel midArea;
	JPanel myField;
	JPanel myScore;
	maindeck mid;
	
	
	MainFrame(){
		mainframe = new JFrame();
		mid = new maindeck();
		opScore = new JPanel();
		opField = new JPanel();
		midArea = new JPanel();
		myField = new JPanel();
		myScore = new JPanel();
		
		Random rand = new Random();
		Color fieldColor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		Color ScoreColor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
		
		mainframe.setSize(1200,800);
		mainframe.setLayout(new GridLayout(5,1));
		opScore.setBackground(ScoreColor);
		myScore.setBackground(ScoreColor);
		myField.setBackground(fieldColor);
		opField.setBackground(fieldColor);
		mainframe.add(opScore);
		mainframe.add(opField);
		mainframe.add(midArea);
		mainframe.add(myField);
		mainframe.add(myScore);
		
		midArea.add(mid);
		midArea.setVisible(true);
		midArea.setName("MID");
		
		
		mid.setFocusable(false);
		mid.setVisible(true);
		mid.setBorderPainted(false);
		mid.setFocusPainted(false);
		mid.setContentAreaFilled(false);
		mid.setIcon(new ImageIcon("./CARD_LIST/back.png"));
		mid.setIconTextGap(0);
		System.out.print(mid.getIconTextGap());
		
		mainframe.setVisible(true);
	}
	
	
	// predict Phase
	void predictPhase() {
		//prdictframe으로 prediction을 받음.
		prediction predic = new prediction(1,2,3);
	}
	// draw Phase
	void drawPhase() {
		
	}
	// effect Phase
	// score Phase
	
}
