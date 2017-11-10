
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StudentsFrame extends JFrame implements ActionListener{
	private JTextField textField;
	private JComboBox<String> combo;
	private JRadioButton radioallscore,radiosomescore;
	private JButton btn ;
	String id = "", name = "",email = "";
	//final ControlMnge control;
	Students student;
	ReadFileStudent form ;
	final StudentsList model = new StudentsList();
	public StudentsFrame() {
		//student = new student();
		//String iD, String name, String email
		//control = new ControlMnge();
		StudentsList model = new StudentsList();
		this.setBounds(100, 100, 900, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		Font font = new Font("Microsoft Sans Serif",Font.BOLD,18);
		
		JLabel label = new JLabel("รหัสนักศึกษา");
		label.setFont(font);
		label.setBounds(73,52,97,16);
		this.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(189,49,171,22);
		
		
		this.getContentPane().add(textField);
		textField.setColumns(15);
		id = textField.getText();
		
		//form = new ReadFileStudent();
		
		JLabel lblNewLabel = new JLabel("วิชา");
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(73, 87, 56, 16);
		this.getContentPane().add(lblNewLabel);
		
		String[] s = {"ตัวอย่าง"};
		combo = new JComboBox<>(s);
		combo.setBounds(189, 87, 171, 22);
		this.getContentPane().add(combo);

		radiosomescore = new JRadioButton("ขอดูคะแนนบางส่วน");
		radiosomescore.setFont(font);
		radiosomescore.setBounds(302, 192, 170, 25);
		this.getContentPane().add(radiosomescore);
		
		radioallscore = new JRadioButton("ขอดูคะเเนนทั้งหมด");
		radioallscore.setFont(font);
		radioallscore.setBounds(302, 234, 170, 25);
		this.getContentPane().add(radioallscore);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioallscore);
		group.add(radiosomescore);
		
		btn = new JButton("next");
		btn.addActionListener(this);
		btn.setFont(font);
		btn.setBounds(644, 346, 129, 37);

		this.getContentPane().add(btn);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon("sci_logo.png"));
		lblNewLabel_2.setBounds(585, 37, 244, 299);
		this.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon("bg.jpg"));
		lblNewLabel_1.setBounds(0, 0, 882, 453);
		this.getContentPane().add(lblNewLabel_1);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//control.studentID(textField.getText());
		ReadFileStudent form = new ReadFileStudent();
		if(radiosomescore.isSelected()){
			String course = (String)combo.getSelectedItem();			
			ScoreFrame sf = new ScoreFrame();
			
		
			
		}else{
			//System.out.println("...");
			
			
		}
		
		this.setVisible(false);
		
	}
	
	
	
	
}


