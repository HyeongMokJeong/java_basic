package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam11_6 extends JFrame{
	public exam11_6() {
		setTitle("라디오버튼 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon("C:/Users/jhm10/Desktop/img/c.png");
		ImageIcon img2 = new ImageIcon("C:/Users/jhm10/Desktop/img/g.png");
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton b1 = new JRadioButton("사과");
		JRadioButton b2 = new JRadioButton("배");
		JRadioButton b3 = new JRadioButton("체리", img);
		b3.setSelectedIcon(img2);
		
		group.add(b1);
		group.add(b2);
		group.add(b3);
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new exam11_6();
	}

}
