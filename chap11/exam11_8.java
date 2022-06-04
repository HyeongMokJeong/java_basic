package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class exam11_8 extends JFrame{
	public exam11_8() {
		setTitle("텍스트필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴공", 20));
		c.add(new JLabel("주소"));
		c.add(new JTextField("자바시 자바구", 20));
		
		setSize(300, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new exam11_8();
	}

}
