public class FullTimeEmployee extends Employee {

	private double basic;
	private double allowance;
	
	public FullTimeEmployee(String name, int age, String address, String department, String designation, double basic, double allowance) {
		super(name, age, address, department, designation);
		this.basic = basic;
		this.allowance = allowance;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public double salary() {
		return this.getBasic() + ( (this.getAllowance() / 100 ) * this.getBasic()) ;
		
	}
	public String toString() {
		String info = new String();
		info = info + "Name	  : " + this.getName() + "\n";
		info = info + "Age	 : " + this.getAge() + "\n";
		info = info + "Deparment : " + this.getDepartment() + "\n";
		info = info + "Designation 	 : " + this.getDesignation() + "\n";
		info = info + "Basic  : " + this.getBasic() + "\n";
		info = info + "Allowance 	 : " + this.getAllowance() + "\n";
		
		return info;
	}
}