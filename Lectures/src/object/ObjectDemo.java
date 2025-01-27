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
	
	@Override
	public void finalize() { //non-memory resources cleaning activity
		System.out.println("Cleaning up the object " + this.i);
	}
	
	public static void main(String[] args) {
		ObjectDemo od1 = new ObjectDemo(1);
		ObjectDemo od2 = new ObjectDemo(2);
//		System.out.println(od1 == od2);
//		System.out.println(od1.equals(od2));
		od1 = od2 = null; //reference nullifying
		
		ObjectDemo od3 = new ObjectDemo(3);
		od3 = new ObjectDemo(4); //reference optimization
		od3 = null; //reference nullifying
		System.gc(); //requesting garbage collector
	}
}
