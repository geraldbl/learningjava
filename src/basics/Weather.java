package basics;

public class Weather {
	public static void main(String[] args ) {
		int temperature = 65;
		String sunCond = "Sunny";
				
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		}
		else if ((temperature > 60) && (sunCond == "Sunny")) {
			System.out.println("It's cooler. Wear shirt and pants");
			System.out.println("Wear a hat");
		}
		else if ((temperature > 50) || (sunCond == "Overcast")) {
			System.out.println("COOL DAY");
		}
		else {
			System.out.println("Cold day. Bring a sweater.");

		}
	}	
}
