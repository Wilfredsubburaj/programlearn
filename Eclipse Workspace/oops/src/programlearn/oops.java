package programlearn;

class get {
	
	    public int test1,test2,test3;
	 
	  
	    int gett1() {
	        return test1;
	    }
	 
	    int gett2() {
	        return test2;
	    }
	    int gett3() {
	        return test3;
	    }
	 

	    void sett1(int te1) {
	        if (te1> 0)
	            test1=te1;
	        else
	            test1 = 0;
	    }
	    
	    void sett2(int te2) {
	        if (te2> 0)
	            test2=te2;
	        else
	            test2 = 0;
	    }
	    
	    void sett3(int te3) {
	        if (te3> 0)
	            test3=te3;
	        else
	            test3 = 0;
	    }
	 
	    int total() {
	        int sum = test1+test2+test3;
	        return sum;
	    }
	    int average() {
	        int avg = (test1+test2+test3)/3;
	        return avg;
	    }
	}
	 
	public class oops {
	    public static void main(String args[]) {
	        marks o = new marks();
	        o.sett1(80);
	        o.sett2(64);
	        o.sett3(85);
	        System.out.println("mark in test1" + o.gett1());
	        System.out.println("mark in test2" + o.gett2());
	        System.out.println("mark in test3" + o.gett3());
	       
	        System.out.println("total marks of the student " + o.total());
	        System.out.println("average of the student " + o.average());
	        
	    }
	}

