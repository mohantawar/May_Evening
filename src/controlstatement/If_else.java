package controlstatement;

public class If_else {
	
	public void result() 
	{
		int a =35;
		if(a>=35) {
			System.out.println("Result is passed");
		}
	}
public void nested_if() 
{
	int a =30;
	if(a>=18) {
		if(a<45) {
			System.out.println("eligible for vaccination");
		}
	}
}
public void if_else() {
	int a = 35;
	if(a>=35) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
}
public void if_and() {
	int a = 18;
	int b = 44;
	if(a>=18 && a<=45) {
		System.out.println("eligible for vaccination");
	}
	else {
		System.out.println("not eligible");
	}
}
public void odd_even() {
	int a = 10;
	if(a%2==0) {
		System.out.println("no is even");
	}
	else {
		System.out.println("no is odd");

	}
}
public void divisiblity() {
	int a = 12;
	if(a%5==0 || a%11==0) {
		System.out.println("no is divisible by 5 or 11 ");
}
	else {
		System.out.println("no is not divisible by 5 or 11");
	}
}
public void divisiblity(int a) {
	if(a%5==0 && a%11==0) {
		System.out.println("no is divisible by 5 and 11");
	}
	else {
		
	System.out.println("no is not divisible by 5 and 11");
	}
}
public void find_greater(int a,int b) {
	
	if(a>b) {
		System.out.println("a is greater than b");
	}
	else {
		System.out.println("b is greater than a");
	}
	
}
public void lowercase(char c) {
	if(c>= 97 && c<=122) {
		System.out.println("letter is lowercase");
		System.out.println(c);
	}
	else {
		System.out.println("letter is not lowercase");
		System.out.println(c);
	}
}
public void uppercase(char c) {
	if(c>=65 && c<=90) {
		System.out.println("letter is uppercase");
		System.out.println(c);
	}
	else {
		System.out.println("not uppercase");
		System.out.println(c);
	}
}
public void vowel_or_consonant(char c) {
	if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u'|c=='A'|c=='E'|c=='I'|c=='O'|c=='U') {
		System.out.println("letter is vowel");
		System.out.println("letter is vowel "+c);
	}
	else { 
		System.out.println("letter is consonant");
		System.out.println("letter is consonant "+c);
	}
}
public void letter_or_splchar(char c) {
	if((c>='a'&& c<='z')||(c>='A'&& c<='Z')) {
		System.out.println("entered character is letter");
		System.out.println(c);
		
	}
	else {
		System.out.println("entered character is special character");
		System.out.println(c);

	}
}

}
