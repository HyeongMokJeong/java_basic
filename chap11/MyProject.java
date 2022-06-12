package chap11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class search{
	private double[] ary;
	private int[] rankary = {0, 0, 0, 0, 0}; // A, B, C, D, F
	public search(double[] ary) {
		this.ary = ary;
		for (double i:ary) {
			if (i >= 90 & i <= 100)
				rankary[0] += 1;
			else if (i >= 80 & i < 90)
				rankary[1] += 1;
			else if (i >= 70 & i < 80)
				rankary[2] += 1;
			else if (i >= 60 & i < 70)
				rankary[3] += 1;
			else
				rankary[4] += 1;
		}
	}
	public double average() {
		double sum = 0;
		for (double i:ary) 
			sum += i;
		return sum / ary.length;
	}
	
	public String getStar(int a) {
		String result = "";
		for (int i = 0; i < rankary[a]; i++)
			result += "*";
		
		return result;
	}
}


class pan1 extends JPanel{
	private int student;
	private JLabel stdLa = new JLabel("학생 수를 입력하세요.", SwingConstants.CENTER);
	private JTextField txt = new JTextField(1);
	
	public pan1(MyProject a) {
		this.setLayout(new GridLayout(10, 1));
		a.setTitle("학생 수 입력");
		
		txt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField) e.getSource();
				student = Integer.parseInt(t.getText());
				a.getContentPane().removeAll();
				a.getContentPane().add(new pan2(a, student));
				a.revalidate();
				a.repaint();
			}
		});
		
		this.add(stdLa);
		this.add(txt);
	}
}

class pan2 extends JPanel {
	private JLabel la1 = new JLabel();
	private JLabel la2 = new JLabel("정수로 입력해 주세요.");
	private JTextField t = new JTextField(3);
	private int count = 0;
	
	public pan2(MyProject a, int s) {
		double[] scoreAry = new double[s];
		a.setTitle("학생 점수 입력");
		this.setLayout(new GridLayout(10, 1));
		la1.setText("1번째 학생 점수 입력");
		
		t.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double j = 0;
				JTextField t = (JTextField) e.getSource();
				j = Double.parseDouble(t.getText());
				scoreAry[count] = j;
				count += 1;
				if (count >= s) {
					a.getContentPane().removeAll();
					a.getContentPane().add(new pan3(a, s, scoreAry));
					a.revalidate();
					a.repaint();
				}
				else{
					la1.setText((count+1) + "번째 학생 점수 입력");
					t.setText("");
				}
			}
		});
		
		this.add(la1);
		this.add(t);
	}
}

class pan3 extends JPanel{
	private String[] rk = {"A", "B", "C", "D", "F"};
	private JLabel la = new JLabel();
	
	public pan3(MyProject a, int s, double[] ary) {
		search s1 = new search(ary);
		this.setLayout(new FlowLayout());
		a.setTitle("결과 발표");
		String tet = "<html>";
		
		for (int i=0; i < rk.length; i++) {
			String text = rk[i] + "\t|" + s1.getStar(i) + "<br>";
			tet += text + "\n";
		}
		tet += "----------------<br>평균: " + String.format("%.2f",s1.average()) + "</html>";
		la.setText(tet);
		this.add(la);
	}
}

public class MyProject extends JFrame{
	
	public MyProject() {
		setTitle("학생 평점 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new pan1(this));
		
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyProject();
	}

}
