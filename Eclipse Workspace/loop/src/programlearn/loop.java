package programlearn;

import java.util.Scanner;
public class loop {
	
	    public static void main(String args[])
	        {
	            System.out.println("Enter The number of sold items");
	            Scanner in =new Scanner(System.in);
	            int n=in.nextInt();
	            int i=1;
	            while(i<=n)
	            {
	                System.out.println("Items number :"+i);
	                i++;
	            }
	        }
	    }

