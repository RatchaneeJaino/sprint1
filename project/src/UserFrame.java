
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class UserFrame extends JFrame implements ActionListener{
	private JRadioButton teacher;
	private JRadioButton student;
	private ButtonGroup group = new ButtonGroup();
	private JLabel text;
	public static boolean check ;

	public UserFrame() {
		
		UserPanel panel = new UserPanel();
		BorderLayout b = new BorderLayout();
		GridLayout g = new GridLayout(0,1);
		
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
	
		text = new JLabel("สถานะของคุณคือ");
		teacher = new JRadioButton("อาจารย์/ผู้ช่วยสอน");
		student = new JRadioButton("นักศึกษา");
		
		teacher.addActionListener(this);
		student.addActionListener(this);
		
		Font font = new Font("Microsoft Sans Serif",Font.BOLD,30);
		teacher.setFont(font);
		student.setFont(font);
		text.setFont(font);


		teacher.setBackground(Color.WHITE);
		student.setBackground(Color.WHITE);
		
		group.add(teacher);
		group.add(student);
		
		p2.setBackground(Color.WHITE);
		p2.setLayout(g);
		p2.add(text);
		p2.add(teacher);
		p2.add(student);
		
		p3.setPreferredSize(new Dimension(280,220));
		p3.setBackground(Color.WHITE);
		
		p.add(p3);
		p.add(p2);
		p.setPreferredSize(new Dimension(280, 700));
		p.setBackground(Color.WHITE);
		
		this.setLayout(b);
		this.add(panel);
		this.add(p,BorderLayout.EAST);
		this.setSize(700,700);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(teacher.isSelected()){
			TeacherFrame teach = new TeacherFrame();
			check = true;
			this.setVisible(false);
		}else if(student.isSelected()){
			//Students s = new Students();
			StudentsFrame sf = new StudentsFrame();
			check = false;
			this.setVisible(false);
		}
		
	}
	
	
	public static void main(String[] args) {
		UserFrame frame = new UserFrame();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//ReadFileStudent form = new ReadFileStudent();
	
			}
		});
		
		/*final StudentsList model = new StudentsList();
		String num = "6009610015";
		for(int i=0; i < model.size() ;i++){
			if(num.equals(model.getID(i))){
				System.out.println(model.getID(i)+"  "+model.getName(i)+"   "+model.getEmail(i));
			}
		}*/
	}
	
	


}
