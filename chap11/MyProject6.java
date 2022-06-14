package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyProject6 extends JFrame{
	private String[] btntxtLs = {"사과", "포도", "배"};
	private JRadioButton[] btnLs = new JRadioButton[btntxtLs.length];
	private JTextField tf = new JTextField(20);
	private JLabel la = new JLabel();
	private ImageIcon[] imgLs = {
			new ImageIcon("img/1.PNG"), 
			new ImageIcon("img/2.PNG"), 
			new ImageIcon("img/3.PNG")};
	
	public MyProject6() {
		setTitle("6번째");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		makeMenu();
		makeRadio(c);
		tf.addActionListener(new tfEve());
		c.add(tf);
		c.add(la);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public void makeMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu menu = new JMenu("Help");
		
		JMenuItem item1 = new JMenuItem("exit");
		item1.addActionListener(new menuEve());
		
		menu.add(item1);
		
		mb.add(menu);
		
		setJMenuBar(mb);
	}
	
	public void makeRadio(Container c) {
		ButtonGroup g = new ButtonGroup();
		radioEve eve = new radioEve();
		
		for (int i=0; i < btntxtLs.length; i++) {
			btnLs[i] = new JRadioButton(btntxtLs[i]);
			btnLs[i].addItemListener(eve);
			g.add(btnLs[i]);
			c.add(btnLs[i]);
		}
		btnLs[0].setSelected(true);
	}
	
	class menuEve implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "exit":
				System.exit(0);
				break;
			}
		}
	}
	
	class radioEve implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if (btnLs[0].isSelected())
				la.setIcon(imgLs[0]);
			else if (btnLs[1].isSelected())
				la.setIcon(imgLs[1]);
			else
				la.setIcon(imgLs[2]);
		}
	}
	
	class tfEve implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JTextField t = (JTextField) e.getSource();
			switch (t.getText()) {
			case "사과":
				la.setIcon(imgLs[0]);
				break;
			case "포도":
				la.setIcon(imgLs[1]);
				break;
			case "배":
				la.setIcon(imgLs[2]);
				break;
			}
			tf.setText("");
		}
	}

	public static void main(String[] args) {
		new MyProject6();
	}

}
