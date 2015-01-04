public class BinaryTree {

	public static void main(String[] args) {

		IntegerTreeNode startNode = new IntegerTreeNode(10);
		startNode.add(12);
		startNode.add(8);
		startNode.add(22);
		startNode.add(56);
		startNode.add(2);
		startNode.add(34);
		startNode.add(24);
		System.out.println("Is 22 in the tree? " + startNode.contains(22));
		System.out.println("Max value is: " + startNode.getMax());
		System.out.println("Min value is: " + startNode.getMin());
		startNode.toString();
	}
}