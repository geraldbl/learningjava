package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		System.out.println("The " + number + "th Fibonnaci number is " + fibrecc(number));
		System.out.println("Factorial of " + number + " is " + factorial(number));
		System.out.println("Sum of the number 1 to " + number + " is " + sumnb(number));

				
	}
	
	public static int fib(int n) {
		int number1 = 0;
		int number2 = 0;
		if (n == 0) return 0;
		else {
			for (int i = 0; i <= n; i++) {
				int temp = number2;
				if (i == 1) {
					number1 = 0;
					number2 = 1;
				}
				number2 = number2 + number1;
				number1 = temp;
			}
			return number2;
		}
	}

	public static int fibrecc(int n) {
		if (n == 0) 	 return 0;
		else if (n == 1) return 1;
		return (fibrecc(n-1) + fibrecc(n-2));
	}
	
	public static int factorial(int n) {
		if (n == 0) return 1;
		else if (n == 1) return 1;
		else return n * factorial(n - 1);
	}
	
	public static int sumnb(int nb) {
		int sumnb = 0;
		for (int i = 1; i <= nb; i++) {
			sumnb += i;
		}
		return sumnb;
	}
}

