package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas", "Boston", "Chicago"};
		System.out.println(cities[0]);
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		do { 
			System.out.println(states[i++]);
		} while (i < 5);	
		// states[5] = "Washington"; // ->error

		int c = 0;
		while (c <= 4) {
			System.out.println(states[c++]);

		}
		System.out.println("FOR loop");

		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);

		}
	}

}
