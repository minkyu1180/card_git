import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CompositeLayout
{
	JFrame jFrame = new JFrame("시★공★조★아");
	JButton [] btn = new JButton [6]; //6개 생성
	
	public CompositeLayout()
    {
		//GridLayout 적용
		jFrame.setLayout(null);
		
		//컨테이너 가져오기
		Container container = jFrame.getContentPane();
		
		//컴포넌트 생성 및 추가하기
		for(int i=0; i < btn.length; i++)
		{
			btn[i] = new JButton();
			btn[i].setFocusPainted(false);
		    btn[i].setBorderPainted(false);
		    btn[i].setFocusable(false);	//그냥 칸 나누는 button
		    btn[i].setEnabled(false);
			container.add(btn[i]);
		}
		
		btn[0].setBounds(0,300,100,143);

	    
	   
		
	    btn[0].setIcon(new ImageIcon("./CARD_LIST/clover_2.png"));
	    btn[0].setBorderPainted(false);
	    btn[0].setFocusPainted(false);
	    btn[0].setContentAreaFilled(false);
	    
	    btn[0].setEnabled(true);
	    
		btn[1].setBounds(0,330,1125,340); // 위아래 330 여백
		btn[1].setBackground(Color.GREEN);
		//프레임 크기 지정하기
		jFrame.setSize(1500,1000);
		

	    btn[3].setBounds(1125,0,2,1000);
	    btn[3].setBackground(Color.BLACK);
	    btn[4].setBounds(1125,0,1125,375);
	    //btn[3].setBackground(Color.GRAY);
		
		//프레임 보이기
		jFrame.setVisible(true);
		
		//종료버튼에 대한 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
    }

	public static void main(String[] args)
	{
		new CompositeLayout();
	}

}