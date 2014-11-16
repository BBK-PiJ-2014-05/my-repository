public class Patient {

private String name;
private int age;
private String illness;
private Patient nextPatient = null;

	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
	}

	public void addPatient(Patient newPatient) {
			if (this.nextPatient == null) {
				this.nextPatient = newPatient;
			} else {
				this.nextPatient.addPatient(newPatient);
			}
		}
		public String getName() {
			return this.name;
		}


public static void main(String[]args) {
	String name = args[0];
	int age = Integer.parseInt(args[1]);
	String illness = args[2];
	Patient patient1 = new Patient(name,age,illness);
	System.out.println(patient1.name);
	Patient patient2 = new Patient("Harry",50,"Shingles");
	patient1.addPatient(patient2);
	System.out.println(patient1.nextPatient.name);
}
}