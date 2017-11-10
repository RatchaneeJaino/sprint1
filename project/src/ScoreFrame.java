
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
public class ScoreFrame extends JFrame implements ActionListener{
	private JLabel score;
	private JLabel course;
	private JCheckBox quiz1;
	private JCheckBox quiz2;
	private JCheckBox quiz3;
	private JCheckBox midtream;
	private JCheckBox finaltest;
	private JButton next;
	private Font font;
	//ScoreList scorelist;
	ScoreStudent scorestudent;
	int scoreq1=0,scoreq2=0,scoreq3=0,scoreq4=0;

	public ScoreFrame() {
		//scorelist = new ScoreList();
		//scorestudent = new ScoreStudent(iD, name, final1, quiz1, quiz2, quiz3, midterm)
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		GridLayout g = new GridLayout(0,1);
		BorderLayout b = new BorderLayout();
		UserPanel panel = new UserPanel();
		
		p.setLayout(g);	
		p2.setLayout(g);	
		p2.setBorder(new TitledBorder( new LineBorder(Color.ORANGE), "ขอคะแนนสอบ"));
		
		score = new JLabel("วิชา : ");
		course = new JLabel("...");
		quiz1 = new JCheckBox("Quiz1");
		quiz2 = new JCheckBox("Quiz2");
		quiz3 = new JCheckBox("Quiz3");
		midtream = new JCheckBox("Midtream");
		finaltest = new JCheckBox("Final");
		
		quiz1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
			}
		});
		
		quiz2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		quiz3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		font = new Font("Microsoft Sans Serif",Font.BOLD,20);
		
		score.setFont(font);
		quiz1.setFont(font);
		quiz2.setFont(font);
		quiz3.setFont(font);
		midtream.setFont(font);
		finaltest.setFont(font);
		quiz1.setBackground(Color.WHITE);
		quiz2.setBackground(Color.WHITE);
		quiz3.setBackground(Color.WHITE);
		midtream.setBackground(Color.WHITE);
		finaltest.setBackground(Color.WHITE);
		
		p1.setBackground(Color.WHITE);
		
		p4.add(score);
		p4.add(course);
		p4.setBackground(Color.WHITE);
		p2.add(p4);
		p2.add(quiz1);
		p2.add(quiz2);
		p2.add(quiz3);
		p2.add(midtream);
		p2.add(finaltest);
		p2.setPreferredSize(new Dimension(280, 700));
		p2.setBackground(Color.WHITE);
		
		next = new JButton("next");
		next.setBackground(Color.ORANGE);
		//next.setPreferredSize(new Dimension(150,35));
		next.setFont(font);
		p3.add(next);
		p3.setBackground(Color.WHITE);
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		
		this.setLayout(b);
		this.add(panel);
		this.add(p,BorderLayout.EAST);
		this.setSize(700,700);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public void setCourse(String c){
		course.setText(c);
		course.setFont(font);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		
	}
	
	

	/*
	public static void main(String[] args) {
		ScoreFrame frame = new ScoreFrame();

	}
	*/

}
