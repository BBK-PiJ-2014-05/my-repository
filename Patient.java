public class Patient {

private String name;
private int age;
private String illness;
private Patient nextPatient;
private Patient previousPatient;
private static int listLength = 0;


	Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.previousPatient = null;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
			newPatient.previousPatient = this;
			//System.out.println("This.name: " + this.name);
			//System.out.println("This.nextPatient.name: " + this.nextPatient.name);
			//System.out.println("newPatient.previousPatient.name: " + newPatient.previousPatient.name);
		} else {

			this.nextPatient.addPatient(newPatient);
		}
	}

	public String getNextPatientName() {
		return this.nextPatient.name;
	}

	public String getPreviousPatientName() {
		return this.previousPatient.name;
	}

	public boolean deletePatient(Patient patient) {
		if (this.nextPatient == null) {
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			this.nextPatient = nextPatient.nextPatient;
			this.nextPatient.previousPatient = this;

			return true;
		}
		else { return this.nextPatient.deletePatient(patient);
		}
	}

	public int getListLength() {
		listLength++;
		if (this.nextPatient == null) {
			return listLength;
		}
		else {
			return this.nextPatient.getListLength();

		}
	}

	public void printList() {
		if 	(this.previousPatient == null) {
			System.out.println("Beginning of list>>");
			System.out.println("this.name: " + this.name);
			System.out.println("nextPatient.name: " + this.nextPatient.name);
			this.nextPatient.printList();
		}

		else if	(this.nextPatient == null) {
			System.out.println("this.name: " + this.name);
			System.out.println("previousPatient.name: " + this.previousPatient.name);
			System.out.println("<<end of list");
		} else {
			System.out.println("This.name: " + this.name);
			System.out.println("nextPatient.name: " + this.nextPatient.name);
			System.out.println("previousPatient.name: " + this.previousPatient.name);
			this.nextPatient.printList();
		}
	}



}