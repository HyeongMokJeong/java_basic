package chap10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exam10_9 extends JFrame {
	JLabel la = new JLabel("No Mouse Event");
	
	public exam10_9() {
		setTitle("마우스와 마우스 모션 이벤트 활용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(la);
		c.addMouseListener(new mouseEve());
		c.addMouseMotionListener(new mouseMotionEve());
		
		setSize(500, 300);
		setVisible(true);
	}
	
	class mouseEve implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			Container con = (Container) e.getSource();
			
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			con.setBackground(new Color(r, g, b));
		}

		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed (" + e.getX() + ", " + e.getY() + ")");
		}

		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased (" + e.getX() + ", " + e.getY() + ")");
		}

		public void mouseEntered(MouseEvent e) {
			Container con = (Container) e.getSource();
			con.setBackground(Color.blue);
		}

		public void mouseExited(MouseEvent e) {
			Container con = (Container) e.getSource();
			con.setBackground(Color.yellow);
		}
		
	}
	
	class mouseMotionEve implements MouseMotionListener{

		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged (" + e.getX() + ", " + e.getY() + ")");
			
		}
		
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved (" + e.getX() + ", " + e.getY() + ")");
		}
		
	}
	
	public static void main(String[] args) {
		new exam10_9();
	}
}
