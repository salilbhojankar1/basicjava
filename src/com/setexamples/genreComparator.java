package com.setexamples;
import java.util.Comparator;
public class genreComparator implements Comparator<Movies> {

	@Override
	public int compare(Movies m1, Movies m2)			//class for movies genre compare 
	{
		
		return m1.movie_genre.compareTo(m2.movie_genre);
	}

	
}
