package lab5;

public class Surgeon extends Doctor {

	 public void performSurgery() {
	        System.out.println("Surgeon is performing surgery on the patient.");
	    }

	public static void main(String[] args) {
		Surgeon s = new Surgeon();
		s.treatPatient();
		s.performSurgery();

	}

}
