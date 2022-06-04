package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam11_4 extends JFrame{
	public exam11_4() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon("C:/Users/jhm10/Desktop/img/p.png");
		ImageIcon img2 = new ImageIcon("C:/Users/jhm10/Desktop/img/g.png");
		
		JCheckBox one = new JCheckBox("사과");
		JCheckBox two = new JCheckBox("배");
		JCheckBox three = new JCheckBox("체리", img);
		three.setSelectedIcon(img2);
		
		c.add(one);
		c.add(two);
		c.add(three);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new exam11_4();
	}

}
