package usingswitch;

import java.util.Scanner;
public class usingswitch{
public static void main(String args[]) {
    String name;
       float percent,salary;
       double bp,gp,hra;
       int avg,total,ch;
       Scanner in=new Scanner(System.in);
       System.out.println("Enter Employee name ");
       name=in.nextLine();
       System.out.println("Enter Rank percentage ");
       percent=in.nextFloat();
       if(percent>=70)
       {
         System.out.println("You are in High Rank");
       }
           else
           {  System.out.println("You are in Medium Rank");
           }
       System.out.println("Enter your salary");
       salary=in.nextFloat();
      System.out.println("1.know your grosspay of this month");
       System.out.println("2.know your basic pay of this month");
       System.out.println("3.know your hraof this month");
       
       System.out.println("Enter your choice ");
       ch=in.nextInt();
       switch (ch)
       {
           case 1:
               gp=salary*0.6;
               System.out.println("the grosspay is"+gp);
             
           case 2:
               bp=salary*0.8;
               System.out.println("the basic pay is"+bp);
               break;
           case 3:
               hra=salary*0.4;
               System.out.println("the hra is"+hra);
               break;
               
           default:
               System.out.println("Invalid Selection");
               break;
       }
}
           }