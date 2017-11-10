
public class ControlMnge {
	
	//StudentsFrame studentframe;
	StudentsList studentlist;
	public ControlMnge(StudentsList s) {
		// TODO Auto-generated constructor stub
		this.studentlist = s;
		
		
	}
	
	public void studentID(String str){
		//final StudentsList studentlist = new StudentsList();
		for(int i=0; i < studentlist.size() ;i++){
			if(str.equals(studentlist.getID(i))){
				System.out.println(studentlist.getID(i)+"  "+studentlist.getName(i)+"   "+studentlist.getEmail(i));
			}else{
				System.out.println("eroeeeee");
			}
		}
	}
	

	
	

}
