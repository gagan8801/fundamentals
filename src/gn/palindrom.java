package gn;
import java.util.*;
public class palindrom {
	public static void main(String[] args) {
        int num , r = 0, rem,i;
        Scanner s = new Scanner(System.in);
        num=s.nextInt();
        i = num;
        while( num != 0 )
        {
            rem = num % 10;
            r = r * 10 + rem;
            num  /= 10;
        }
        if (i == r)
            System.out.println(i + " is a palindrome.");
        else
            System.out.println(i + " is not a palindrome.");
    }
}

