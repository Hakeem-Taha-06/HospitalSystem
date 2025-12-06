package hospitalSystem;
import java.util.ArrayList;

public class HospitalSystem {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patients> patients = new ArrayList<Patients>();
	private ArrayList<Appointments> appointments = new ArrayList<Appointments>();
	
	
	public void addDoctor(String name, int ID, String email, String phoneNumber,
						DoctorSpecialization specialization, ArrayList<String> availableTime, RoomNum roomNum) {
		
		Doctor doctor = new Docotor(name, ID, email, phoneNumber, specialization, availableTime, roomNum);
				
		doctors.add(doctor);
		
	}
	
	public void addPatient(String name, int ID, String email, String phoneNumber, int medicalHistoryID) {

		Patien patient = new Patient(name, ID, email, phoneNumber, medicalHistoryID);
			
		patients.add(patient);

}
}
