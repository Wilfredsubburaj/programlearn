package programlearn;

import java.util.Scanner;

public class numorder {
	public static void main(String[] args)
	    {
		    float x1,x2,x3;
		        Scanner in = new Scanner(System.in);
		        System.out.print("input 1");
		        x1=in.nextFloat();
		        System.out.print("input 2");
		        x2=in.nextFloat();
		       System.out.print("input 3 ");
		        x3=in.nextFloat();
		        if (x1<x2 &&x2<x3)
			        {
			            System.out.println("it is in increasing order");
			        }
		        else if (x1>x2 &&x2>x3)
			        {
			            System.out.println("it is in decreasing order");
			        }
		        else
			        {
			            System.out.println("neither in both increasing and decreasing order");
			        }

	}
}
