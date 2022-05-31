package chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exam10_10 extends JFrame{
	
	public exam10_10() {
		setTitle("더블클릭 배경색 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new mouseEve());
		
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class mouseEve extends MouseAdapter{
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				int r = (int)(Math.random() * 256);
				int g = (int)(Math.random() * 256);
				int b = (int)(Math.random() * 256);
				Component con = (Component)e.getSource();
				con.setBackground(new Color(r, g, b));
			}
		}
	}
	
	public static void main(String[] args) {
		new exam10_10();
	}
}
