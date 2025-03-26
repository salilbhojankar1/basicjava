package com.setexamples;

import java.util.Comparator;


public class movieRateComparator implements Comparator<Movies> {

	public int compare1(Movies m1,Movies m2) 
	{
		
		if (m1.movie_rating>m2.movie_rating) 
			{
				return 0;
			}
			else if(m1.movie_rating<m2.movie_rating) {
				return -1;
			}
			else {
				return 0;
			}
		
	

	}

	@Override
	public int compare(Movies o1, Movies o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
