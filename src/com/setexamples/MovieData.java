package com.setexamples;
import java.util.Iterator;
import java.util.TreeSet; 
public class MovieData {

	public static void main(String[] args) {
		
		Movies m1 = new Movies("SALAR","Action",7.4,2023);
		Movies m2 = new Movies("KGF","Emotional",8.6,2019);
		Movies m3 = new Movies("SITA RAMAM","Romantic",8.4,2022);
		Movies m4 = new Movies("ANIMAL","Drama",6.4,2024);
		Movies m5 = new Movies("THE NUN","Horror/Thriller",7.9,2017);
		
		TreeSet<Movies> set = new TreeSet<Movies>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		
		
		Iterator<Movies> itr = set.iterator() ;
		while(itr.hasNext())
		{
			Movies m = itr.next();

			System.out.println("Movies Details: ");
			System.out.println("Movie Name: "+m.movie_name+" , "+"Year: "+m.year_of_release);
			System.out.println("Genre: "+m.movie_genre+" Rating: "+m.movie_rating);
			
			System.out.println( );
		
	}

}
}