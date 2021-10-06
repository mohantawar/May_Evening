package oops;

public class Car extends Vehicle{
 public void start() {
	 System.out.println("please start with key");
	 
 }
 public void gear() {
	 System.out.println("four gear for controlling speed");
	 System.out.println("reverse gear ");
 }
 public void brake() {
	 System.out.println("apply brakes");
	 
 }
 public void new_method() {
	 System.out.println("General method");
 }
 public static void main(String[]args) {
	 Vehicle v = new Car(); // upcasting in abstraction
	 v.start();
	 v.gear();
	 v.brake();
	 System.out.println("----------------------------------------------------");
	 Car c = new Car();
	 c.gear();
	 c.brake();
	 c.start();
 }
}
