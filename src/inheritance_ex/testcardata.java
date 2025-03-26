package inheritance_ex;



public class testcardata {

	public static void main(String[] args) {
		Showroom sh1 = new Showroom();
		System.out.println(sh1.sh_id);
		System.out.println(sh1.sh_name);
		tata t1 = new tata();
		System.out.println(t1.t_id);
		System.out.println(t1.t_name);
		System.out.println(t1.t_price);
		t1.show();
		mahindra m1 = new mahindra();
		System.out.println(m1.m_id);
		System.out.println(m1.m_name);
		System.out.println(m1.m_price);
		m1.know();
		BMW b1 = new BMW();
		System.out.println(b1.b_id);
		System.out.println(b1.b_name);
		System.out.println(b1.b_price);
		b1.display();
		
	}

}
