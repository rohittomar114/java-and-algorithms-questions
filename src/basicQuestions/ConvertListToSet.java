package basicQuestions;

/*public class ConvertListToSet {}*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {
	public static void main(String[] args) {
		System.out.println("List values .....");
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("4");
		list.add("1");
		list.add("3");

		for (String temp : list) {
			System.out.print(" "+temp);
		}
		
		Set<String> set = new HashSet<String>(list);

		System.out.println("\n Set values ... are Sorted according to ascending Odered");
		for (String temp : set) {
			System.out.print(" "+temp);
		}

		LinkedHashSet<String> lhset = new LinkedHashSet<String>(list);

		System.out.println("\n LinkedHashSet values ... Remeber Entering order ");
		for (String temp : lhset) {
			System.out.print(" "+temp);
		}
	}
}