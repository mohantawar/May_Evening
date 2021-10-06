package firstProgram;

public class Fibonaci {

	public static void main(String[]args) {
		int previous =0;
		int next =1;
		int sum =0;
	//	sum = previous;
		System.out.println(sum);
		for(int i =0;i<10;i++) {
			previous=next;
			next= sum;
			sum= previous+next;
			System.out.println(sum);
		}
	}
}
