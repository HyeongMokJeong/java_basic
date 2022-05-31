package chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam10_8 extends JFrame{
	JLabel label = new JLabel("Hello");
	
	public exam10_8() {
		setTitle("¿¹Á¦ 10-8");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		Container c = getContentPane();
		
		label.setSize(100, 20);
		label.setLocation(50, 50);
		
		c.addMouseListener(new MouseAdapter() {
			public void mouseCliked(MouseEvent e) {
				Container con = (Container) e.getSource();
				con.setFocusable(true);
				con.requestFocus();
			}
		});
		c.add(label);
		c.addKeyListener(new keyEve());
		
		setVisible(true);
	}
	
	class keyEve extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_UP) 
				label.setLocation(label.getX(), label.getY() + 10);
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				label.setLocation(label.getX(), label.getY() - 10);
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				label.setLocation(label.getX() - 10, label.getY());
			else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				label.setLocation(label.getX() + 10, label.getY());
		}
	}
	
	public static void main(String[] args) {
		new exam10_8();
	}
}
