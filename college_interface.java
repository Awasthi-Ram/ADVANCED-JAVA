 interface RGPV
{
	public void btech();
}
interface AKTU
{
	public void mtech();
	abstract void mba();
}
class college_interface implements RGPV ,AKTU
{
	public void mba()
	{
		System.out.println("mba  from aktu");
	}
	public void mtech()
	{
		System.out.println("mtech  from aktu");
	}
	public void btech()
	{
		System.out.println("btech from rgpv");
	}
	 
	void diploma()
	{
		System.out.println("self cource");
	}
	public static void main(String [] args)
	{
		college_interface obj = new college_interface();
             //   RGPV con = new RGPV(); // not able to create the object of abstact class
		//con.btech(); 
              obj.btech();
              obj.mtech();
		obj.mba();
	}
}

