package object;

public class ObjectDemo {
	int i;
	
	public ObjectDemo(int i) {
		System.out.println("In ObjectDemo class constructor");
		this.i = i;
	}
	
	@Override
	public String toString() { //override from object class to represent actual contents of object
		return "Value of i is " + i;
	}
	
	@Override
	public boolean equals(Object obj) { //override from object class from actual content comparison
		ObjectDemo od = (ObjectDemo)obj;
		if(od.i == this.i) 
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		ObjectDemo od1 = new ObjectDemo(5);
		ObjectDemo od2 = new ObjectDemo(5);
		System.out.println(od1 == od2);
		System.out.println(od1.equals(od2));
	}
}
