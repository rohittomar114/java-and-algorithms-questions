package coreJavaInterview;

import java.util.HashMap;
import java.util.HashSet;

public class ObjecctsAsKeysInHashMap {
	
	public static void main(String srgs[]){
		
		Employee emp1 = new Employee("aa","11");
		Employee emp2 = new Employee("aa","11");
		
		HashMap<Employee, String> hm = new HashMap<Employee,String>();
		hm.put(emp1,"ss");
		hm.put(emp2,"ss");
		hm.put(emp1, "jj");
		
		System.out.println(" HashMap Size:-------" + hm.size() + " epm1{" + emp1.toString() + "}");
		
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp1);
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp1);		
		System.out.println("\n HashSet----Size:-------" + hs.size());	
	}
}

class Employee{
	
	String name,age;
	
	Employee( String name,  String age){
		
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString(){
		
		return ( "name :" + name +"," + " age :" + age );	
	}
}
