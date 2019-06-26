package gn;
import java.util.*;
public class reverse {
	private static Scanner s;

	public static void main(String[] args) {
        int num, r = 0;
        s = new Scanner(System.in);
        num=s.nextInt();
        while(num != 0) {
            int d = num % 10;
            r = r * 10 + d;
            num /= 10;
        }
        System.out.println("Reversed Number: " + r);
    }

}
