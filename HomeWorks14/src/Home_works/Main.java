package Home_works;

public class Main {

	public static void main(String[] args) {
		
		RegistrationOffice registrationOffice = new RegistrationOffice();
		
		registrationOffice.getAStudent(new UndergraduateStudent(0, null, 0, null, null));
		
		registrationOffice.getAStudent(new VocationalStudent(0, null, 0, null, null));
		
		registrationOffice.getAStudent(new MasterStudent(0, null, 0, null, null));
		
		
		
		GraduateStudent graduateOffice = new GraduateStudent(0, null, 0, null, null);
		
		graduateOffice.meetWithAdvisor();
		
	}
}
