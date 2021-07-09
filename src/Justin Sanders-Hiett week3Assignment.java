import java.util.Arrays;

public class week3Assignment {

	public static void main(String[] args) { 
		
		
		// Create an array of integers called ages
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 105}; 
		
		int firstMinusLast = ages[ages.length - 1] - ages[0];
		
		System.out.println(firstMinusLast);
		
		
		//for loop to calculate the average age in the array 
		int sum = 0; 
		
		
		for (int i = 0; i < ages.length; i++) {  
			sum += ages[i]; 
				 
		}
		 System.out.println(sum); 
		 
		 int average = sum / ages.length;   
		 
		 System.out.println(average);
		
		
		// Create array of string called names 
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; 
		
		int totalLetters = 0; 
		
		for (String name : names) { 
			totalLetters += name.length();
		}
		System.out.println(totalLetters);
		
		int averageNumLetters = totalLetters / names.length; 
		
		System.out.println(averageNumLetters);  
		
		//Iterate through array and concatenate all the names together, print to console. 
		String combinedNames = ""; 
		
		for (String name : names) { 
			combinedNames += (name + " "); 
			
		}
		System.out.println(combinedNames); 
		int[] nameLengths = new int[names.length]; 
		
		   
		for (int i = 0; i < names.length; i++) { 
			nameLengths[i] = names[i].length();
			
			 
			
		}
		System.out.println(Arrays.toString(nameLengths));
		
		
		//Method calls
		
		System.out.println(repeatWord("Hello", 3)); 
		
		System.out.println(fullName("Justin", "Hiett")); 
		
		System.out.println(overHundred(new int[] {3, 56, 32, 65})); 
		
		System.out.println(average(new double[] {15.0, 6.0, 5.0, 13.0})); 
		
		System.out.println(greaterArray(new double[] {45.0, 56.5, 75.6}, new double[] {23.5, 36.5, 23.6})); 
		
		System.out.println(willBuyDrink(false, 10.51)); 
		
		System.out.println(amountToSpend(100.00, new double[] {25.50, 50.35, 49.99}));
		
	}  
		
		//Personal method to calculate if the cost of groceries exceeded cash on hand balance.
	
		public static String amountToSpend(double cashOnHand, double groceryCost[]) {  
			double sumGroceries = 0.0; 
			double amountExceeded = 0.0;
			for (double x : groceryCost) {
				sumGroceries += x; 
			} 
			if (sumGroceries > cashOnHand); { 
				amountExceeded = 0 + sumGroceries - cashOnHand; 
			} 
			 
			
			return "You exceeded your cash on hand by " + amountExceeded + " Dollars";
		}
	
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { 
			if (isHotOutside == true && moneyInPocket > 10.50) { 
				return true;
			} 
			else {
				return false;
			}
		}
	
		public static boolean greaterArray(double array1[], double array2[]) {  
			double sum1 = 0.0; 
			double sum2 = 0.0; 
			double ave1 = 0.0; 
			double ave2 = 0.0; 
			
			for (double x : array1) { 
				sum1 += x; 
			} 
			for (double y : array2) { 
				sum2 += y; 
			} 
			
			ave1 = sum1 / array1.length; 
			ave2 = sum2 / array2.length; 
			
			if (ave1 > ave2) { 
				return true; 
			} 
			else {
				return false;
			}
		}
	
		public static int average(double numToAve[]) { 
			int sum = 0;  
			int ave = 0; 
			
			for (double num : numToAve) { 
				sum += num;
				
			} 
			ave = sum / numToAve.length; 
			
			return ave;
		}
		
		public static boolean overHundred(int number[]) { 
			int sum = 0;
			for (int num : number) { 
				sum += num;
			} 
			if (sum > 100) {
				return true;
			}
			else { 
				return false;
			}
		}
	
		public static String fullName(String firstName, String lastName) { 
			return firstName + " " + lastName;
		}
	
		public static String repeatWord(String word, int n) { 
			return word.repeat(n); 	 
			
		} 

		
		
		
		
}
		
		

	



  