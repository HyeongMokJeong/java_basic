package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam11_5 extends JFrame{
	private JCheckBox ch1 = new JCheckBox("���");
	private JCheckBox ch2 = new JCheckBox("��");
	private JCheckBox ch3 = new JCheckBox("ü��");
	JLabel la2 = new JLabel("���� 0�� �Դϴ�.");
	
	public exam11_5() {
		setTitle("üũ�ڽ� �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("��� 100��, �� 500��, ü�� 20000��");
		ch1.setBorderPainted(true);
		ch1.setBorderPainted(true);
		ch1.setBorderPainted(true);
		
		itemEve eve = new itemEve();
		ch1.addItemListener(eve);
		ch2.addItemListener(eve);
		ch3.addItemListener(eve);
		
		c.add(la);
		c.add(ch1);
		c.add(ch2);
		c.add(ch3);
		c.add(la2);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class itemEve implements ItemListener{
		private int sum = 0;
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == ch1) 
					sum += 100;
				else if(e.getItem() == ch2)
					sum += 500;
				else
					sum += 20000;
			}
			else {
				if(e.getItem() == ch1)
					sum -= 100;
				else if(e.getItem() == ch2)
					sum -= 500;
				else
					sum -= 20000;
			}
			la2.setText("���� " + sum + "�� �Դϴ�.");
		}
		
	}

	public static void main(String[] args) {
		new exam11_5();
	}

}
