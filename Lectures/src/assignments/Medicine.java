package assignments;

public class Medicine {
	int id;
	String name;
	String company;
	static int counter = 1;
	
	public Medicine(String name, String company) {
		System.out.println("In the Medicine class constructor");
		this.id = counter;
		counter++;
		this.name = name;
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Medicine id: " + this.id + " Medicine name is: " + this.name + " Medicine company is: " + this.company;
	}
	
	public void swap(Medicine m2) {
		int tempID = this.id;
		this.id = m2.id;
		m2.id = tempID;
		
		String tempName = this.name;
		this.name = m2.name;
		m2.name = tempName;
		
		String tempCompany = this.company;
		this.company = m2.company;
		m2.company = tempCompany;
	}
	
	public static void main(String[] args) {
		Medicine m1 = new Medicine("Paracetamol", "Cipla");
		Medicine m2 = new Medicine("Amoxicillin", "GSK");
		System.out.println(m1);
		System.out.println(m2);
		m1.swap(m2);
		System.out.println(m1);
		System.out.println(m2);		
	}
	
}
