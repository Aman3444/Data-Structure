import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryTreeExample {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner input = new Scanner(System.in);
		int out;
		boolean quit = false;
		int choice;
		
		do {
			try {
				System.out.println("1.... Insert in the tree");
				System.out.println("2.... Pre-order the transversal");
				System.out.println("3.... In-order the transversal");
				System.out.println("4.... Post-order the transversal");
				System.out.println("5.... Height of tree");
				out = input.nextInt();

			switch (out) {

			case 1:
				System.out.println(" Enter the number to be inserted in tree");
				choice = input.nextInt();

				tree.insertInTree(choice);

				break;
			case 2:
				tree.displayPreOrder();

				break;
			case 3:

				tree.displayInOrder();
				break;
			case 4:
				tree.displayPosOrder();

				break;
			case 5:
				System.out.println("The height of the tree is "+ tree.height(tree.root));
				break;
			default:
				System.out.println("Invalid choice...try again");
				break;

			}

			System.out.println();
		} catch (InputMismatchException inputMismatchException) {
			input.next();
			System.out.println("invalid character");
		}

	} while (!quit);
	input.close();
	System.out.println("Bye.... See you again");
	}

}