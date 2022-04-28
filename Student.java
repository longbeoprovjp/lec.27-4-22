package classmoment;

public class Student {
//	private String stName;
//	private int stID;
//	private double gpa;
//	private int credit;
	
	protected String stName;
	protected int stID;
	protected double gpa;
	protected int credit;
	
	public static int stCount = 0;
	public static final String college = "SBCC";
	public Student() {}
	//constructor
	public Student(String n, int id, double g) {
		System.out.println("inside Student default constructor \n");
		stCount++;
	}
	//overload
	public Student(String n) {
		stName = n;
		stCount++;
	}
	//mutator or setter
	public void setName(String name) {
		stName = name;
		stCount++;
	}
	//accesor or getter
	public String getName() {
		return stName;
	}
	public void setID(int stID) {
		this.stID = stID;
	}
	public int getID() {
		return stID;
	}	
	public void setCredit(int c) {
		credit = c;
	}
	public int getCredit() {
		return credit;
	}
	public void setgpa(int g) {
		gpa = g;
	}
	public double getgpa() {
		return gpa;
	}
	public boolean fullTime() {
		if(credit>12) {
			return true;
		}
		else {
			return false;
		}
	}
	public void Print() {
		System.out.println("Student name is " + getName() + " ");
	}
	public static int getCount() {
		return stCount;
	}
}


