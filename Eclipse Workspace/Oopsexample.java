package oopsprogram;

public class Oopsexample {
    class Bus { 
     public void display() 
     { 
 System.out.println("Bus Service"); 
     } 
    } 
class Van extends Bus 
{ 
  public void display() 
  { 
 System.out.println("Van Service"); 
 } 
 public int add(int BF, int VF) 
 { 
 return BF+VF; 
 } 
public double add(double BF,double VF) 
{ 
 return BF+VF; 
 } 
} 
class oopsconcept 
{ 
 public static void main(String[] args) 
 { 
 Bus a=new Bus(); 
  a.display(); 
  Van b=new Van(); 
 b.display(); 
 System.out.println(b.add(500,200)); 
 System.out.println(b.add(500.,200.)); 
 a=b; 
a.display(); 
 } 
} 
}