
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StudentsList {
	List<Students> dataRow;

	public StudentsList() {
		dataRow = new ArrayList<Students>();
	}
	
	public void add(String ID, String Name, String Email){
		dataRow.add(new Students(ID,Name,Email));
	}

	public String getID(int index){
		return dataRow.get(index).getID();
	}
	
	public String getName(int index){
		return dataRow.get(index).getName();
	}
	
	public String getEmail(int index){
		return dataRow.get(index).getEmail();
	}

	public String getAll(int index){
		return dataRow.get(index).getID();
	}
	
	public int size(){
		return dataRow.size();
	}
	
	
	

}
