package chap11;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class MyProject4 extends JFrame{
	private JRadioButton btn1; private JRadioButton btn2; private JRadioButton btn3;
	private JLabel la1; private JLabel la2; private JLabel la3;
	private JTextField txt1; private JTextField txt2; private JTextField txt3;
	private JLabel score = new JLabel();
	private ArrayList<String[]> ary1 = new ArrayList<String[]>();
	private ArrayList<String[]> ary2 = new ArrayList<String[]>();
	private ArrayList<String[]> ary3 = new ArrayList<String[]>();
	
	public MyProject4() {
		setTitle("4��°");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 1));
		makeMenu();
		makeRadio(c);
		makeContent(c);
		makeBtn(c);
		score.addMouseListener(new laEve());
		c.add(score);
		
		setSize(250, 300);
		setVisible(true);
	}
	
	public void makeMenu() {
		JMenuBar mb = new JMenuBar();
		
		JMenu m = new JMenu("menu");
		
		menuEve eve = new menuEve();
		JMenuItem item1 = new JMenuItem("Ȯ���ϱ�");
		JMenuItem item2 = new JMenuItem("����");
		item1.addActionListener(eve);
		item2.addActionListener(eve);
		
		m.add(item1);
		m.addSeparator();
		m.add(item2);
		
		mb.add(m);
		
		setJMenuBar(mb);
	}
	
	public void makeRadio(Container c) {
		JPanel p = new JPanel(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		btn1 = new JRadioButton("1��");
		btn1.setSelected(true);
		btn2 = new JRadioButton("2��");
		btn3 = new JRadioButton("3��");
		
		g.add(btn1);
		g.add(btn2);
		g.add(btn3);
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		
		c.add(p);
	}
	
	public void makeContent(Container c) {
		JPanel p = new JPanel(new GridLayout(3, 2, -50, 1));
		
		la1 = new JLabel("�й�");
		txt1 = new JTextField(10);
		la2 = new JLabel("�̸�");
		txt2 = new JTextField(10);
		la3 = new JLabel("����");
		txt3 = new JTextField(10);
		
		p.add(la1); p.add(txt1);
		p.add(la2); p.add(txt2);
		p.add(la3); p.add(txt3);
		
		c.add(p);
	}
	
	public void makeBtn(Container c) {
		JPanel p = new JPanel();
		
		JButton btn = new JButton("�Է�");
		btn.addMouseListener(new btnEve());
		
		p.add(btn);
		c.add(p);
	}
	
	public String checkTxt() {
		String result = "";
		if (txt1.getText().length() == 0)
			result += "�й� ";
		if (txt2.getText().length() == 0)
			result += "�̸� ";
		if (txt3.getText().length() == 0)
			result += "���� ";
		return result;
	}
	
	public double getAver(ArrayList<String[]> a) {
		double sum = 0;
		
		Iterator<String[]> it = a.iterator();
		while(it.hasNext()) {
			double s = Double.parseDouble(it.next()[2]);
			sum += s;
		}
		return sum / a.size();
	}
	
	class menuEve implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "Ȯ���ϱ�":
				String result;
				if (btn1.isSelected()) 
					result = "1�� ���: " + Double.toString(getAver(ary1));
				else if (btn2.isSelected())
					result = "2�� ���: " + Double.toString(getAver(ary2));
				else
					result = "3�� ���: " + Double.toString(getAver(ary3));
				score.setText(result);
				score.setVisible(true);
				break;
			case "����":
				System.exit(0);
				break;
			}
		}
	}
	
	class laEve extends MouseAdapter{
		public void mouseEntered(MouseEvent e) {
			JLabel la = (JLabel) e.getComponent();
			la.setVisible(false);
		}
	}
	
	class btnEve extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			String txt = checkTxt();
			if (txt != "") {
				score.setText(txt + "��(��) �Է����ּ���.");
				score.setVisible(true);
			}	
			else{
				String[] txts = {txt1.getText(), txt2.getText(), txt3.getText()};
				if (btn1.isSelected()) 
					ary1.add(txts);
				else if (btn2.isSelected())
					ary2.add(txts);
				else
					ary3.add(txts);
				score.setText("�ԷµǾ����ϴ�.");
				score.setVisible(true);
			}
		}
	}

	public static void main(String[] args) {
		new MyProject4();
	}

}
