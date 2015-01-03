public class Supermarket {

public static void main(String[] args) {
	Supermarket tesco = new Supermarket();
	tesco.launch();
}

private void launch() {
	PersonQueue firstqueue = new QueueArray();
	testQueue(firstqueue);
	PersonQueue secondqueue = new QueuePointer();
	testQueue(secondqueue);
}

private void testQueue(PersonQueue queue) {
	System.out.println("Test initialized...");
	System.out.println("The size of the queue is: " + queue.getSize());
	Person ben = new Person("Ben", 68);
	queue.insert(ben);
	Person sean = new Person("Sean",52);
	queue.insert(sean);
	Person sam = new Person("Sam",40);
	queue.insert(sam);
	System.out.println("after adding 3 to the queue, size is: " + queue.getSize());
	System.out.println("The person at the end of the queue is: " + queue.peek().getName());
	queue.retrieve();
	System.out.println("After removing the person at the end of the queue the person at the top is now: " + queue.peek().getName());
	queue.retrieve();
	System.out.println("After removing the person at the end of the queue the person at the top is now: " + queue.peek().getName());
	System.out.println("After removing 2 people from the queue, the size is: " + queue.getSize());
	Person geoff = new Person("Geoff",40);
	queue.insert(geoff);
	System.out.println("After adding 1 to the queue the size of the queue now: " + queue.getSize());
	System.out.println("The person at the end of the queue is: " + queue.peek().getName());
	queue.retrieve();
	System.out.println("After removing the person at the end of the queue the person at the top is now: " + queue.peek().getName());
}

}




