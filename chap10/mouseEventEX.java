package chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class mouseEventEX extends JFrame{
	JLabel rabel = new JLabel("test");
	
	public mouseEventEX() {
		setTitle("Mouse Event EX");
		setSize(300, 300);
		setLayout(null);
		
		Container con = getContentPane();
		con.addMouseListener(new mouseEve());
		
		rabel.setSize(50, 20);
		rabel.setLocation(30,30);
		con.add(rabel);
		
		setVisible(true);
	}
	
	class mouseEve implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			rabel.setLocation(x, y);
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public static void main(String[] args) {
		new mouseEventEX();
	}

}
