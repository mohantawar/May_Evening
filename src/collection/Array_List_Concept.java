package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List_Concept {

	public static void main(String[]args) {
		ArrayList<String>tvSeries = new ArrayList<>();
		tvSeries.add("Breaking bad");
		tvSeries.add("peaky blinders");
		tvSeries.add("Friends");
		tvSeries.add("Scam 1992");
		tvSeries.add("Mirzapur");
		
		//1.using for each and lamda exp
		tvSeries.forEach(shows ->{
			System.out.println(shows);
		});
		//2.using iterator
		System.out.println("******** 2.using iterator   ****************");
		Iterator<String>it = tvSeries.iterator();
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		//3.using iterator and java 8 lamda forEachRemaining()method
		
		System.out.println("***using iterator and java 8 forEachRemaining()method*****");
		it = tvSeries.iterator();
		it.forEachRemaining(shows ->{
			System.out.println(shows);
		});
		//4.using for loop
		System.out.println("****using for loop****");
		for(String shows:tvSeries) {
			System.out.println(shows);
		}
		// 5.using for loop with index or order
		System.out.println("****using for loop with index or order****");
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		//6.using list iterator to traverse in both direction
		System.out.println("****using list iterator to traverse in both direction****");
		ListIterator<String>tvSeriesListIterator =	tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
	}
}
