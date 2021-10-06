package controlstatement;

public class MCOC {
public static void main(String[]args)
{
	
	If_else b = new If_else() ;
	b.result(); 
	b.nested_if();
	b.if_else();
	b.if_and();
	b.odd_even();
	b.divisiblity();
	b.divisiblity(55);
	b.divisiblity(10);
	b.find_greater(10, 20);
	b.lowercase('c');
	b.uppercase('X');
	b.vowel_or_consonant('b');
	b.vowel_or_consonant('o');
	b.letter_or_splchar('-');
	b.letter_or_splchar('Z');
	
	Nested_If_Else v =  new Nested_If_Else();
	v.nested_if_else();
	v.nested_else();
	v.switch_case();
	v.nested_if("mohan@2830","mohan@2830");
}

}
