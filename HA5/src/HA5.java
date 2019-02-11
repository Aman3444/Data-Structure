import java.util.*;

public class HA5 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
	
		Integer lastDigits, middleDigits, sum;
		String x;
		System.out.printf("Number\t\tLast two digits\t\tmiddle two digits\t\tlast digits of sum\n");
		for (int i = 145623; i <= 145723; i++) {

			int temp = i;
			sum = 0;
			for (int j = 0; j < 6; j++) {

				sum = sum + (temp % 10);
				temp = temp / 10;
			}
			
			lastDigits = i % 100;
			middleDigits = (i % 10000) / 100;
			if (lastDigits.toString().length() == 1) {
				System.out.println(i + "\t\t" + "0" + lastDigits + "\t\t\t" + middleDigits+"\t\t\t\t"+sum);
			} else if (middleDigits.toString().length() == 1) {
				System.out.println(i + "\t\t" + "0" + lastDigits + "\t\t\t" + "0" + middleDigits+"\t\t\t\t"+sum);
			} else if(sum.toString().length() == 1){
				System.out.println(i + "\t\t" + "0" + lastDigits + "\t\t\t" + "0" + middleDigits+"\t\t\t\t"+"0"+sum);
			}
			else {
				System.out.println(i + "\t\t" + lastDigits + "\t\t\t" + middleDigits+"\t\t\t\t"+sum);
			}

		}

	}

}
