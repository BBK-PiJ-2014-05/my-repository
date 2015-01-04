public class IntegerTreeNode {

private int value;
private IntegerTreeNode left;
private IntegerTreeNode right;



	IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public int getValue() {
		return value;
	}

	public int getNextRight() {
		return right.value;
	}

	public int getNextLeft() {
		return left.value;
	}

	public int getMax() {
		if (right == null) {
			return this.value;
		} else {
			return right.getMax();
		}
	}

	public int getMin() {
		if (left == null) {
			return this.value;
		} else {
			return left.getMin();
		}
	}



	public void add(int newNumber) {

		if (this.value < newNumber) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int num) {

		if (this.value == num) {
			return true;
		}

		if (this.value < num) {
			if (right == null) {
				return false;
			} else {
				return right.contains(num);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(num);
			}
		}
	}




}