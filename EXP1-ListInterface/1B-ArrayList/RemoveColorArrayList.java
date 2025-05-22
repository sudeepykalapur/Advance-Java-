// 2. Write a java program for getting different colors through ArrayList interface and remove the
//    2nd element and color "Blue" from the ArrayList print input also

import java.util.*;
public class RemoveColorArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		//to remove the element at index 2
		ls.remove(2);
		System.out.println(ls);
		//to remove an element blue
		ls.remove("Blue");
		System.out.println(ls);
	}
}