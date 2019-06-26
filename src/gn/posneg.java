package gn;
import java.util.*;
public class posneg {
	private static Scanner a;

	public static void main(String args[])
	{
		a = new Scanner(System.in);
		System.out.println("enter n value");
	
		int n=a.nextInt();
		if(n > 0)
		{
			System.out.println("positive");
		}
		else if(n < 0)
		{
			System.out.println("Negative");
	}
		else 
		{
			System.out.println("Zero");	
		}
}
}
