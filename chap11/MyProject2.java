package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyProject2 extends JFrame {
	private JRadioButton[] btnGroup;
	private JLabel la = new JLabel();
	private JTextField tf = new JTextField(10);
	
	public MyProject2() {
		setTitle("MyProject2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		makeMenu();
		addBtn(c);
		c.add(la);
		c.add(tf);
		
		setSize(250, 300);
		setVisible(true);
	}
	
	private void makeMenu() {
		String[] menuLi = {"��ư ���̱�", "��ư �����", "����"};
		JMenuItem[] itemLi = new JMenuItem[menuLi.length];
		
		JMenuBar mb = new JMenuBar();
		
		JMenu menu = new JMenu("System");
		
		MenuEve eve = new MenuEve();
		for (int i = 0; i < menuLi.length; i++) {
			itemLi[i] = new JMenuItem(menuLi[i]);
			itemLi[i].addActionListener(eve);
			if (i == menuLi.length - 1)
				menu.addSeparator();
			menu.add(itemLi[i]);
		}
		
		mb.add(menu);
		setJMenuBar(mb);
		
	}
	
	private void addBtn(Container c) {
		String[] btnLi = {"1�� ���", "2�� ���", "3�� ���"};
		ButtonGroup group = new ButtonGroup();
		btnGroup = new JRadioButton[btnLi.length];
		
		RadioEve eve = new RadioEve();
		for (int i = 0; i < btnLi.length; i++) {
			btnGroup[i] = new JRadioButton(btnLi[i]);
			btnGroup[i].addItemListener(eve);
			group.add(btnGroup[i]);
			c.add(btnGroup[i]);
		}
		
	}
	
	class MenuEve implements ActionListener{ // �޴� �̺�Ʈ
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "��ư ���̱�":
				for (JRadioButton b:btnGroup)
					b.setVisible(true);
				break;
			case "��ư �����":
				for (JRadioButton b:btnGroup)
					b.setVisible(false);
				break;
			case "����":
				System.exit(0);
				break;
			}
		}
	}
	
	class RadioEve implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if(btnGroup[0].isSelected())
				la.setText("�л� �̸�");
			else if (btnGroup[1].isSelected())
				la.setText("�й�");
			else
				la.setText("����");
		}
	}

	public static void main(String[] args) {
		new MyProject2();
	}

}
