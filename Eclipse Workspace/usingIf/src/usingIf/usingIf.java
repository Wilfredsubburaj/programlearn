package usingIf;

import java.util.Scanner;

public class usingIf{
     public static void main(String args[]) {
    	 String name;
            float percent;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter Employee name ");
            name=in.nextLine();
            System.out.println("Enter Rank percentage ");
            percent=in.nextFloat();
            if(percent>=70)
            {
              System.out.println("You are in High Rank");
            }
                
     }
                }