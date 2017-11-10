
import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	List<ScoreStudent> score;

	public ScoreList() {
		score = new ArrayList<ScoreStudent>();
	}
	public void add(String ID, String Name, String Final,String Quiz1,String Quiz2,String Quiz3,String Midterm){
		score.add(new ScoreStudent(ID,Name,Final,Quiz1,Quiz2,Quiz3,Midterm));
	}
	
	public String getID(int index){
		return score.get(index).getID();
		
	}
	
	public String getName(int index){
		return score.get(index).getName();
		
	}
	
	public String getFinal(int index){
		return score.get(index).getFinal();
		
	}
	
	public String getMidterm(int index){
		return score.get(index).getMidterm();
		
	}
	
	public String getQuiz1(int index){
		return score.get(index).getQuiz1();
		
	}
	
	public String getQuiz2(int index){
		return score.get(index).getQuiz2();
		
	}
	
	public String getQuiz3(int index){
		return score.get(index).getQuiz3();
		
	}
	
	public String getAll(int index){
		return score.get(index).getID();
		
	}
	
	public int size(){
		return score.size();
		
	}

}
