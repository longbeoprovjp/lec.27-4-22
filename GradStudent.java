package classmoment;

public class GradStudent extends Student{ 
	private String advisor;
	
	public GradStudent(String n, int id, double g, String adv) {
		super(n, id, g);
		advisor = adv;
	}
	public GradStudent() {
	}
	public void print() {
		super.Print();
		System.out.println(" " + advisor);
	}
	public void setAdvisor(String name) {
		advisor = name;
	}
	public String getAdvisor() {
		return advisor;
	}
	//override
	@Override
	public boolean fullTime() {
		if (credit >= 9) 
			return true;
		else
			return false;
	}
}
