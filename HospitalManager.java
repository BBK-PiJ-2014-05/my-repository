public class HospitalManager {

private Patient patientListStart = null;

private void launch() {
	Patient p1 = new Patient("Ben",58, "Thyphoid");
	patientListStart = p1;
	//patientListStart.addPatient(p1);
	Patient p2 = new Patient("Sean", 52, "Cough");
	patientListStart.addPatient(p2);
	Patient p3 = new Patient("Sam", 40, "Murculie");
	patientListStart.addPatient(p3);
	Patient p4 = new Patient("Geoff",40,"Shingles");
	patientListStart.addPatient(p4);
	Patient p5 = new Patient("Theo",30,"Measles");
	patientListStart.addPatient(p5);
	Patient p6 = new Patient("Jenna",28,"Malaria");
	patientListStart.addPatient(p6);

	patientListStart.deletePatient(p2);

	System.out.println("List length: " + patientListStart.getListLength());
	patientListStart.printList();
}


public static void main(String[] args) {
	HospitalManager hm = new HospitalManager();
	hm.launch();


}
}