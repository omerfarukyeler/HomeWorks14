package Home_works;

import java.util.Date;

public class GraduateStudent extends Student {
	
	public GraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	
	}

	public String advisor="var";
	
	public String thesis="gerekli";

	@Override
	public void register() {
		System.out.println("Graduate clasinın register metodu  ile veri getirildi.");
				
	}
	
	public void study() {
		
		System.out.println("Graduate clasinın study metodu  ile veri getirildi.");
		
	}
	
	public  void writeThesis() {
		System.out.println("Graduate clasinin writethesis metodu  ile veri getirildi.");
		
	}
	
	public void meetWithAdvisor() {
		
		System.out.println("Graduate clasinin meetwithadvisor metodu  ile veri getirildi.");
		
		
	}
	
	
	
	

}
