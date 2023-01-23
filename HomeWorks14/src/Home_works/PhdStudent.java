package Home_works;

import java.util.Date;

public class PhdStudent extends GraduateStudent {
	
	public boolean qualifyinExamTaken;
	
	public PhdStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		
	}
	public void study() {
		
	}

	public void register() {
		System.out.println("phd  register ile geldim");
		
	}
	
	public void writeThesis() {
		
		System.out.println("phd  writethesis ile geldim");
	}
	
	public void meetWithAdvisor() {
		
		System.out.println("phd  meetwithadvisor ile geldim");
		
	}
	
	public void writePaper() {
		
		System.out.println("phd  writepaper ile geldim");
		
	}
}
