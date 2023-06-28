class Sunmicrosystem
{
	void java()
	{
		System.out.println("java program");
	}
	final void clang()
	{
		System.out.println("clang by sun microsystem");
	}
	
}
class Oracle extends Sunmicrosystem
{
	void clang()
	{
		System.out.println("clang by sun oracle");
	}
	void Dbms()
	{
		System.out.println("sql .... ");
	}
	public static void main(String[] args)
	{

		Oracle obj = new Oracle();
		obj.clang();
      }
	
}
