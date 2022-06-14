package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyProject5 extends JFrame{
	private JLabel img = new JLabel();
	private String[] ls = {"Project Explorer", "MyProject5", "Terminal"};
	private JRadioButton[] btnls = new JRadioButton[ls.length];
	private ImageIcon[] imgls = {new ImageIcon("img/1.PNG"), new ImageIcon("img/2.PNG"), new ImageIcon("img/3.PNG")};

	public MyProject5() {
		setTitle("Java_Workspace - Eclipse IDE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		makeMenu();
		makeRadio(c);
		c.add(img);
		
		
		setSize(600,600);
		setVisible(true);
	}
	
	public void makeMenu() {
		String[] ls = {"File", "Edit", "Source", "Refactor", "Navigate", "Search", "Project", "Run", "Window", "Help"};
		String[] file_ls = {"New", "Save", "Exit"};
		JMenu[] menuLs = new JMenu[ls.length];
		JMenuItem[] fileItemls = new JMenuItem[file_ls.length];
		
		JMenuBar mb = new JMenuBar();
		
		for (int i=0; i < ls.length; i++) {
			menuLs[i] = new JMenu(ls[i]);
			mb.add(menuLs[i]);
		}
		
		menuEve eve = new menuEve();
		for (int i=0; i < file_ls.length; i++) {
			fileItemls[i] = new JMenuItem(file_ls[i]);
			fileItemls[i].addActionListener(eve);
			menuLs[0].add(fileItemls[i]);
		}
		
		setJMenuBar(mb);
	}
	
	public void makeRadio(Container c) {
		ButtonGroup g = new ButtonGroup();
		
		radioEve eve = new radioEve();
		for (int i=0; i < ls.length; i++) {
			btnls[i] = new JRadioButton(ls[i]);
			btnls[i].addItemListener(eve);
			g.add(btnls[i]);
			c.add(btnls[i]);
		}
		btnls[0].setSelected(true);
	}
	
	class menuEve implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "New":
				break;
			case "Save":
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}
	
	class radioEve implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if (btnls[0].isSelected())
				img.setIcon(imgls[0]);
			else if (btnls[1].isSelected())
				img.setIcon(imgls[1]);
			else
				img.setIcon(imgls[2]);
		}		
	}
	
	public static void main(String[] args) {
		new MyProject5();
	}
}
