package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		bookTitle = "The Lord of the Ring";
		if (bookTitle.contains("Ring")) {
			System.out.println("The book contains the word " + "Ring");
		}
		System.out.println(bookTitle.substring(0, 1));
		System.out.println(bookTitle.substring(4, 8));
		System.out.println(bookTitle.substring(12));

	}

}
