package Home_works;

import java.util.Date;

public class UndergraduateStudent extends Student{
	
	public UndergraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		
	}

	public String minor;

	@Override
	public void register() {
		System.out.println("undergraduate clasinin  register metodundan veri getirildi");
			
	}

	public void  study() {
		
		System.out.println("undergraduate clasinin  study metodundan veri getirildi");
		
		
	}
	
	@Override
	public String toString() {
		return "UndergraduateStudent [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major="
				+ major + "]";
	}
}
