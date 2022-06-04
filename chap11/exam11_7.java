package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam11_7 extends JFrame{
	private JLabel la = new JLabel();
	private JRadioButton b1 = new JRadioButton("1번");
	private JRadioButton b2 = new JRadioButton("2번");
	private JRadioButton b3 = new JRadioButton("3번");
	private ImageIcon img1 = new ImageIcon("C:/Users/jhm10/Desktop/img/g.png");
	private ImageIcon img2 = new ImageIcon("C:/Users/jhm10/Desktop/img/c.png");
	private ImageIcon img3 = new ImageIcon("C:/Users/jhm10/Desktop/img/p.png");
	
	public exam11_7() {
		setTitle("라디오버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		JPanel pan1 = new JPanel(new FlowLayout());
		
		itemEve eve = new itemEve();
		
		ButtonGroup group = new ButtonGroup();
		b1.addItemListener(eve);
		b2.addItemListener(eve);
		b3.addItemListener(eve);
		b3.setSelected(true);
		
		group.add(b1);
		group.add(b2);
		group.add(b3);
		pan1.add(b1);
		pan1.add(b2);
		pan1.add(b3);
		
		la.setIcon(img3);

		
		c.add(pan1, BorderLayout.NORTH);
		c.add(la, BorderLayout.CENTER);
		la.setHorizontalAlignment(SwingConstants.CENTER);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class itemEve implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(b1.isSelected())
				la.setIcon(img1);
			else if(b2.isSelected())
				la.setIcon(img2);
			else
				la.setIcon(img3);
		}
		
	}

	public static void main(String[] args) {
		new exam11_7();
	}

}
