
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
		
			head = head.getNext();

			System.out.println("String is Successfully deleted from the head...");

		
		return removedOne;
	}

	
}