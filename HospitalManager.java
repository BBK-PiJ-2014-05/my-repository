public class HospitalManager {
	private Patient PatientListStart = null;

	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();

		String name = args[0];
		int age = Integer.parseInt(args[1]);
		String illness = args[2];

		Patient patient1 = new Patient(name,age,illness);
		patient1.launch();

	}
		private void launch() {


			System.out.println(patient1.getName());

		}





}
