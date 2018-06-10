import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CompositeLayout
{
	JFrame jFrame = new JFrame("�áڰ������ھ�");
	JButton [] btn = new JButton [6]; //6�� ����
	
	public CompositeLayout()
    {
		//GridLayout ����
		jFrame.setLayout(null);
		
		//�����̳� ��������
		Container container = jFrame.getContentPane();
		
		//������Ʈ ���� �� �߰��ϱ�
		for(int i=0; i < btn.length; i++)
		{
			btn[i] = new JButton();
			btn[i].setFocusPainted(false);
		    btn[i].setBorderPainted(false);
		    btn[i].setFocusable(false);	//�׳� ĭ ������ button
		    btn[i].setEnabled(false);
			container.add(btn[i]);
		}
		
		btn[0].setBounds(0,300,100,143);

	    
	   
		
	    btn[0].setIcon(new ImageIcon("./CARD_LIST/clover_2.png"));
	    btn[0].setBorderPainted(false);
	    btn[0].setFocusPainted(false);
	    btn[0].setContentAreaFilled(false);
	    
	    btn[0].setEnabled(true);
	    
		btn[1].setBounds(0,330,1125,340); // ���Ʒ� 330 ����
		btn[1].setBackground(Color.GREEN);
		//������ ũ�� �����ϱ�
		jFrame.setSize(1500,1000);
		

	    btn[3].setBounds(1125,0,2,1000);
	    btn[3].setBackground(Color.BLACK);
	    btn[4].setBounds(1125,0,1125,375);
	    //btn[3].setBackground(Color.GRAY);
		
		//������ ���̱�
		jFrame.setVisible(true);
		
		//�����ư�� ���� ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
    }

	public static void main(String[] args)
	{
		new CompositeLayout();
	}

}