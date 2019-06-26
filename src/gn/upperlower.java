package gn;

public class upperlower {
public static void main(String args[]) {
	char a='N',b;
	int c;
	if(a>=65&&a<=90)
	{
		c=a+32;
		b=(char)c;
		System.out.println(a+"->"+b);
	}
	else if(a>=97&&a<=122)
	{
		c=a-32;
		b=(char)c;
		System.out.println(a+"->"+b);
	}
}
}
