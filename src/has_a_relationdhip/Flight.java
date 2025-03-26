package has_a_relationdhip;

public class Flight {
	String F_Id;
	String F_company;
	int F_code;
	String  F_Arrival;
	String F_departure;
	Airport Air;
	





	public Flight(String f_Id, String f_company, int f_code, String f_Arrival, String f_departure, Airport air) {
	
		this.F_Id = F_Id;
		this.F_company = F_company;
		this.F_code = F_code;
		this.F_Arrival = F_Arrival;
		this.F_departure = F_departure;
		this.Air = Air;
	}


	public void display()
	{
		System.out.println("Flight = "+F_Id+","+F_company+","+F_code+","+F_Arrival+","+F_departure);
		System.out.println("Airport= ");
		System.out.println(Air.A_Id+" "+Air.A_name+" "+Air.A_city );
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
