package com.setexamples;

public class Movies implements Comparable<Movies> {
	String movie_name;
	String movie_genre;
	double movie_rating;
	int year_of_release;
	
	
	
	public Movies(String movie_name, String movie_genre, double movie_rating, int year_of_release) {
	
		this.movie_name = movie_name;
		this.movie_genre = movie_genre;
		this.movie_rating = movie_rating;
		this.year_of_release = year_of_release;
	}
	
	
	
//	@Override
//	public int compareTo(Movies m) {								//use to campare movie rating				
//		if (movie_rating>m.movie_rating) 
//		{
//			return 0;
//		}
//		else if(movie_rating<m.movie_rating) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
		
		public int compareTo(Movies m) {							//use to campare year of release
			if (year_of_release>m.year_of_release) 
			{
				return 1;
			}
			else if(year_of_release<m.year_of_release) {
				return -1;
			}
			else {
				return 0;
			}
	
//	
//	public int compareTo(Movies m)								//use to campare movie name								
//	{																			
//		return movie_name.compareTo(m.movie_name);
//	}
}
}