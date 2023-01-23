package Home_works;

import java.util.Date;

public class MasterStudent extends GraduateStudent{

	public MasterStudent(int no, String name, int year, Date dob, String major) {
		super(no, "omer", year, dob, major);
		
	}
	public void study() {
		
		System.out.println("master study clasindan geldim");
		
		
	}
	public void register() {
		System.out.println("master register clasindan geldim");
		
	}
	
	public void writeThesis() {
		System.out.println("master writeThesis clasindan geldim");
		
		
	}
	public void meetWithAdvisor () {
		System.out.println("master meetWithAdvisor clasindan geldim");
		
		
	}
}
