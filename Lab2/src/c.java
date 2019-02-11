import java.util.Random;

public class c {
    public static void main(String[] args) {
        Random r = new Random();
        int[] ar1 = new int[100];
        for(int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
            System.out.print(ar1[i] + "  ");
        }
    }
}