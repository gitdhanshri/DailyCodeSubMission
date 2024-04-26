import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    long sumOfDigits(long num){
    	   long sum=0;
	   while(num>0){
	   	   sum+=num%10;
	           num=num/10;
	    }
	    return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Codechef obj1=new Codechef();
	    long n=4;
	    long sum=obj1.sumOfDigits(n);
	    System.out.println(sum);
	}
}

