
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileStudent {
	public String mail,name,id;

	public ReadFileStudent() {
		/*
		final StudentsList model = new StudentsList();
		String file = "c://Student//student.xlxs";

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				//String[] arr = line.split(",");
				//model.add(arr[0],arr[1],arr[2]);
				
			}
			
			
			br.close();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		String num = "6009610015";
		for(int i=0; i < model.size() ;i++){
			if(num.equals(model.getID(i))){
				System.out.println(model.getID(i)+"  "+model.getName(i)+"   "+model.getEmail(i));
				mail = model.getEmail(i);
				name = model.getName(i);
			}}
		/*
		
		
		for(int i=0; i < model.size() ;i++){
				if(num.equals(model.getID(i))){
					System.out.println(model.getID(i)+"  "+model.getName(i)+"   "+model.getEmail(i));
					mail = model.getEmail(i);
					name = model.getName(i);
				}
			
		}
		*/
		
	}
	
	/*
	public String score(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ReadFileStudent form = new ReadFileStudent();
	
			}});
	}*/
		
	public void readfile() throws IOException{
		File file = new File("student.csv");
		FileReader reader = new FileReader(file);
		BufferedReader bufferR = new BufferedReader(reader);
		String str = bufferR.readLine();
		while(str != null){
			System.out.println(str);
			//opentext = opentext+str+"\n";
			str = bufferR.readLine();
		}	
			//textareaL.setText(opentext);
			//writetext = writetext+opentext;
			//opentext = "";
			bufferR.close();
			reader.close();
		
	
	}
	
	public void writefile(){
		
	}
	
	public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//ReadFileStudent form = new ReadFileStudent();
	
			//}
		//});
		new ReadFileStudent();
		

	}

}
