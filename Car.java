package week1.day2.assignments;

public class Car {
	
	public static void main(String[] args) {
		Car obj = new Car();
		obj.applyBreak();
		obj.applyGear();
		obj.switchOnAc();
		obj.applyAcclerate();
	}
	
	public void applyBreak() {
		System.out.println("Break");
	}
	
	public void applyGear() {
		System.out.println("Gear");
	}
	
	public void switchOnAc() {
		System.out.println("AC ON");
	}
	
	private void applyAcclerate() {
		System.out.println("Accelerator");
	}	
}
