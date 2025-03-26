package com.nestedclass;
//Example for anonymous Class
public class TestClass {

	public static void main(String[] args)
	{
		prokabaddi win_2024 = new prokabaddi() {
			
			void winner() {
				System.out.println("puneri paltan");
			}
			
		};
		win_2024.winner();
		
               prokabaddi win_2023 = new prokabaddi() {
			
			void winner() {
				System.out.println("jaipur");
			}
			};
			win_2023.winner();
	}
	
}


