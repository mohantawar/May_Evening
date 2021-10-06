package new_package;

public class CO2 {
	
		
		int r;
		
		public CO2 () {
			System.out.println("Hukka");
		}
		
		public CO2 (float p,String l) {

			r= 550;
			System.out.println("Water base hukka rate" + r);
			
		}
			public CO2 (String h) {
				r = 235;
				System.out.println("Milk base hukka"+ r);
			}
		public static void main(String[]args) {
			new CO2();
			new CO2(2.3f,"Teachers");
			new CO2("Hangover");
		}
			
			
		
		


}
