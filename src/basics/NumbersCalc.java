package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		printName("Start of Program");
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println("The product of numbers:" + numA + " and " + numB + " is ");
		int mult = multipleNumbers(numA, numB);
		printName(mult);
	}
	
	static void printName(String thingtoprint) {
		System.out.println(thingtoprint);
	}
	
	static void printName(int thingtoprint) { 
		System.out.println(thingtoprint);
	}
	
	static void addNumbers(int nbA, int nbB) {
		int sum = nbA + nbB;
		System.out.println("Sum:" + sum);
	}
	
	static int multipleNumbers(int nbA, int nbB) {
		int mult = nbA * nbB;
		return mult;		
	}
	
}
