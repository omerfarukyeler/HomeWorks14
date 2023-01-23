package Home_works;

import java.util.Date;

public abstract class Student {
	
	public int no=1000;
	public String name = "omer";
	public int year=2023;
	public Date dob;
	public String major;
	
	public Student(int no,String name ,int year,Date dob,String major) {
		
		this.no=no;
		this.name=name;
		this.year=year;
		this.dob=dob;
		this.major=major;
		
	}
	
	public void study() {
		
		System.out.println("selam");
		
	}
	public abstract void register();
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major=" + major + "]";
	}
	
}
