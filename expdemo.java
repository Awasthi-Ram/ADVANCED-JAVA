import java.util.*;

class expdemo
{
	void func1()
	{	
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter value 1");
			int var1 = sc.nextInt();
			System.out.println("enter value 2");
			int var2 = sc.nextInt();
			int res = var1/var2;
			System.out.println("res is "+ res);
		}
		catch(Exception e)
		{
			System.out.println("problem occur");
			System.out.println(e);
			System.out.println(e.getMessage());
		}
  		
		finally
		{
		System.out.println("no impact finally");
		}
		//System.out.println("no impact");
	}
	void func3()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int ar[] = new int[5];
			System.out.println("enter element in array");
			for (int i = 0 ; i< 5;i++)
			{
				ar[i] = sc.nextInt();
			}
			System.out.println("------------------------array element---------");
			for(int i =0 ;i<6; i++)
			{
				System.out.println(ar[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("catch block -----" + e);
		}
		finally
		{
    			System.out.println("finally block run");
		}
	}
	void func2()
	{
		System.out.println("second fun working");
	}
	public static void main(String args[])
	{
		expdemo obj = new expdemo();
		obj.func1();
		obj.func3();
		obj.func2();
	}
}

		
		