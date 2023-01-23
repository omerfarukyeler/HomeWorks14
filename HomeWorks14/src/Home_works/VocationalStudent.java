package Home_works;

import java.util.Date;

public class VocationalStudent extends Student{

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		
	}
	
	@Override
	public void register() {
		System.out.println("ben vocational sinifinin register metodundan geldim .");
		
		
	}
	public void study() {
		
		System.out.println("ben vocational sinifinin study metodundan geldim" );
		
	}
	
	@Override
	public String toString() {
		return "VocationalStudent [no="+ no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major
				+ "]";
	}
	
	
}
