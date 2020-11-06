package basics;

public class arrayfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tableau = {67, 3,5,9, 12, -7, 0, 99};
		System.out.println(tableau);
		System.out.println("Min: " + Minarray(tableau));
		System.out.println("Max: " + Maxarray(tableau));
		System.out.println("Average: " + Avearray(tableau));

		
	}
	
	public static int Minarray(int[] t) {
		int minarray = t[0];
		for (int i = 0; i < t.length; i++) {
			if (t[i] < minarray) minarray = t[i];
		}
		return minarray;
	}

	public static int Maxarray(int[] t) {
		int maxarray = t[0];
		for (int i = 0; i < t.length; i++) {
			if (t[i] > maxarray) maxarray = t[i];
		}
		return maxarray;
	}
	
	public static int Avearray(int[] t) {
		int sumarray = 0;
		for (int i = 0; i < t.length; i++) {
			sumarray += t[i];
		}
		if (sumarray != 0) 		return sumarray / t.length;
		else return 0;
	}
}
