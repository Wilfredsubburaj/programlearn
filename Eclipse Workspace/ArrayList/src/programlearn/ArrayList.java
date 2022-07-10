package programlearn;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList {
	
	    public static void main(String args[])
	    {
	  
	  ArrayList<HashMap> studentList = new ArrayList<HashMap>();
	  HashMap<String,String> studentMap = new HashMap<String,String>();
	  studentMap.put("name","Wils" );
	  studentMap.put("id", "1");
	  
	  HashMap studentMap1 = new HashMap();
	  studentMap1.put("name","Antony" );
	  studentMap1.put("id", "2");
	  
	  HashMap studentMap2 = new HashMap();
	  studentMap2.put("name","Cyril" );
	  studentMap2.put("id", "3");
	  
	  studentList.add(studentMap);
	  studentList.add(studentMap2);
	  studentList.add(studentMap1);
	  
	  System.out.println(studentList.size());
	  
	    }
}
