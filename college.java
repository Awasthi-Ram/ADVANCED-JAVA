 abstract class RGPV
{
	void btech()
	{
		System.out.println(" bteach from rgpv");
	}
	abstract void manager();
	abstract void manager2();
}
class college extends RGPV
{
	 void manager()
	{
		System.out.println("maneger of RGPV");
	}
	 void manager2()
	{
		System.out.println("maneger of RGPV");
	}
	void diploma()
	{
		System.out.println("self cource");
	}
	public static void main(String [] args)
	{
		college obj = new college();
             //   RGPV con = new RGPV(); // not able to create the object of abstact class
		//con.btech(); 
              obj.btech();
              obj.manager();
		obj.manager2();
	}
}

