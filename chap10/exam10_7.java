package chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam10_7 extends JFrame{
	JLabel label = new JLabel("Defalut");
	
	public exam10_7() {
		setTitle("Key Code 예제 10-7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		
		Container c = getContentPane();
		c.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Container con = (Container)e.getSource();
				con.setFocusable(true);
				con.requestFocus();
			}
		});
		c.addKeyListener(new keyEve());
		c.add(label);
		
		setVisible(true);
	}
	
	class keyEve extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container con = (Container) e.getSource();
			
			label.setText(KeyEvent.getKeyText(e.getKeyCode()) + "키가 입력되었음");
			
			if(e.getKeyChar() == '%')
				con.setBackground(Color.YELLOW);
			else if(e.getKeyCode() == KeyEvent.VK_F1)
				con.setBackground(Color.green);
		}
	}
	
	public static void main(String[] args) {
		new exam10_7();
	}
}
