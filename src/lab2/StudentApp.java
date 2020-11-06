package lab2;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student Gerald = new Student("Gerald", "012345678");
		
		Gerald.setInfo("+60666666666", "Kuala Lumpur", "Kuala Lumpur");
		System.out.println(Gerald.toString());
		Gerald.enroll("JAVA");
		Gerald.pay(5000);
		System.out.println(Gerald.toString());

	}
}

class Course {
	String name;
}
	
	
class Student {
	private static int iD=0;
	private static final String maildomain = "@blabla.co";
	String studentID;
	String name;
	String SSN;
	String email;
	private String phone;
	private String city;
	private String state;
	private double balance;
	Course[] course = new Course[10];
	
	
	Student(String name, String SSN) {
		int randomNb = (int) (Math.random() * (9000 - 1000) + 1000);
		System.out.println(randomNb);
		this.name = name;
		this.SSN = SSN;
		this.studentID = Integer.toString(iD) + randomNb + SSN.substring(SSN.length()-4);
		this.email = name + maildomain;
	}
	
	public void enroll(String CourseName) {
		int i = 0;
		boolean enrolled = false;
		do {
			if (course[i] == null) {
				course[i] = new Course();
				course[i].name = CourseName;
				enrolled = true;
			}
			else i++;
		
		} while (i <10 && !enrolled);
	}
	
	public void pay(double amount) {
		balance = balance + amount;
	}
	
	public double checkBalance() {
		return balance;
	}
	
	public void setInfo(String phone, String city, String state) {
		this.phone = phone;
		this.city = city;
		this.state = state;
	}
	
	private String courseslist() {
		String list = "";
		for (int i = 0; i < 10; i++) {
			if (course[i] != null) list = list + course[i].name;
		}
		if (list == "") return "None";
		else return list;
	}
	
	public String toString() {
		return "StudenID:" + studentID + "|Name:" + name + "|Phone:" + phone + "|Balance:" + balance + "|Courses:" + courseslist();
		
	}
}
