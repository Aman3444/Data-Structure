import java.util.Scanner;

public class h{
	public static int doIt(int num) {

	    int total = 0;

	    for (int i = 1; i < num; i++) 

	        for (int j=num-i; j >0; j++)

	            total += j;

	    return total;

	}

	public static void main (String [] args) {

	    System.out.println (doIt(3));

	}
}