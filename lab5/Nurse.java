package lab5;

public class Nurse extends Surgeon {

	 public void administerMedicine() {
	        System.out.println("Nurse is apply medicine to the patient.");
	    
	}
	public static void main(String[] args) {
		Surgeon surgeon = new Surgeon();
        Nurse nurse = new Nurse();

        surgeon.treatPatient();
        surgeon.performSurgery();

        nurse.treatPatient();
        nurse.administerMedicine();

	}

}
