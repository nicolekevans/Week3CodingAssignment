package nameArray;

public class NameArrayExample {

	public static void main(String[] args) {
		/* Create an array of string called names that contains 
		 * "Tommy", "Tim", "Sally", "Buck", "Bob"*/
		
		String [] names = new String[5];
		
		names [0] = "Tommy";
		names [1] = "Tim";
		names [2] = "Sally";
		names [3] = "Buck";
		names [4] = "Bob";
		
		/* Use a loop to iterate through the array and calculate the average number
		 * of letters per name*/
		int totalLength = 0;
		
		for (int i = 0; i< names.length; i++){
			totalLength += names[i].length();
			}
		
		double averageLength = (double)totalLength/names.length;
		
		/* Print results */
		
		System.out.println("The average length of each name is " + averageLength + " letters.");
		
		/* Use a loop to concatenate all the names together separated by spaces*/
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		
		/* Create a new array int nameLengths and write a loop to iterate over 
		 * the previous array storing the length of each name in the new array*/
		
		int [] nameLengths = new int[5];
		
		for (int i = 0; i<nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			}
		
		/*Loop through nameLengths to calculate the sum of the lengths*/
		
		int sumOfLengths = 0;
		
		for (int nameLength : nameLengths) {
			sumOfLengths += nameLength;
			
		}
		System.out.println( "\n"+ "The sum of the lengths of the names is " + sumOfLengths + ".");
		
	}

}
