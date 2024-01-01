
public class PartTimeEmployee extends Employee {

	private double hours;
	private double rate;
	
	public PartTimeEmployee(String name, int age, String address, String department, String designation, double hours, double rate) {
		super(name, age, address, department, designation);
		this.hours = hours;
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double salary() {
		return this.getHours() * this.getRate();
		
	}
	public String toString() {
		String info = new String();
		info = info + "Name	  : " + this.getName() + "\n";
		info = info + "Age	 : " + this.getAge() + "\n";
		info = info + "Deparment : " + this.getDepartment() + "\n";
		info = info + "Designation 	 : " + this.getDesignation() + "\n";
		info = info + "Hours  : " + this.getHours() + "\n";
		info = info + "Rate 	 : " + this.getRate() + "\n";
		
		return info;
	}

}