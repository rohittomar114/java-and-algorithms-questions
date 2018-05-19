package coreJava.basicConceptsQuestions;

import java.util.HashMap;
import java.util.Map;

public final class ImutableClassCustomized{
	
	private final String name;
	private final int age;
	// Mutable Object
	private final HashMap<String,String> icMap;
	
	// Constructor need to be public
	public ImutableClassCustomized( String name, int age, HashMap<String, String> realMap){
		
		this.name = name;
		this.age = age;	
		//Create Temporary Map to perform deep copy
		HashMap<String,String> tempMap = new HashMap<String,String>();
		
		for (Map.Entry<String, String> map : realMap.entrySet()) {
			tempMap.put(map.getKey(), map.getValue());// Store Values in temporary Map
		}
		
		this.icMap = tempMap; // final Map equal to temporary Map
		//this.icMap = realMap; // Don't use Shallow copy
	}
	
	// Getters to Access data
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	// Access function for Mutable Object
	@SuppressWarnings("unchecked")
	public HashMap<String, String> gethMap() {
		return (HashMap<String, String>)icMap.clone();
	}
	
	public static void main(String[] agrs){
		HashMap<String, String> realMap = new HashMap<>();
		realMap.put("a", "AAAAA");
		realMap.put("b", "BBBBB");
		ImutableClassCustomized imc = new ImutableClassCustomized("Volcano", 26, realMap);
		System.out.println(imc.getName()+ " , " + imc.getAge()+ " , "+imc.gethMap());
		
		//Modify realHashMap
		realMap.put("c", "CCCCC");
		System.out.println(imc.getName()+ " , " + imc.getAge()+ " , "+imc.gethMap());
	}
	
}
