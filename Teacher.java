public class Teacher {
	String designation = "Teacher";//set designation to teacher
	String collegeName = "DCCC";//set college name to DCCC
	void does() {
		System.out.println("Teaching");//then we print out this!
	}
}

class ComputerScienceTeacher extends Teacher {//child of Teacher class
	String mainSubject = "Java";//sets the main subject to java
	public static void main(String[] args) {
		ComputerScienceTeacher obj = new ComputerScienceTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	}
}