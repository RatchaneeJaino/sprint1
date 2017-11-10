
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TeacherFrame extends JFrame{
	
	private JLabel username;
	private JLabel pass;
	private JTextField usernameText;
	private JTextField passText;
	private JButton next;

	public TeacherFrame() {
		// TODO Auto-generated constructor stub

		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		Font font = new Font("Microsoft Sans Serif",Font.BOLD,20);

		username = new JLabel("Username :");
		pass = new JLabel("Password :");
		username.setFont(font);
		pass.setFont(font);
		
		usernameText = new JTextField(15);
		passText = new JTextField(15);
		
		next = new JButton("login");
		next.setFont(font);
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				TeacherInformation t = new TeacherInformation();
			}
		});
		
		p.add(username);
		p.add(usernameText);
		p.add(pass);
		p.add(passText);
		p2.add(next);

		
		this.add(p);
		this.add(p2,BorderLayout.SOUTH);
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
