package chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exam10_7_2 extends JFrame{
	private JLabel la = new JLabel("시작");

	public exam10_7_2() {
		setTitle("예제 10-7 2번째");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(la);
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Container con = (Container) e.getSource();
				con.setFocusable(true);
				con.requestFocus();
			}
		});
		c.addKeyListener(new keyEve());
		
		setSize(300, 500);
		setVisible(true);
	}
	
	private class keyEve extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container con = (Container) e.getSource();
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키를 누름");
			
			if (e.getKeyChar() == '%') 
				con.setBackground(Color.yellow);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				con.setBackground(Color.green);
		}
	}
	
	public static void main(String[] args) {
		new exam10_7_2();
	}

}
