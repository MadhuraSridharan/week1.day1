package Assignment;

public class Car {
	public void applyBreak(){
		System.out.println("Break");
		
	}
	public void applyGear(){
		System.out.println("Gear");
	}
	public void switchonAc() {
		System.out.println("AC");
	}
	public void applyAcclerate() {
		System.out.println("speed");
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchonAc();
		obj.applyAcclerate();
		

	}

}
