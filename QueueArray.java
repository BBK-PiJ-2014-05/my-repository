public class QueueArray implements PersonQueue {
/** simulates a queuing system at a supermarket checkout using arrays
*/
private Person[] personArray;
private int size;
private static int INITIAL_ARRAY_SIZE = 5;

public QueueArray() {
	 personArray = new Person[INITIAL_ARRAY_SIZE];
	 size = 0;
 }

public void insert(Person newPerson) {
	if (isAlmostFull()) {
		reserveMoreMemory();
	}
	personArray[size] = newPerson;
	size++;
}

public Person retrieve() {
	if (isEmpty()) {
		return null;
	}
	size--;
	Person result = personArray[0];
	for (int i = 0; i < size; i++) {
		personArray[i] = personArray[i+1];
	}
	personArray[size] = null;
	return result;
}

public Person peek() {
	if (isEmpty()) {
		return null;
	}
	Person result = personArray[0];
	return result;
}

public int getSize() {
	return size;
}

private boolean isAlmostFull() {
	if (personArray.length - size < 1) {
		return true;
	} else {
		return false;
	}
}

public boolean isEmpty() {
	if (size == 0) {
		return true;
	} else {
		return false;
	}
}

private void reserveMoreMemory() {
	Person[] LargerPersonArray = new Person[size * 2];
	for (int i = 0; i < size; i++) {
		LargerPersonArray[i] = this.personArray[i];
	}
	this.personArray = LargerPersonArray;
}
}

