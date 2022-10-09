/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    double chef=(double)A/X;
		    double chefina=(double)B/Y;
		    if(chef<chefina){
		      System.out.println("Chef");   
		    }
		    else if(chef>chefina){
		      System.out.println("Chefina");   
		    }
		    else
		    System.out.println("Both"); 
		   
		}
	}
}
