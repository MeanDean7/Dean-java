package classWork;

import java.util.ArrayList;

public class Arraylist {
	public static void removeFirst(ArrayList<Integer> list) { //This method removes the first number in the array
		list.remove(0);
	}
	public static void main(String[] args) { 
		ArrayList<Integer> numbers = new ArrayList<Integer>();//we are making an array of numbers
		numbers.add(4);//we add these numbers
		numbers.add(3);
		numbers.add(7);
		numbers.add(3);
		
		System.out.println(numbers);//Print the numbers
		
		removeFirst(numbers); //Remove first number
		
		System.out.println(numbers); //This time 4 is missing
	}
}

