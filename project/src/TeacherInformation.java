
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TeacherInformation extends JFrame{
	private JPanel panelmain,panelstatus,panelbutton,paneltext,panelL;
	private JLabel labelteacher,labelstatus;
	private JButton buttonupload,buttonsave;
	private JTextArea textareaL,textareaR;
	private JScrollPane scrollL,scrollR;
	String id="",name="",mail="";
	StudentsList stdlist;
	//ArrayList<Students> liststd;
	public TeacherInformation() {
		// TODO Auto-generated constructor stub
		
		final StudentsList model = new StudentsList();
		stdlist = new StudentsList();
		//liststd = new ArrayList<Students>();
		panelmain = new JPanel();
		
		panelstatus = new JPanel();
		labelteacher = new JLabel("อาจารย์");
		
		
		panelstatus = new JPanel();
		labelstatus = new JLabel("สถานะ : ");
		panelstatus.add(labelstatus);
		
		panelbutton = new JPanel();
		buttonupload = new JButton("upload");
		buttonsave = new JButton("save");
		
		buttonupload.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					openFile();
				}catch(IOException e2){
					e2.printStackTrace();
				}
				
			}
		});
		buttonsave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					saveFile();
				}catch(IOException e2){
					e2.printStackTrace();
				}
				
			}
		});
		panelbutton.add(buttonupload);
		panelbutton.add(buttonsave);
		
		panelL = new JPanel();
		paneltext = new JPanel();
		textareaL = new JTextArea(20, 40);
		//textareaR = new JTextArea(10, 20);
		scrollL = new JScrollPane(textareaL);
		//scrollR = new JScrollPane(textareaR);
		panelL.add(scrollL);
		//panelR.add(scrollR);
		paneltext.add(panelL);
		//paneltext.add(panelR);
		
		this.setLayout(new BorderLayout());
		this.add(labelteacher,BorderLayout.NORTH);
		this.add(panelstatus);
		this.add(paneltext);
		this.add(panelbutton,BorderLayout.SOUTH);
		this.setTitle("Teacher Information");
		this.setSize(600, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	String opentext = "" ,writetext = "",savetext = "";
	public void openFile() throws IOException{
		JFileChooser chooser = new JFileChooser(".");
		int option = chooser.showOpenDialog(null);
		
		if(option == JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();
			FileReader reader = new FileReader(file);
			BufferedReader bufferR = new BufferedReader(reader);
			String str = bufferR.readLine();
			while(str != null){
				//System.out.println(str);
				opentext = opentext+str+"\n";
				str = bufferR.readLine();
				
				 
				
			}	
				cutDetailStudents(opentext);
				
				textareaL.setText(opentext);
				
				writetext = writetext+opentext;
				opentext = "";
				bufferR.close();
				reader.close();
			
		}
	}
	
	
	public void cutDetailStudents(String str){
		
		String arr[] = str.split(",");
		for(int i=0 ; i<arr.length ;i++){
			System.out.println(arr[i]);
		}
		
		
		
		/*String num = "6009610055";
		for(int i=0 ;i<text.length;i++){
			System.out.println(text[i]);
			stdlist.add(text[i], text[i], text[i]);
			if(stdlist.getID(i).equals(num)){
				System.out.println("-----");
				System.out.println("===="+stdlist.getName(i) + stdlist.getEmail(i));
			}else{
				//System.out.println("====");
			}
			String namearr[];
			String idarr[];
			String mailarr[];
				
			
			
			}*/
				//stdlist.add(, Name, Email);
			
		}
		
		
		/*
		for(int i=0 ; i<stdlist.size() ; i++){
			//stdlist.add(stdlist.getID(i), stdlist.getID(i), stdlist.getEmail(i));
			stdlist.add(text[0], text[1], text[2]);
			
			if(stdlist.getID(i).equals(num)){
				//id = id+stdlist.getID(i);
				name = name+stdlist.getName(i);
				mail = mail+stdlist.getEmail(i);
			}
			
		}*/
		
		//text[0] = s.getID();
		//text[1] = s.getName();
		//text[2] = s.getEmail();
		//System.out.println(text[0]+text[1]+text[2]);
		//id = id+text[0];
		//name = name+text[1];
		//mail = mail+text[2];
		//if(stdlist.getID(index))
		//System.out.println(stdlist.getID(index));
		//System.out.println(id + name + mail);
	
	
	
	
	public void saveFile() throws IOException{
		JFileChooser chooser = new JFileChooser(".");
		int option = chooser.showSaveDialog(null);
		
		if(option == JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();
			FileWriter writer = new FileWriter(file,false);
			PrintWriter printWriter = new PrintWriter(writer);
			printWriter.print(writetext);
			printWriter.close();
			writer.close();
		}
		
	}
	
	
	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getMail() {
		return mail;
	}


	public static void main(String[] args) {
		new TeacherInformation();
	}

}
