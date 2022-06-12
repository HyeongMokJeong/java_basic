package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyProject3 extends JFrame{
	private JRadioButton btn1;
	private JRadioButton btn2;
	private JRadioButton btn3;
	private JLabel la1;
	private JLabel la2;
	private JLabel la3;
	
	public MyProject3() {
		setTitle("������ 3��°");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MakeMenu();
		MakeRadio(c);
		
		JTextField txt = new JTextField(20);
		txt.addActionListener(new txtEve());
		la1 = new JLabel("�Ϻ�: 0");
		la2 = new JLabel("�̱�: 0");
		la3 = new JLabel("�±�: 0");
		
		
		c.add(txt);
		c.add(la1);
		c.add(la2);
		c.add(la3);
		
		
		setSize(250, 300);
		setVisible(true);
	}
	
	public void MakeMenu(){
		
		JMenuBar bar = new JMenuBar();
		
		JMenu menu = new JMenu("menu1");
		JMenu menu2 = new JMenu("menu2");
		
		
		menuEve eve = new menuEve();
		JMenuItem m1 = new JMenuItem("1-1");
		JMenuItem m2 = new JMenuItem("1-2");
		JMenuItem m5 = new JMenuItem("exit");
		m5.addActionListener(eve);
		
		menu.add(m1);
		menu.add(m2);
		menu.addSeparator();
		menu.add(m5);
		
		bar.add(menu);
		bar.add(menu2);
		
		setJMenuBar(bar);
	}
	
	public void MakeRadio(Container c) {
		ButtonGroup g = new ButtonGroup();
		
		btn1 = new JRadioButton("�Ϻ�");
		btn1.setSelected(true);
		btn2 = new JRadioButton("�̱�");
		btn3 = new JRadioButton("�±�");
		
		g.add(btn1);
		g.add(btn2);
		g.add(btn3);
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
	}
	
	public String getRadio() {
		if (btn1.isSelected())
			return "�Ϻ�";
		else if (btn2.isSelected())
			return "�̱�";
		else
			return "�±�";
	}
	
	class menuEve implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch(cmd) {
			case "exit":
				System.exit(0);
				break;
			case "1-1":
				break;
			case "1-2":
				break;
			}
		}
	}
	
	class txtEve implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JTextField txt = (JTextField) e.getSource();
			
			switch(getRadio()) {
			case "�Ϻ�":
				la1.setText("�Ϻ�: " + txt.getText());
				break;
			case "�̱�":
				la2.setText("�̱�: " + txt.getText());
				break;
			case "�±�":
				la3.setText("�±�: " + txt.getText());
				break;
			}
		}
	}

	public static void main(String[] args) {
		new MyProject3();
	}

}
