
public class LList {
	private LLNode head;

	public LList() {
		head = null;
	}

	public void addAtHead(String newData) {
		LLNode newNode = new LLNode(newData);
		newNode.updateNode(head);
		head = newNode;
	}

	public void display() {
		LLNode temp = head;
		if (head == null) {
			System.out.println(" There is Nothing to display");
		} else {

			while (temp != null) {
				System.out.println(temp);
				temp = temp.getNext();
			}
		}
	}

	public LLNode deleteAtHead() {
		LLNode removedOne = head;
		if (head == null) {

			System.out.println("There is Nothing to delete");
		} else {
			head = head.getNext();

			System.out.println("String is Successfully deleted from the head...");

		}
		return removedOne;
	}

	public void delete(String data) {
		LLNode tp;

		if (head == null) {
			System.out.println("There is Nothing to be delete");
		} else {

			tp = head;
			if

			(tp.toString().equals(data)) {

				head = tp.getNext();

			} else {

				LLNode link = tp;

				while (tp.getNext() != null) {

					link = tp;

					tp = tp.getNext();

					if (tp.toString().equals(data)) {
						link.updateNode(tp.getNext());

						break;
					}
				}
			}
			System.out.println("String is Successfully delete...");

		}

	}
}