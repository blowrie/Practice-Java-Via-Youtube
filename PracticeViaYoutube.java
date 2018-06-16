import java.util.*;

class PracticeViaYoutube {
	public static void main(String[] args) {
		
		//Array Table
		System.out.println("Index\tValue");
		int[] values = {8, 13, 90, 79, 80};
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(i + "\t" + values[i]);
		}
		
		
		//Dice Roll
		int[] roll = new int[7];
		
		Random rand = new Random();
		
		for(int i = 0; i < 1000; i++) {
			
			++roll[1 + rand.nextInt(6)];
		}
		
		System.out.println("\nFace\tFrequency");
		
		for(int i = 1; i < roll.length; i++) {
			System.out.println(i + "\t" + roll[i]);
		}
		
		//Enhance Loops
		int total = 0;
		
		for(int x: values) {
			total+= x;
		}
		
		System.out.println("\n" + total + "\n");
		
		//Arrays in Methods
		change(values);
		
		for(int x: values) {
			System.out.println(x);
		}
		
		//MultiDemensional Arrays
		int exampleOne[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}};
		int exampleTwo[][] = {{1, 2, 3, 4, 5,}, {10}, {1, 2, 3}};
		
		System.out.println("This is the first array:");
		display(exampleOne);
		
		System.out.println("This is the second array:");
		display(exampleTwo);
		
		//Variable with multple arguments, Takes as many arguments as are put in
		System.out.println("\nThe Average Is: " + average(1, 5, 8, 20));
		System.out.println();
		
		//Time Class
		Time timeObject = new Time();
		System.out.println(timeObject.toMilitary());
		timeObject.setTime(13, 27, 6);
		System.out.println(timeObject.toMilitary());
		System.out.println(timeObject.toNormal());
		
		
} //End Brackets
	
	
	
	//Arrays in methods
	public static void change(int values[]) { 
		for(int counter = 0; counter < values.length; counter++) {
			values[counter]+= 5;
		}
	}
	//MultiDemensional Arrays
	public static void display(int x[][]) {
		for(int row = 0; row < x.length; row++) {
			for(int columns = 0; columns < x[row].length; columns++) {
				System.out.print(x[row][columns] + "\t");
			}
			System.out.println();
		}
	}
	
	//Multiple args
	public static int average(int...numbers) {
		int total = 0;
		for(int x: numbers) {
			total += x;
		}
		return total/numbers.length;
	}
	
}