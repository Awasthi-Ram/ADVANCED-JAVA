class conInhbase
{
		conInhbase()
		{
         		System.out.println("base class i am");
		}
		conInhbase(int b)
		{
         		System.out.println("base class i am " + b + "'😭😭😭😭😭");
		}
}
class subclassinh extends conInhbase
	{
		subclassinh()
		{
		System.out.println(" i am 😂 small");

		}
		subclassinh( int a)
		{
		System.out.println(" i am 😂 small" + a + "😘😰");

		}
                subclassinh( int a,int b)
		{
		super(7);
		System.out.println(" i am 😂 small" + a + "😘😰"+74);

		}
		public static void main(String [] args)
		{

                  subclassinh obj = new subclassinh();
		subclassinh obj2 = new subclassinh(15);
		subclassinh obj3 = new subclassinh(15,78);
		}
	}
