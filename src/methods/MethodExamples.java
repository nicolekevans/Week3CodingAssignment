package methods;

public class MethodExamples {

	public static void main(String[] args) {
		String concatenation = createConcatenation ("Hello", 3);
		System.out.println("The concatenation is: " + concatenation);
		
		String fullName = createFullName("John", "Doe");
		System.out.println("The full name is: " +fullName);
		
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 10;
		numbers[2] = 20;
		numbers[3] = 30;
		numbers[4] = 10;
		
		
		Boolean overOneHundred = findArraySum (numbers);
		System.out.println("The sum of the Array is over 100: " + overOneHundred);
		
		double [] firstArray = new double[3];
		firstArray[0] = 50;
		firstArray[1] = 10;
		firstArray[2] = 10;
		
		double [] secondArray = new double[2];
		secondArray[0] = 20;
		secondArray[1] = 15;
		
		Boolean isGreaterThan = isItGreaterThan (firstArray, secondArray);
		System.out.println("The first array average is larger than the second: " +isGreaterThan);
		
		boolean isHotOutside = true;
		double moneyInPocket = 1;
		
		Boolean buyDrink = willBuyDrink (isHotOutside, moneyInPocket);
		System.out.println("I will buy a drink: " + buyDrink);
		
		boolean assignmentsCompleted = false;
		double totalGrade = 67;
		
		Boolean willPass = willPassClass (assignmentsCompleted, totalGrade);
		System.out.println ("I will pass my class: " + willPass);

	}
	/* Write a method that takes a String word and an int n and returns the string 
	 * concatenated n # of times*/
	
	public static String createConcatenation (String word, int n) {
		String concatenation = word;
		for(int i = 1; i< n; i++ ){
			 concatenation += word; 
		}
		
		return concatenation;
	}
	
	/*Write a method that takes two Strings firstName and LastName and returns a fullName*/
	
	public static String createFullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	
	/* Write a method that takes an array of int and returns true if the sum of all
	 *  ints in the array is greater than 100*/
	
	public static boolean findArraySum (int[] numbers) {
		boolean overOneHundred;
		int sum = 0;
		for (int number : numbers) {
		 sum += number;	
		}
		if(sum>100) {
			overOneHundred = true;
		}
		else {
			overOneHundred = false;
		}
		return overOneHundred;
	}
	/* Write a method that takes two arrays of doubles and returns true if the average of
	 * the first array is greater than the average of the second*/
	
	public static boolean isItGreaterThan (double[] firstNumbers, double [] secondNumbers) {
		
		double firstSum=0;
		double secondSum = 0;
		
		boolean isGreaterThan;
		
		for (double firstNumber : firstNumbers) {
			firstSum += firstNumber;
		}
		for (double secondNumber : secondNumbers) {
			secondSum += secondNumber;
		}
		double firstAverage = firstSum/firstNumbers.length;
		double secondAverage = secondSum/secondNumbers.length;
		
		if (firstAverage > secondAverage ) {
			isGreaterThan = true;
		}
		else {
			isGreaterThan = false;
		}
		
		return isGreaterThan;	
		
	}
	
	/* Write a method called willBuyDrink that takes a boolean isHotOUtside and a 
	 * double moneyInPocket and returns true if Hot and moneyInPocket>10.50*/
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		
			boolean buyDrink;
			
		if (isHotOutside == true && moneyInPocket > 10.50) {
			buyDrink = true;
		}
		else {
			buyDrink= false;
		}
			return buyDrink;
		
		}
	
	
	/* Create a method that solves a problem and in comments write what the method 
	 * does and why you created it*/
		public static boolean willPassClass (boolean assignmentsFinished, double totalGrade){
		
		/* This will store a true or false represent passing(t) or failing (f)*/	
		boolean passClass;
		
		/* Can only pass if all assignments are finished and total grade is above 70;
		 * if statement checks if both are true and if so returns true, if either are
		 * false  it returns false*/
		if (assignmentsFinished == true && totalGrade > 70) {
			passClass = true;
		}
		else {
			passClass = false;
		}
		
		/*this returns true or false back to the main method*/
		return passClass;
		}
		
}
