
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileScore {

	public ReadFileScore() {
		final ScoreList sc= new ScoreList();
		
		String file = "c://Student//example.csv";

		try {
			BufferedReader br = new BufferedReader(new FileReader(
					file));
			String line;
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(",");
				sc.add(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
				
			}
			
			
			br.close();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		/*
		String num = "6009610015";
			for(int i=0; i<sc.size() ;i++){
				if(num.equals(sc.getID(i))){
					System.out.println("Name : "+sc.getName(i));
					System.out.println("ID : "+sc.getID(i));
					System.out.println("------Score----");
					System.out.println("Quiz1 : "+sc.getQuiz1(i));
					System.out.println("Quiz2 : "+sc.getQuiz2(i));
					System.out.println("Quiz3 : "+sc.getQuiz3(i));
					System.out.println("Quiz3 : "+sc.getMidterm(i));
					System.out.println("Final : "+sc.getFinal(i));
					System.out.println("-------------------------------");
				}
			}
	*/	
	}
	
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ReadFileScore form = new ReadFileScore();
				
			}
		});

	}*/
	
	

}
