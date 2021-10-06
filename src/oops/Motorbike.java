package oops;

public class Motorbike extends Vehicle{

	public void start() {
		System.out.println("Start with kick or selfstart");
	}
	public void gear() {
		System.out.println("apply the geaar");
	}
	public void brake() {
		System.out.println("please press peddle brake");
	}
	public static void main(String[]args) {
		Motorbike m = new Motorbike();
		m.start();
		m.gear();
		m.brake();
	}
}
