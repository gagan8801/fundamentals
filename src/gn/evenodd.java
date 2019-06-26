package gn;
import java.util.*;
public class evenodd {
	private static Scanner a;

	public static void main(String args[])
	{
		a = new Scanner(System.in);
		int n=a.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}
		
		else 
		{
			System.out.println("odd");	
		}
}
}
