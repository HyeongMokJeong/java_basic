package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam11_3 extends JFrame{
	public exam11_3() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		ImageIcon img = new ImageIcon("C:/Users/jhm10/Desktop/img/p.png");
		ImageIcon img2 = new ImageIcon("C:/Users/jhm10/Desktop/img/c.png");
		ImageIcon img3 = new ImageIcon("C:/Users/jhm10/Desktop/img/g.png");
		
		JButton b = new JButton("call~~", img);
		b.setRolloverIcon(img2);
		b.setPressedIcon(img3);
		b.setHorizontalAlignment(SwingConstants.LEFT);
		
		c.add(b);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new exam11_3();
	}
}
