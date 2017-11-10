
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class Students{

	/*
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<String> combo;
	private JRadioButton rdbtn;
	private JButton btn ;
	*/
	//////
	private String ID;
	private String Name;
	private String Email;
	
	public Students(){
		this.ID = ID;
		this.Name = Name;
		this.Email = Email;
	}
	public Students(String iD, String name, String email) {
		super();
		ID = iD;
		Name = name;
		Email = email;
	}

	/*
	public Students() {
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
		
		JLabel lblNewLabel = new JLabel("วิชา");
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(73, 87, 56, 16);
		this.getContentPane().add(lblNewLabel);
		
		String[] s = {"ตัวอย่าง"};
		combo = new JComboBox<>(s);
		combo.setBounds(189, 87, 171, 22);
		this.getContentPane().add(combo);

		rdbtn = new JRadioButton("ขอดูคะแนนบางส่วน");
		rdbtn.setFont(font);
		rdbtn.setBounds(302, 192, 170, 25);
		this.getContentPane().add(rdbtn);
		
		JRadioButton rd = new JRadioButton("ขอดูคะเเนนทั้งหมด");
		rd.setFont(font);
		rd.setBounds(302, 234, 170, 25);
		this.getContentPane().add(rd);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rd);
		group.add(rdbtn);
		
		btn = new JButton("next");
		btn.addActionListener(this);
		btn.setFont(font);
		btn.setBounds(644, 346, 129, 37);

		this.getContentPane().add(btn);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\monnta\\Desktop\\DLC\\sci_logo.png"));
		lblNewLabel_2.setBounds(585, 37, 244, 299);
		this.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\monnta\\Desktop\\DLC\\background-798290_960_720.jpg"));
		lblNewLabel_1.setBounds(0, 0, 882, 453);
		this.getContentPane().add(lblNewLabel_1);
	}
	*/
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if(rdbtn.isSelected()){
			String course = (String)combo.getSelectedItem();			
			ScoreFrame frame = new ScoreFrame();
			frame.setCourse(course);
		}else{
			System.out.println("...");
		}
		
		this.setVisible(false);
		
	}
	*/
	
	

}
