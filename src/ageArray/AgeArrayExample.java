package ageArray;

public class AgeArrayExample {

	public static void main(String[] args) {
		/* Create an array of int ages that contains the values 3,9,23,64,2,8,28,93*/

		int [] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		/* Programmatically subtract the first number in the array from the last */
		
		int difference = (ages[ages.length-1]-ages[0]);
		
		System.out.println("The difference between "+ ages[ages.length-1] +" and "+ ages[0] + " is " + difference + ".");
		
		/* Add a new age to your array and repeat the step above */
		
		int [] ages1 = new int [9];
		ages1[0] = 3;
		ages1[1] = 9;
		ages1[2] = 23;
		ages1[3] = 64;
		ages1[4] = 2;
		ages1[5] = 8;
		ages1[6] = 28;
		ages1[7] = 93;
		ages1[8] = 45;
		
		/* repeating subtraction code*/
		int difference1 = (ages1[ages1.length-1]-ages1[0]);
		
		System.out.println("The new difference between "+ ages1[ages1.length-1] +" and "+ ages1[0] + " is " + difference1 + ".");
		
		/* use a loop to iterate through the array and calculate the average */
		
		int total =0;
		for(int i=0; i< ages.length;i++) {
			total += ages[i];
		}
		
		double average = (double)total / ages.length;
		
		/* Print the result */
		System.out.println("The average age of the original array is "+ average);
		

		
		
		
	}

}
;