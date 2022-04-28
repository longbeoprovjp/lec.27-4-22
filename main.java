package classmoment;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Student aStudent = new Student();
		Student st1 = new Student();
	//	st1.stID = 10; only public stID works
		Student st2 = new Student("Long");
		Student st3 = new Student("Long");
		st1.setID(1234);
		st1.setName("Ngu");
		System.out.println(st1.getName());
		//System.out.println(st1.stID);
		System.out.println(st1.getID());
		
		st2.setCredit(15);
		if (st2.fullTime()) {
			System.out.println(st2.getName() + " is full-time");
		}
		else {
			System.out.println(st2.getName() + " is not full-time");
		}
		st2.Print();
		
		System.out.println("count = " + Student.getCount());
		System.out.println("count = " + st1.getCount());
		System.out.println("count = " + st2.getCount());
		GradStudent gst = new GradStudent();
		Student gStudent = new GradStudent();
		gst.setAdvisor("Allen");
		HighSchoolStudent hsSt = new HighSchoolStudent();
		gst.setName("Peter");
		gst.setCredit(10);
		if(gst.fullTime())
			System.out.println(gst.getName() + " is fulltime");
		else
			System.out.println(gst.getName() + " is not fulltime");
		GradStudent g2 = new GradStudent("Bob", 1010, 9.4, "Adams");
		g2.print();
		
		//important/new cool stuffs
		ArrayList<Integer> numers = new ArrayList<Integer>();//yes, Integer is capitalized
		ArrayList<Student> Students = new ArrayList<Student>();//Student is a class, so this is legal
		
		Students.add(aStudent);//cool, now we can add stuffs
		Students.add(st1);
		Students.add(st2);
		
		System.out.println(Students.get(1).getName()+ " is the student at index 1");//get the dude at the index 1
		
		Students.set(1, st2);//change the dude at 1 by some other dude
		System.out.println(Students.get(1).getName()+ " is the student at index 1");
		
		System.out.println(Students.size() + " is the size of student");//size() gives out how many dudes we got
		
		if (!Students.isEmpty())//isEmpty() checks whether there are no dudes
			System.out.println("list is not empty");
		
		Students.remove(1);//remove() helps to kick some dudes out, only one at time, u can use for loop to kick more tho
		System.out.println(Students.size() + " is the size of student");
		
		Students.clear();//clear() literally kicks everybody out
		System.out.println(Students.size() + " is the size of student");
	}

	}


