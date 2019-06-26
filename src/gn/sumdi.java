package gn;

import java.util.*; 

class sumdi { 
      
    private static Scanner s;

	static int getSum(int n) 
    { 
        int sum; 
  
        for (sum = 0; n > 0; sum += n % 10,  n /= 10); 
  
        return sum; 
    } 
  
    public static void main(String[] args) 
    { 
        int n; 
        s = new Scanner(System.in);
        n=s.nextInt();
        System.out.println(getSum(n)); 
    } 
} 