package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exam11_2 extends JFrame{
	public exam11_2() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("����մϴ�.");
		
		ImageIcon img = new ImageIcon("C:/Users/jhm10/Desktop/img/f.png");
		JLabel la2 = new JLabel(img);
		
		ImageIcon img2 = new ImageIcon("C:/Users/jhm10/Desktop/img/g.png");
		JLabel la3 = new JLabel("��������� ��ȭ�ϼ���", img2, SwingConstants.CENTER);
		
		c.add(la);
		c.add(la2);
		c.add(la3);
		
		setSize(400, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new exam11_2();
	}

}
