package javaInterfacesExcercise;

interface Flyable {
	public void fly_obj();
}

class Spacecraft implements Flyable {

	@Override
	public void fly_obj() {
		System.out.println("is a spacecraft");
		
	}
	
}

class Airplane implements Flyable {

	@Override
	public void fly_obj() {
		System.out.println("is a airplane");
		
	}
	
}

class Helicopter implements Flyable {

	@Override
	public void fly_obj() {
		System.out.println("is a helicopter");
	}
	
}
public class FlyableDemo {
 public static void main(String[] args) {
     // Create instances of each class
     Flyable s = new Spacecraft();
     Flyable a = new Airplane();
     Flyable h = new Helicopter();

     // Call the interface method for each
     System.out.println("--- Flying Objects ---");
     s.fly_obj();
     a.fly_obj();
     h.fly_obj();
 }
}
